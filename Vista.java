/**
 * <h1> Proyecto Integrador - Programa de contratación 
 * <h2> Programación Orientada a Objetos </h1>
 * @author
 * @since 12-septiembre-2021
 * @version 1.0
 * @category Vista 
 */
 
import java.util.Scanner;

public class Vista{
    // Atributos
	Scanner sc = new Scanner(System.in);

    public Vista(){

    }
//Mensaje de bienvenida al programa.
    public void bienvenida(){
        System.out.println("\n------- Bienvenido al programa de contratación es un gusto tenerte aquí hoy -------\n");
    }

    public void mensajeConcientizacion(){
        System.out.println("\nLa igualdad es un derecho por el que se sigue luchando hoy en dia, por favor tener en cuenta tomar una decision imparcial con respecto al genero del aspirante.");
    }
    //Cierra las funciones del programa y muestra mensaje de bienvenida.
    public void salir(){
        System.out.println("\nGracias por la preferencia nos vemos pronto.");
    }
    //Menú principal.
    public String menu(){
        
        System.out.println("\n¿Usted es un Aspirante o Empleador?:");
        System.out.println("\n1. Aspirante");
        System.out.println("\n2. Empleador\n");

		return sc.nextLine();
	}
    public String menuAspi(){
		String op;
        System.out.println("\nAspirante");
        System.out.println("Ingrese el numero de la opcion que desea realizar\n");
        System.out.println("1. Realizar test psicologico");
        System.out.println("2. Realizar test lider");
        System.out.println("3. Salir");

		op = sc.nextLine();
		return op;
		
	}

	public String menuEmpleadores(){
        System.out.println("\nEmpleador");   
        System.out.println("\n1. Ver resultados");
        System.out.println("\n2. Determinar Top de Aspirantes");
        System.out.println("\n3. Salir");
          

		return sc.nextLine();
    } 
    //Muestra las preguntas instanciadas en Sistema de la clase TestLider.
    public void mostrarTest(String[]test, String [] respuestasU){
        String respuesta;
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
            respuesta = sc.nextLine();
            respuestasU[i] = respuesta.toUpperCase();
        }
        // String [] info = respuestasU;
        // System.out.println(info);
        // System.out.print(test);
       // return respuestasU;
    }

    /**
     * Metodo para mostrar cualquier tipo de información
     * @param informacion
     */
    public void verInformacion(String informacion){
        System.out.println(informacion);
    }

    
     //Pedir al usuario los nuevos aspirantes que han tomado los Tests. 
    public String[] nuevoAspirante(){
        String dpi, nombre, numero, correo;
        String[] informacion = new String[4];
        System.out.println("\nPorfavor ingrese los siguientes datos: ");
        System.out.println("\nDpi: ");
        dpi = sc.nextLine();

        System.out.println("\nNombre: ");
        nombre = sc.nextLine();

        System.out.println("\nNumero: ");
        numero = sc.nextLine();
        
        System.out.println("\nCorreo: ");
        correo = sc.nextLine();

        informacion[0] = dpi;
        informacion[1] = nombre;
        informacion[2] = correo;
        informacion[3] = numero;

        return informacion; 

    }
     //Mensaje de error que se le muestra al usuario.
    public void invalido(){

    }
    //Información de un aspirante DPI y puntuaciones de ambas pruebas.
    public void verAspirantes(){

    }
     //Le informa al usuario que debe mandar su CV.
    public String setCV(){
        boolean enviado = false;

        System.out.println("\nYa a enviado su CV?\n1. Si\n2. No");
        while(!enviado){
        System.out.println("\nPorfavor enviar su CV al correo BuenosEmpleos@gmail.com");
        }
        System.out.println("\nGracias por enviar su CV :) ");
        return sc.nextLine(); 
    }	 
}
