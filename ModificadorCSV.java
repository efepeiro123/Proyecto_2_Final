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
    private String encabezado;
    private File aspirantes = new File("/Proyecto_2_Final/aspirantesNuevo.csv"); //Nombre del archivo CSV el cual contendrá a los aspirantes


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
        
       
			try{
                ArrayList<String[]> aspirantesArray = new ArrayList<String[]>();
                String [] encabezado = {"DPI","Nombre","Numero","Correo","Calificacion"};
                aspirantesArray.add(encabezado);
				FileWriter fw = new FileWriter(aspirantes);
				BufferedWriter bw = new BufferedWriter(fw);
               /*  FileReader fr = new FileReader(aspirantes);
                BufferedReader br = new BufferedReader(fr); */
                String line = "";
                BufferedReader br = new BufferedReader(new FileReader(aspirantes));
                System.out.println("aaaaa");
                System.out.println(line = br.readLine());
                System.out.println("aaaaa");
                while((line = br.readLine())!= null){
                    String[] values = line.split(",");
                    aspirantesArray.add(values);
                }
                br.close();
                
                aspirantesArray.add(datosPersona);
                
				for(int o=0;o<aspirantesArray.size();o++){
					bw.write(aspirantesArray.get(o)[0]+","+aspirantesArray.get(o)[1]+","+aspirantesArray.get(o)[2]+","+aspirantesArray.get(o)[3]+","+aspirantesArray.get(o)[4]);
					if(o < (aspirantesArray.size()-1)){
                        bw.newLine();
                    }
				}
				bw.close();
				fw.close();
               

					
			}catch(IOException e){
				e.printStackTrace(); 
			}

    }

    // public String mostrarAspirtantes(){

    //     return variable; //Esta variable tendría los aspirantes a ver.
    // }


}
