/**
 * <h1> Proyecto Integrador - Programa de contratación 
 * <h2> Programación Orientada a Objetos </h1>
 * @author
 * @since 12-septiembre-2021
 * @version 1.0
 * @category Vista 
 */
 
  import java.util.Scanner;
 class Vista{
	 // Atributos
	public int DPI;
	public String Correo;
	public int Contacto;
	public boolean CV; 
	 Scanner scan = new Scanner();
	 // Constructores y getters
	 	public Prueba (int DPI){
		this.DPI = DPI; 
		return DPI;
	}
	
	public Prueba (String Correo){
		this.Correo = Correo;
		return Correo;
	}
	
	public Prueba (int Contacto){
		this.Contacto = Contacto;
		return Contacto;
	}
	
	public Prueba (char CV){
		this.CV = CV;
		return CV;
	}
	 // Metodos
	 public Vista(){
		 
	 }
	 public concientizacion (){
		 
	 }
	 public mostrarTest(String[]test){
		 
	 }
	 public nuevoAspirante(){
		public List<String> contacto (int DPI, String Correo, int Contacto, char CV){
		List<String> informacion = new ArrayList<>();
		informacion.add(DPI);
		informacion.add(Correo);
		informacion.add(Contacto);
		informacion.add(CV);
	}
		 
	 }
	 public salir(){
		 
	 }
	 public bienvenidad(){
		 
	 }
	 public invalido(){
		 
	 }
	 public menu(){
		 
	 }
	 public verAspirantes(){
		 
	 }
	 public setCSV(){
		 
	 }
}
