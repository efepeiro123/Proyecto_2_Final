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

    // --> Atributos e instancias de clases.
    private Vista vista; // vista
    private Sistema sistema; // modelo
	private ModificadorCSV modificador; //modelo 
	
	// Constructor
	public Controlador (){

        // Objetos
		vista = new Vista();
        sistema = new Sistema();
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
        String tipoPersona = "";  
        boolean terminar = false;

        do {
            
            switch (vista.menu()) {  // En relacion con la respuesta int del usuario.

            
                case "1":
                    vista.DivisionAsteriscos();
                    String opcionAspirante = vista.menuAspi();
                    tipoPersona = "Aspirante"; 

                    /**
                    * Si selecciona la opcion 1 entonces realizara el test psicologico
                    */
                    if(opcionAspirante.equals("1")){

                    }

                    /**
                    * Si selecciona la opcion 2 entonces realizara el test de capacidadees 
                    */
                    else if(opcionAspirante.equals("2")){
                    

                        vista.DivisionAsteriscos();
						String [] preguntasObtenidas = sistema.generarTestLid();     // Llamado al arreglo con las preguntas del Test Lider. 
                        String [] respuestasUsuario = new String[preguntasObtenidas.length];   // Arreglo que almacena las respuesta del usuario.
						String[] datosPersona = vista.nuevoAspirante();  // Informacion del nuevo aspirante.
						
                        
                        vista.mostrarTest(preguntasObtenidas, respuestasUsuario);

                    
                        String respuestasFinales = sistema.recibirRespuestasLid(respuestasUsuario);  // Respuestas del usuario a las preguntas de Test Lide. 

						datosPersona[4] = respuestasFinales;

						modificador.agregarAspirante(datosPersona);
                        //vista.verInformacion(respuestasFinales);
                    }

                    /**
                    * Si selecciona la opcion 3 entonces se termina el programa
                    */
                    else if(opcionAspirante.equals("3")){
                        vista.salir(); //mensaje de despedida
                        terminar = true;
                    }

                    else{
                        vista.invalido(); // Mensaje de error para el usuario.
                    }

                break;									                					                
					
                case "2":
                    String opcionEmpleador = vista.menuEmpleadores();
                    tipoPersona = "Empleador"; 

                    /**
                    * Si selecciona la opcion 1 entonces vera los resultados 
                    */
                    if(opcionEmpleador.equals("1")){
                        ArrayList<String[]> aspirantesarreglo = new ArrayList<String[]>();
                        aspirantesarreglo = modificador.prepararCSV();
                        vista.DivisionAsteriscos();
                        vista.mostrarListaResultados(aspirantesarreglo);
                        vista.DivisionAsteriscos();
                    }

                    /**
                    * Si selecciona la opcion 2 entonces podra pedir cuantos aspirantes quiere escoger
                    */
                    else if(opcionEmpleador.equals("2")){

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

                break;	
            
                default:
                    vista.invalido(); //Si ingresa una opcion invalida
                    break;
            }
            
        } while (!terminar);
    }

}
