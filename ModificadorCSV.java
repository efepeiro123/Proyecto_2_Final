    /**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> ModificadorCSV (Forma parte del Modelo) </h2>
 * 
 * 
 * Descripción: Esta clase se escribe en un documento CSV que almacena 
 * los datos de todos los candidatos con sus datos personales y su puntaje 
 * en los test realizados, el teórico y el psicológico. 
 * 
 * 
 * @author Grupo 4 
 * @since3 3-octubre-2021
 * @version 1.0
 * @category Modelo 
 */


import java.io.File;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.io.FileNotFoundException;

//La clase contendrá los archivos CSV de los aspirantes y contraseñas de los empleadores.
public class ModificadorCSV {
    private String estadoARchivo;
    private File path = new File("aspirantesNuevo.csv"); //Nombre del archivo CSV el cual contendrá a los aspirantes
    private File camino = new File("contrasCSV.csv"); // nombre de la variable que se refiere al archivo CSV de las contraseñas.
    private ArrayList<String[]> aspirantesArreglo = new ArrayList<String[]>();

    public ModificadorCSV(){
        
    }


    

    public void limpiarCompleto(){
        String[] remp = new String[7];
        for(int p = 0; p< aspirantesArreglo.size();p++){
            aspirantesArreglo.set(p, remp);
        }

        try{
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int o=0;o<aspirantesArreglo.size();o++){
                bw.write(""+","+""+","+""+","+""+","+""+","+""+","+"");
                if(o < (aspirantesArreglo.size()-1)){
                    bw.newLine();
                }
            }
            bw.close();
        }catch(IOException e){
            //System.out.println("");
            //e.printStackTrace();
        }
    }

    /**
     * Se encarga de guardar los datos por fila en un arraylist el cual luego será utilizado por guardar los datos del nuevo aspirante.
     * @return aspirantesArreglo Es el ArrayList que guarda los datos de las filas del CSV.
     */
    public void prepararCSV(){
        
		String line = "";
		
		try{
            BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine())!= null){
				String[] values = line.split(",");
				aspirantesArreglo.add(values);
			}
            br.close();
			
		}catch(FileNotFoundException e){
			//e.printStackTrace();
		}catch(IOException e){
			//e.printStackTrace();
		}
      
    }
    

    /**
     *  Almacena los datos del nuevo aspirante ingresado al sistema utilizando como base el arralist enviado por el metodo prepararCSV 
     * @param datosPersona Son los datos del nuevo aspirante ingresado en el controlador y vista.
     */
    
    public void agregarAspirante(String[] datosPersona){
        ArrayList<String[]> aspirantesArray = new ArrayList<String[]>();
        aspirantesArray = aspirantesArreglo;
        aspirantesArray.add(datosPersona);
        try{
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int o=0;o<aspirantesArray.size();o++){
                bw.write(aspirantesArray.get(o)[0]+","+aspirantesArray.get(o)[1]+","+aspirantesArray.get(o)[2]+","+aspirantesArray.get(o)[3]+","+aspirantesArray.get(o)[4]+","+aspirantesArray.get(o)[5]+","+aspirantesArray.get(o)[6]);
                if(o < (aspirantesArray.size()-1)){
                    bw.newLine();
                }
            }
            bw.close();
        }catch(IOException e){
            //System.out.println("");
            //e.printStackTrace();
        }

    }
        

    // public String mostrarAspirtantes(){

    //     return variable; //Esta variable tendría los aspirantes a ver.
    // }
    
    //Metodo para preparar las contrasellas de los empleadores
         
    public ArrayList<String[]> prepararContrasenas() {
        ArrayList<String[]> contrase = new ArrayList<String[]>();
		String line = "";
		try{
            BufferedReader br = new BufferedReader(new FileReader(camino));
			while((line = br.readLine())!= null){
				String[] values = line.split(",");
				contrase.add(values);
			}
            br.close();
			
		}catch(FileNotFoundException e){
			//e.printStackTrace();
		}catch(IOException e){
			//e.printStackTrace();
		}
		
        return contrase;
    }

    public ArrayList<String[]> promediosOrdenados(int escogidos){
        ArrayList<String> promediosOrdenados = new ArrayList<String>();
        ArrayList<String[]> aspirantesOrdenados = new ArrayList<String[]>();

       

        for(int p = 0;p < aspirantesArreglo.size();p++){
            promediosOrdenados.add(aspirantesArreglo.get(p)[6]);
        }

        Double[] a = new Double[promediosOrdenados.size()];
        for(int t = 0;t<promediosOrdenados.size();t++){
			a[t] = Double.parseDouble(promediosOrdenados.get(t));
		}

        

        Arrays.sort(a, Collections.reverseOrder());
        
        for(int k = 0; k<escogidos;k++){
			for(int g = 0;g<aspirantesArreglo.size();g++){
				if(Double.toString(a[k]).equals(aspirantesArreglo.get(g)[6])){
					aspirantesOrdenados.add(aspirantesArreglo.get(g));
                   ;
				}
			}
		}


    return aspirantesOrdenados;
    }

    public int getSizeAspirantes(){
        return aspirantesArreglo.size();
    }

    public ArrayList<String[]> getAspirantesArreglo() {
        return aspirantesArreglo;
    }
}
