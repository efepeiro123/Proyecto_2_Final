/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> GeneradorPsico  </h2>
 * 
 * 
 * Descripción: Esta clase genera el test de liderazgo y hereda de la clase Sistema
 * 
 * 
 * 
 * @author Grupo 4 
 * @since3 3-octubre-2021
 * @version 1.0
 * 
 */

/**
* Librerias
*  */
import java.util.ArrayList;

//INTERFAZ
interface SistemaGenerarTest{

    String[] generarTest();
}

public class GeneradorLid extends Sistema implements SistemaGenerarTest{
 
    @Override
    public String[] generarTest() {

        // TODO Auto-generated method stub
        //return null;
        preguntas = test.getListaLid();
        respuestas = test.getListaLidRespuestas();
        int max = preguntas.length - 1; 
        int min = 0;
        ArrayList<Integer> repetidos = new ArrayList<Integer>();
        repetidos.clear();
        int preguntasSolicitadas = 10;
        String [] obtenerPreguntas = new String[preguntasSolicitadas];
        for (int i = 0; i < preguntasSolicitadas; i++) {
            Integer seleccionador = rand.nextInt((max - min ) + 1) + min;
            if(repetidos.contains(seleccionador)==false){
                repetidos.add(seleccionador); 
                obtenerPreguntas[i] = preguntas[seleccionador];
                respuestasTemp.add(respuestas[seleccionador]);
           }else{
               i--;
            }
        }
        return obtenerPreguntas;
    }

    public ArrayList<String> getRespuestasLid(){
        return respuestasTemp;
    }
}
