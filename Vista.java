/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> Vista (Clase de tipo Vista)  </h2>
 * 
 * 
 * Descripción: Esta clase mostrará toda la información que se necesite que 
 * sea vista por el usuario, tanto para dar instrucciones como para solicitar 
 * información o algún otro tipo de interacción.
 * 
 * 
 * @author Grupo 4 
 * @since3 3-octubre-2021
 * @version 1.0
 * @category  Vista
 */
 
import java.util.Scanner;

import javax.swing.AbstractSpinnerModel;

import java.util.ArrayList;

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
        System.out.println("\nLa igualdad laboral es el brindarle las mismas condiciones de trabajo tanto a");
        System.out.println("\nhombres como mujeres sin importar su genero, religión, etnia etcetera. La lucha");
        System.out.println("contra la desigualdad con respecto al sexo de los trabajadores es una batalla que");
        System.out.println("sigue en pie y esta igualdad es un derecho por el que se sigue luchando hoy en dia,");
        System.out.println("por favor tener en cuenta tomar una decision imparcial con respecto");
        System.out.println("al genero del aspirante.\n"); 
    }
    //Cierra las funciones del programa y muestra mensaje de despedida.
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
        System.out.println("1. Realizar examenes");
        System.out.println("2. Salir\n");

		op = sc.nextLine();
		return op;
		
	}
    
	public String menuEmpleadores(){
        System.out.println("\nEmpleador");   
        System.out.println("\n1. Ver resultados");
        System.out.println("\n2. Determinar Top de Aspirantes");
        System.out.println("\n3. Limpiar el CSV");
        System.out.println("\n4. Salir");
        
          

		return sc.nextLine();
    } 
/**
 * Se encarga de mostrar el resultado de los aspirantes solo mostrando su DPI y calificación
 * @param aspirantesarreglo es el arreglo que contiene los datos de cada aspirante.
 */
    public void mostrarListaResultados(ArrayList<String[]> aspirantesarreglo){

        System.out.println("Los resultados de los aspirantes son: ");
        
        for(int asp =0;asp<aspirantesarreglo.size();asp++){
            if(aspirantesarreglo.get(asp)[0]== null||aspirantesarreglo.get(asp)[0].equals("null")){ 
            }else{    
                System.out.println("DPI: " +aspirantesarreglo.get(asp)[0] + " ---- Puntuación de liderazgo: " +aspirantesarreglo.get(asp)[4]+ " ---- Puntuación de psicologico: " +aspirantesarreglo.get(asp)[5]+ " ---- Promedio de puntuación: " +aspirantesarreglo.get(asp)[6]);
            }
        }
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

    public void DivisionAsteriscos(){
        System.out.println("************************************************************************************");
    }

    public void DivisionGuiones(){
        System.out.println("------------------------------------------------------------------------------------");
    }

    public void DivisionLinea(){
        System.out.println("____________________________________________________________________________________");
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
        String[] informacion = new String[7];
        System.out.println("\nPorfavor ingrese los siguientes datos: ");
        System.out.println("\nDpi: ");
        dpi = sc.nextLine();

        System.out.println("\nNombre: ");
        nombre = sc.nextLine();

        System.out.println("\nNumero: ");
        numero = sc.nextLine();
        
        System.out.println("\nCorreo: ");
        correo = sc.nextLine();

        System.out.println("");

        informacion[0] = dpi;
        informacion[1] = nombre;
        informacion[2] = correo;
        informacion[3] = numero;

        return informacion; 

    }
    //Pedir contraseña a los empleadores
    public String preguntarContrasena(){
        System.out.println("\nPorfavor ingrese su contraseña");
        String contra = sc.nextLine();
        return contra;
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


    public int preguntarSeleccionados(int tamaño){
        System.out.println("¿Cuantos aspirantes desea ver?: ");
        int s = 0;
        int n = 1;
        while(n != 0){
            s = sc.nextInt();
            if(s == 0){
                System.out.println("Debe ingresar un numero mayor que 0");
            }
            else if(s > tamaño){
                System.out.println("El numero que ingreso es mayor al numero de aspirantes existentes");
            }
            else{
                n = 0;
            }
        }
        return s;
    }
//Pedir curriculum a los aspirantes
    public void  pedirCurriculum(){
        System.out.println("El correo asignado para enviar el curriculum es: Contrataciones@gmail.com");
        System.out.println("¿Ya ha enviado su curriculum al correo asignado? ingrese s para si o n para no :)");
        String si = "";
        int no = 1;
        while(no != 0){
            si = sc.nextLine();
            if(si.equals("s")||si.equals("S")){
                System.out.println("Gracias por haberlo enviado, puede continuar");
                no = 0;
            }
            else{
                System.out.println("Por favor envie su curriculum al correo asignado");
            }
        }
    } 

    public void mensajeConcientizacionAspirante (){   // LINEA 63
        System.out.println("Los mas valioso de ustedes es su honestidad y disciplina, no se preocupe por los demás factores.");
    } 
    
    public void mensajeConcientizacionEmpleador(){  // LINEA 127
        System.out.println("Lo más importante de un aspirante es su desempeño profesional, no se preocupe por nimiedades.");
    } 
}
