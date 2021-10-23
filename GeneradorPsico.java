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
    
    public ArrayList<String> getRespuestasPsico (){
        return respuestasTemp; 
    }
}
