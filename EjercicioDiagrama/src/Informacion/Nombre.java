package Informacion;
import java.util.Scanner;

public class Nombre {
	
	private String nombre;
	private String primerApellido;
	private String segundApellido;
	
	
	public Nombre(String nombre, String primerApellido, String segundApellido) {
		
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundApellido = segundApellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPrimerApellido() {
		return primerApellido;
	}


	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}


	public String getSegundApellido() {
		return segundApellido;
	}


	public void setSegundApellido(String segundApellido) {
		this.segundApellido = segundApellido;
	}
	
	
	public void leerNombre () {
		Scanner leerDatos = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		 setNombre(leerDatos.nextLine());
		 
		 System.out.println("Ingresa tu primer apellido: ");
		 setPrimerApellido(leerDatos.nextLine());
		 
		 System.out.println("Ingresa tu primer segundo apellido: ");
		 setSegundApellido(leerDatos.nextLine());
		 
		
		
	}
	
	public void mostrar () {
		
		System.out.println("Su nombre es: "+""+getNombre());
		System.out.println("Su primer apellido es : "+""+getPrimerApellido());
		System.out.println("Su segundo apellido es : "+""+getSegundApellido());
		
			
		
	}

}
