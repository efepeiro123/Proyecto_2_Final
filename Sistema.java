/** 
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> Sistema (Forma parte del Modelo) </h2>
 * 
 * 
 * Descripción: Relaciona las clases de TestPsico, TestLider y Controlador. 
 * Se encarga de seleccionar las preguntas de manera aleatoria de los test de 
 * Líder y Psicología; además, este contará con las respuestas a las preguntas 
 * que posteriormente se enviarán a la clase a ModificadorCSV. Mayormente contará
 * con ArrayList.
 * 
 * 
 * @author Grupo 4 
 * @since3 3-octubre-2021
 * @version 1.0
 * @category Modelo 
 */
import java.util.ArrayList;
import java.util.Random;


public abstract class Sistema {
    //Atributos
    protected Test test = new Test();
    protected ArrayList<String> respuestasTemp = new ArrayList<String>();
    //protected ArrayList<String> respuestasPsicoTemp = new ArrayList<String>();
    protected Random rand = new Random();
    protected String[] preguntas = new String[1];
    protected String[] respuestas = new String[1];
   // protected String[] preguntasPsico;
   // protected String[] respuestasPsico;
    
    //Constructor
    //Revisar los returns porque solo hay un tipo de respuesta porque son 
    //son tipos de respuesta pero en el diseño no lo escribimos asi 
    // y ver el return del CSV
    public Sistema(){
        //rand = new Random(); 
        //test = new Test();
        //respuestasTemp = new ArrayList<String>();
        //this.respuestasPsicoTemp = new ArrayList<String>();
    }

    //public String[] generarTestLid(){
    //    preguntas = test.getListaLid();
    //    respuestas = test.getListaLidRespuestas();
    //    int max = preguntas.length - 1; 
    //    int min = 0;
//
    //    int preguntasSolicitadas = 10;
    //    String [] obtenerPreguntas = new String[preguntasSolicitadas];
    //    for (int i = 0; i < preguntasSolicitadas; i++) {
    //        int seleccionador = rand.nextInt((max - min ) + 1) + min; 
    //        obtenerPreguntas[i] = preguntas[seleccionador];
    //        respuestasTemp.add(respuestas[seleccionador]);
    //    }
    //    return obtenerPreguntas;
    //}
    //// public String[] generarTestPsico(){
//
    ////     return preguntasPsico;
    //// }
//
    //public String recibirRespuestas(String [] respuestasLid){
    //    int punteo = 0;
//
    //    for (int i = 0; i < respuestasLid.length; i++) {
    //        if(respuestasTemp.get(i).equals(respuestasLid[i])){
    //            punteo += 1;
    //        }
    //    }
//
    //    respuestasTemp.clear();
    //    return Integer.toString(punteo);
    //}
    
    // public String[] recibirRespuestasPsico(){
    //     return respuestasLid;
    // }
    //Metodos Setters______________________________________________________
    //     public boolean setCV(){
    //         //return 
    //     }
}