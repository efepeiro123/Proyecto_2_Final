import java.util.ArrayList;
import java.util.Random;


public class Sistema {
    
    //Atributos
    private TestLider testLider;
    private ArrayList<String> respuestasLidTemp;
    private ArrayList<String> respuestasPsicoTemp;
    private Random rand;
    private String[] preguntasLid;
    private String[] respuestasLid;
    private String[] preguntasPsico;
    private String[] respuestasPsico;
    
    //Constructor
    //Revisar los returns porque solo hay un tipo de respuesta porque son 
    //son tipos de respuesta pero en el diseño no lo escribimos asi 
    // y ver el return del CSV
    public Sistema(){
        rand = new Random(); 
        testLider = new TestLider();
        };
        this.respuestasLidTemp = new ArrayList<String>();
        this.respuestasPsicoTemp = new ArrayList<String>();
    }

    public String[] generarTestLid(){
        int max = 
        return preguntasLid;
    }
    public String[] generarTestPsico(){

        return preguntasPsico;
    }

    public String[] recibirRespuestasLid(){
        return respuestasLid;
    }
    
    public String[] recibirRespuestasPsico(){
        return respuestasLid;
    }
    //Metodos Setters______________________________________________________
    public boolean setCV(){
        //return 
    }
}
