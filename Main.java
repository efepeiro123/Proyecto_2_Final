/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> Main  </h2>
 * 
 * 
 * Descripción: Se encargará de ejecutar todo el programa con sus 
 * correspondientes clases y además, en esta clase se instancia el 
 * controlador para ejecutar todo el programa. 
 * 
 * 
 * @author Grupo 4 
 * @since3 3-octubre-2021
 * @version 1.0
 * @category Main
 */


public class Main {
 
    public static void main(String[] args) {
        Controlador ctrl = new Controlador(); //Llama al controlador
        ctrl.menu(); //Se muestra el menu

    }
}