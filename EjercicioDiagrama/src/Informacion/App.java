package Informacion;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce los datos de la persona:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Primer apellido: ");
        String primerApellido = scanner.nextLine();
        System.out.print("Segundo apellido: ");
        String segundoApellido = scanner.nextLine();


        System.out.println("Introduce la dirección:");
        System.out.print("Calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();
        System.out.print("Código postal: ");
        String codigoPostal = scanner.nextLine();


        Direccion direccion = new Direccion(nombre, primerApellido, segundoApellido, calle, ciudad, provincia, codigoPostal);


        System.out.println("\nDatos ingresados:");
        direccion.mostrar();

        scanner.close();
    }
}