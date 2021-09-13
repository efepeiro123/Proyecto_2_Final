import java.util.ArrayList;
import java.util.Random;

public class Sistema {
    //Atributos__________________________________________________________
    private ArrayList<String> respuestasLidTemp;
    private ArrayList<String> respuestasPsicoTemp;
    private Random rand;
    private String[] preguntasLid;
    private String[] respuestasLid;
    private String[] preguntasPsico;
    private String[] respuestasPsico;
    
    //Constructor________________________________________________________
    //Revisar los returns porque solo hay un tipo de respuesta porque son 
    //son tipos de respuesta pero en el diseño no lo escribimos asi 
    // y ver el return del CSV
    public Sistema(){
        this.respuestasLidTemp = new ArrayList<Sting>();
    }
    public String[] generarTestLid(){
        return preguntasLid;
    }
    public String[] generarTestPsico(){
        return preguntasPsico;
    }

    public String[] recibirRespuestas(){
        return respuestasLid;
    }
    //Metodos Setters______________________________________________________
    public boolean setCSV(){
        //return 
    }
}
