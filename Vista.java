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
//Mensaje de bienvenida al programa.
    public void bienvenidad(){
        System.out.println("\nBienvenido al programa de contratación es un gusto tenerte aquí hoy.");
    }
    //Cierra las funciones del programa y muestra mensaje de bienvenida.
    public void salir(){
        System.out.println("\nGracias por la preferencia nos vemos pronto.");
    }
    //Menú principal.
    public String menu(){
        
        System.out.println("\nUsted es un Aspirante o Empleador?:");
        System.out.println("\n1. Aspirante");
        System.out.println("\n2. Empleador");

		return sc.nextLine();
	}
    public String menuAspi(){
		String op;
        System.out.println("\nAspirante");
        System.out.println("\nRealizar test psicologico");
        System.out.println("\nRealizar test lider");
        System.out.println("\nSalir");

		op = sc.nextLine();
		return op;
		
	}

	public String menuEmpleadores(){
        System.out.println("\nEmpleador");   
        System.out.println("\nVer resultados");
        System.out.println("\nDeterminar Top de Aspirantes");
        System.out.println("\nSalir");
          

		return sc.nextLine();
    } 
    //Muestra las preguntas instanciadas en Sistema de la clase TestLider.
    public void mostrarTest(String[]test){

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
