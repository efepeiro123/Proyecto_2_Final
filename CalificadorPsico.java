import java.util.ArrayList;

interface SistemaCalificador{

    String recibirRespuestas(String [] respuestas, ArrayList<String> respuestasCorrectas);
}

public class CalificadorPsico extends Sistema implements SistemaCalificador{
    
    public String recibirRespuestas(String [] respuestas, ArrayList<String> respuestasCorrectas){
        int punteo = 0;
        for (int i = 0; i < respuestas.length; i++) {
            if(respuestasCorrectas.get(i).equals(respuestas[i])){
                punteo += 1;
            }
        }
        return Integer.toString(punteo); 
    }
// Override del método generarTest ()
}
