// interfaz del sistema
interface SistemaGenerarTest{

    String[] recibirRespuestas();
}

public class CalificadorLid extends Sistema implements SistemaCalificador{
    
    public String [] recibirRespuestas(String [] respuestasLid, ArrayList<String> respuestasCorrectasLid){
        int punteo = 0; 
    for (int i = 0; i < respuestasLid.length; i++) {
        if(respuestasCorrectasLid.get(i).equals(respuestasLid[i])){
            punteo += 1;
        }
    }
    return Interger.toString(punteo);
}
// Override del método generarTest ()
}