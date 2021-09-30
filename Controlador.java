/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos </h1>
 * @author 
 * @since 12-septiembre-2021
 * @version 1.0
 * @category Controlador 
 */


public class Controlador {
    // --> Atributos
    private Vista vista;
    private Sistema sistema; // modelo
	private ModificadorCSV modificador;
	
	// Constructor
	public Controlador (){
		vista = new Vista();
        sistema = new Sistema();
	    modificador = new ModificadorCSV();
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
            
            switch (vista.menu()) {

            
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
						String [] preguntasObtenidas = sistema.generarTestLid();
                        String [] respuestasUsuario = new String[preguntasObtenidas.length];
						String[] datosPersona = vista.nuevoAspirante();
						
                        
                        vista.mostrarTest(preguntasObtenidas, respuestasUsuario);

                    
                        String respuestasFinales = sistema.recibirRespuestasLid(respuestasUsuario);

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
                        vista.invalido();
                    }

                break;									                					                
					
                case "2":
                    String opcionEmpleador = vista.menuEmpleadores();
                    tipoPersona = "Empleador"; 

                    /**
                    * Si selecciona la opcion 1 entonces vera los resultados 
                    */
                    if(opcionEmpleador.equals("1")){

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
