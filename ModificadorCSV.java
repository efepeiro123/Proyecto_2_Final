import java.io.File;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException; 
import java.util.ArrayList;



import java.io.FileNotFoundException;


//La clase contendrá los archivos CSV de los aspirantes y contraseñas de los empleadores.
public class ModificadorCSV {
    private String estadoARchivo;
    private File path = new File("/Proyecto_2_Final/aspirantesNuevo.csv"); //Nombre del archivo CSV el cual contendrá a los aspirantes
 

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
    /**
     * Se encarga de guardar los datos por fila en un arraylist el cual luego será utilizado por guardar los datos del nuevo aspirante.
     * @return aspirantesarreglo Es el ArrayList que guarda los datos de las filas del CSV.
     */
    public ArrayList<String[]> prepararCSV(){
        ArrayList<String[]> aspirantesarreglo = new ArrayList<String[]>();
		String line = "";
		
		try{
            BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine())!= null){
				String[] values = line.split(",");
				aspirantesarreglo.add(values);
			}
            br.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
        return aspirantesarreglo;
    }
    

    /**
     *  Almacena los datos del nuevo aspirante ingresado al sistema utilizando como base el arralist enviado por el metodo prepararCSV 
     * @param datosPersona Son los datos del nuevo aspirante ingresado en el controlador y vista.
     */
    
    public void agregarAspirante(String[] datosPersona){
        ArrayList<String[]> aspirantesArray = new ArrayList<String[]>();
        aspirantesArray = prepararCSV();
        aspirantesArray.add(datosPersona);
        try{
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int o=0;o<aspirantesArray.size();o++){
                bw.write(aspirantesArray.get(o)[0]+","+aspirantesArray.get(o)[1]+","+aspirantesArray.get(o)[2]+","+aspirantesArray.get(o)[3]+","+aspirantesArray.get(o)[4]);
                if(o < (aspirantesArray.size()-1)){
                    bw.newLine();
                }
            }
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
        

    // public String mostrarAspirtantes(){

    //     return variable; //Esta variable tendría los aspirantes a ver.
    // }


}
