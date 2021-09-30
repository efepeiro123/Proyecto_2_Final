/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos </h1>
 * @author 
 * @since3 3-octubre-2021
 * @version 2.0
 * @category Modelo
 */


 // Paquete defaults de java. 
import java.util.ArrayList;
import java.util.Random;


public class Sistema {
    //Atributos
    private TestLider testLider;
    private ArrayList<String> respuestasLidTemp;
    //private ArrayList<String> respuestasPsicoTemp;
    private Random rand;
    private String[] preguntasLid = new String[1];
    private String[] respuestasLid = new String[1];

   // private String[] preguntasPsico;
   // private String[] respuestasPsico;
    
    //Constructor
    //Revisar los returns porque solo hay un tipo de respuesta porque son 
    //son tipos de respuesta pero en el diseño no lo escribimos asi 
    // y ver el return del CSV


    public Sistema(){
        rand = new Random(); 
        testLider = new TestLider();
        respuestasLidTemp = new ArrayList<String>();
        //this.respuestasPsicoTemp = new ArrayList<String>();
    }

    public String[] generarTestLid(){
        preguntasLid = testLider.getListaLid();
        respuestasLid = testLider.getListaLidRespuestas();
        int max = preguntasLid.length - 1; 
        int min = 0;
        ArrayList<Integer> repetidos = new ArrayList<Integer>();
        repetidos.clear();
        int preguntasSolicitadas = 10;
        String [] obtenerPreguntas = new String[preguntasSolicitadas];
        for (int i = 0; i < preguntasSolicitadas; i++){
            Integer seleccionador = rand.nextInt((max - min ) + 1) + min;
            if(repetidos.contains(seleccionador)==false){
                repetidos.add(seleccionador); 
                obtenerPreguntas[i] = preguntasLid[seleccionador];
                respuestasLidTemp.add(respuestasLid[seleccionador]);
           }else{
               i--;
            }
        }

        
        return obtenerPreguntas;
    }
    // public String[] generarTestPsico(){

    //     return preguntasPsico;
    // }

    public String recibirRespuestasLid(String [] respuestasLid){
        int punteo = 0;

        for (int i = 0; i < respuestasLid.length; i++) {
            if(respuestasLidTemp.get(i).equals(respuestasLid[i])){
                punteo += 1;
            }
        }

        respuestasLidTemp.clear();
        return Integer.toString(punteo);
    }
    
    // public String[] recibirRespuestasPsico(){
    //     return respuestasLid;
    // }
    //Metodos Setters______________________________________________________
    //     public boolean setCV(){
    //         //return 
    //     }
}
