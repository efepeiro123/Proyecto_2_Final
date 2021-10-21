import java.util.ArrayList;

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
        int preguntasSolicitadas = 10;
        String [] obtenerPreguntas = new String[preguntasSolicitadas];
        for (int i = 0; i < preguntasSolicitadas; i++) {
            int seleccionador = rand.nextInt((max - min ) + 1) + min; 
            obtenerPreguntas[i] = preguntas[seleccionador];
            respuestasTemp.add(respuestas[seleccionador]);
        }
        
        return obtenerPreguntas;
    }

    public ArrayList<String> getRespuestasLid(){
        return respuestasTemp;
    }
}
