import java.io.File;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException; 
import java.util.ArrayList;; 

//La clase contendrá los archivos CSV de los aspirantes y contraseñas de los empleadores.
public class ModificadorCSV {
    private String estadoARchivo;
    private String encabezado;



    public ModificadorCSV(){
        
    }


    public void ordenarASpirantes(){

    }

    // public boolean VerificarContrasenia(){

    //     return variable; //Esta variable sería la booleana de retorno
    // }

    public void limpiarNoAceptados(){

        
    }

    public void limpiarCompleto(){

    }

    

    //Almacena los datos del nuevo aspirante ingresado al sistema. 
    public void agregarAspirante(String[] datosPersona){
        ArrayList<String[]> aspirantesArray = new ArrayList<String[]>();
        aspirantesArray.add(datosPersona);
        File aspirantes = new File("aspirantes.csv"); //Nombre del archivo CSV el cual contendrá a los aspirantes
			try{
				FileWriter fw = new FileWriter(aspirantes);
				BufferedWriter bw = new BufferedWriter(fw);
                bw.write("DPI"+","+"Nombre"+","+"Número"+"Correo"+"Calificación");//Encabezado
				bw.newLine();
				for(int o=0;o<aspirantesArray.size();o++){
					bw.write(aspirantesArray.get(o)[0]+","+aspirantesArray.get(o)[1]+","+aspirantesArray.get(o)[2]+","+aspirantesArray.get(o)[3]);
					bw.newLine();
				}
				bw.close();
				fw.close();
					
			}
			catch(IOException e){
				e.printStackTrace(); 
			}

    }

    // public String mostrarAspirtantes(){

    //     return variable; //Esta variable tendría los aspirantes a ver.
    // }


}
