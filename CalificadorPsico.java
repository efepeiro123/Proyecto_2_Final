interface SistemaCalificador{

    String[] recibirRespuestas();
}

public class CalificadorPsico extends Sistema implements SistemaCalificador{
    
    public String [] recibirRespuestas(String [] respuestasPsi, ArrayList<String> respuestasCorrectasPsico){
    for (int i = 0; i < respuestasPsi.length; i++) {
        if(respuestasCorrectasPsico.get(i).equals(respuestasPsi[i])){
            punteo += 1;
        }
    }
}
// Override del método generarTest ()
}
