/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> TestPsico (Forma parte del Modelo) </h2>
 * 
 * 
 * Descripción: Esta clase tiene las preguntas del test psicológico, 
 * los cuales serán llamados al sistema, al controlador y finalmente a 
 * la vista para que el usuario pueda responderlas. 
 * 
 * 
 * @author Grupo 4 
 * @since3 3-octubre-2021
 * @version 1.0
 * @category Modelo 
 */

public class TestPsico {
    //Atributos
    private String[] ListaPsico;
    private String[] ListaPsicoRespuestas;


    //Constructor
    public TestPsico(){

    }
    
    //Metodos

    //--->Getters
    public String[] getListaPsico() {
        return ListaPsico;
    }

    public String[] getListaPsicoRespuestas() {
        return ListaPsicoRespuestas;
    }
}
