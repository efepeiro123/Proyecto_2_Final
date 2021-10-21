import java.util.ArrayList;

public class GeneradorPsico extends Sistema implements SistemaGenerarTest{
 
    @Override
    public String[] generarTest() {
        // TODO Auto-generated method stub
        //return null;
        preguntas = test.getListaPsico();
        respuestas = test.getListaPsicoRespuestas();
        int max = preguntas.length - 1; 
        int min = 0;
        int preguntasSolicitadas = 10;
        String [] obtenerPreguntas = new String[preguntasSolicitadas];
        for (int i = 0; i < preguntasSolicitadas; i++) {
            int seleccionador = rand.nextInt((max - min ) + 1) + min; 
            obtenerPreguntas[i] = preguntas[seleccionador];
            respuestasTemp.add(respuestas[seleccionador]);
        }
        
        return obtenerPreguntas;
    }
    public ArrayList<String> getRespuestasPsico (){
        return respuestasTemp; 
    }
}
