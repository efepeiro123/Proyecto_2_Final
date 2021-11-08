import java.util.ArrayList;

/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> Controlador (Clase de tipo controlador) </h2>
 * 
 * 
 * Descripción: Esta clase se comunicará con el modelo (Sistema, modificadorCSV, test) 
 * y se comunicará con la clase Vista. Como su nombre lo dice controlará el programa
 *  encargándose de que vista y modelo se comuniquen.
 * 
 * 
 * @author Grupo 4 
 * @since3 3-octubre-2021
 * @version 1.0
 * @category Controlador 
 */


public class Controlador {
    // --> Atributos
    private Vista vista; // vista
    private GeneradorLid sistemaGeneradorLid;
    private GeneradorPsico sistemaGeneradorPsico; // modelo
    private CalificadorLid sistemaCalificadorLid;
    private CalificadorPsico sistemaCalificadorPsico;
	private ModificadorCSV modificador; //modelo 

    
	
	// Constructor
	public Controlador (){
		vista = new Vista();
        sistemaCalificadorPsico = new CalificadorPsico();
        sistemaCalificadorLid = new CalificadorLid();
        sistemaGeneradorLid = new GeneradorLid();
        sistemaGeneradorPsico = new GeneradorPsico();
	    modificador = new ModificadorCSV();

        // Determinacion de los metodos de cada clase.   
        vista.DivisionAsteriscos();
        vista.bienvenida();
        vista.mensajeConcientizacion();
        vista.DivisionAsteriscos();
        
	}

     /**
     * M�todo menu para tener el control del programa
     */
	public void menu(){
        modificador.prepararCSV();
        String tipoPersona = "";  
        boolean terminar = false;

        do {
            
            switch (vista.menu()) {

            
                case "1":
                vista.DivisionAsteriscos();
                String opcionAspirante = vista.menuAspi();
                tipoPersona = "Aspirante"; 

                /**
                * Si selecciona la opcion 1 entonces realizaran ambos test
                */
                if(opcionAspirante.equals("1")){
                
                    //****************Lid ******************************/
                    vista.verInformacion("En este momento realizará el examen de habilidades de liderazgo.\n");
                    vista.DivisionAsteriscos();
                    String [] preguntasObtenidasLid = sistemaGeneradorLid.generarTest();     // Llamado al arreglo con las preguntas del Test Lider. 
                    String [] respuestasUsuarioLid = new String[preguntasObtenidasLid.length];   // Arreglo que almacena las respuesta del usuario.
                    String[] datosPersona = vista.nuevoAspirante();  // Informacion del nuevo aspirante.
                    
                    
                    vista.mostrarTest(preguntasObtenidasLid, respuestasUsuarioLid);

                    ArrayList<String> respuestasCorrLid = sistemaGeneradorLid.getRespuestasLid();
                    String respuestasFinalesLid = sistemaCalificadorLid.recibirRespuestas(respuestasUsuarioLid, respuestasCorrLid);  // Respuestas del usuario a las preguntas de Test Lide. 
                    System.out.println(respuestasFinalesLid);
                    

                    datosPersona[4] = respuestasFinalesLid;
                    vista.verInformacion("\nHa completado el examen de habilidades de liderazgo. En este momento realizara el examen psicologico.\n");
                    //modificador.agregarAspirante(datosPersona);
                    

                    //*********psico *********************************/
                    vista.DivisionAsteriscos();
                    String [] preguntasObtenidasPsico = sistemaGeneradorPsico.generarTest();     // Llamado al arreglo con las preguntas del Test Lider. 
                    String [] respuestasUsuarioPsico = new String[preguntasObtenidasPsico.length];   // Arreglo que almacena las respuesta del usuario.
                    
                    
                    vista.mostrarTest(preguntasObtenidasPsico, respuestasUsuarioPsico);

                    ArrayList<String> respuestasCorrPsico = sistemaGeneradorPsico.getRespuestasPsico();
                    String respuestasFinalesPsico = sistemaCalificadorPsico.recibirRespuestas(respuestasUsuarioPsico, respuestasCorrPsico);  // Respuestas del usuario a las preguntas de Test Lide. 
                    System.out.println(respuestasFinalesPsico);

                    datosPersona[5] = respuestasFinalesPsico;
                    datosPersona[6] = Double.toString((Double.parseDouble(respuestasFinalesPsico) + Double.parseDouble(respuestasFinalesLid))/2); // Promedio de las notas 
                    
                    modificador.agregarAspirante(datosPersona);
                    vista.verInformacion("\nHa finalizado el examen psicologico. Agradecemos mucho su participacion. Sera contactado por medio de la informacion de contacto brindada en caso de ser seleccionado.\n");

                }

                /**
                * Si selecciona la opcion 3 entonces se termina el programa
                */
                else if(opcionAspirante.equals("2")){
                    vista.salir(); //mensaje de despedida
                    terminar = true;
                }

                else{
                    vista.invalido(); // Mensaje de error para el usuario.
                }

            break;									                					                
					
                case "2":
                tipoPersona = "Empleador";
                ArrayList<String[]> contras = modificador.prepararContrasenas();
                String con = vista.preguntarContrasena();
                int a = 0;
                for(int i = 0; i<contras.size();i++){
                    if(contras.get(i)[0].equals(con)){
                        
                        vista.verInformacion("Bienvenido!\n");
                        a=1;
                        i = contras.size()+1;
                     }
                 }

                    /**
                    * Si selecciona la opcion 1 entonces vera los resultados 
                    */
                    if(a==1){
                    String opcionEmpleador = vista.menuEmpleadores();
                    tipoPersona = "Empleador"; 
                    if(opcionEmpleador.equals("1")){
                        ArrayList<String[]> aspirantesarreglo = new ArrayList<String[]>();
                        aspirantesarreglo = modificador.getAspirantesArreglo();
                        vista.DivisionAsteriscos();
                        vista.mostrarListaResultados(aspirantesarreglo);
                        vista.DivisionAsteriscos();
                    }

                    /**
                    * Si selecciona la opcion 2 entonces podra pedir cuantos aspirantes quiere escoger
                    */
                    else if(opcionEmpleador.equals("2")){
                        int seleccion = vista.preguntarSeleccionados(modificador.getSizeAspirantes());

                        ArrayList<String[]> orden = modificador.promediosOrdenados(seleccion);

                        vista.mostrarListaResultados(orden);
                    }

                    /**
                    * Si selecciona la opcion 3 entonces se termina el programa
                    */
                    else if(opcionEmpleador.equals("3")){
                        vista.salir(); //mensaje de despedida
                        terminar = true;
                    }
                

                    else{
                        vista.invalido();
                    }
                }else{
                    vista.verInformacion("Contrasena incorrecta");
                }

                break;	
            
                default:
                    vista.invalido(); //Si ingresa una opcion invalida
                    break;
            }
            
        } while (!terminar);
    }

}
