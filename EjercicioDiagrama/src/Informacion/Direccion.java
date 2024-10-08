package Informacion;
import java.util.Scanner;
public class Direccion extends Nombre{
	

	private String calle;
	private String ciudad;
	private String provincia;
	private String codigoPostal;
	
	
	
	
	public Direccion(String nombre, String primerApellido, String segundApellido, String calle, String ciudad,
			String provincia, String codigoPostal) {
		super(nombre, primerApellido, segundApellido);
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}
	
	
	public void nuevaDireccion() {
		
		
	      Scanner leerDatos = new Scanner(System.in);
	        System.out.print("Introduce la calle: ");
	        this.calle =  leerDatos.nextLine();
	        System.out.print("Introduce la ciudad: ");
	        this.ciudad =  leerDatos.nextLine();
	        System.out.print("Introduce la provincia: ");
	        this.provincia =  leerDatos.nextLine();
	        System.out.print("Introduce el código postal: ");
	        this.codigoPostal =  leerDatos.nextLine();
	}

	
	  public void nuevoNombre() {
	        super.leerNombre();
	    }
	  
	  @Override
	    public void mostrar() {
	        super.mostrar();
	        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal);
	    }

	
	
	
	

}
