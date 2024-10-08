package Editorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Disco disco = null;
        Libro libro = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Mostrar informacion del Disco");
            System.out.println("2. Mostrar informacion del Libro");
            System.out.println("3. Agregar nuevo Disco");
            System.out.println("4. Agregar nuevo Libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Información del Disco:");
                    disco.Mostrar();
                    break;
                case 2:
                    System.out.println("\nInformación del Libro:");
                    libro.Mostrar();
                    break;
                case 3:
                    System.out.print("Ingrese el título del Disco: ");
                    String tituloDisco = scanner.nextLine();
                    System.out.print("Ingrese el precio del Disco: ");
                    float precioDisco = scanner.nextFloat();
                    System.out.print("Ingrese la duración del Disco: ");
                    float duracionDisco = scanner.nextFloat();
                    System.out.print("Ingrese el número de canciones del Disco: ");
                    int numCanciones = scanner.nextInt();
                    disco = new Disco(tituloDisco, precioDisco, duracionDisco, numCanciones);
                    System.out.println("Nuevo Disco agregado.");
                    break;
                case 4:
                    System.out.print("Ingrese el título del Libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el precio del Libro: ");
                    float precioLibro = scanner.nextFloat();
                    System.out.print("Ingrese el número de páginas del Libro: ");
                    int numPaginas = scanner.nextInt();
                    System.out.print("Ingrese el año de publicación del Libro: ");
                    int anioPublicacion = scanner.nextInt();
                    System.out.print("Ingrese el precio de descuento del Libro: ");
                    float precioDescuento = scanner.nextFloat();
                    libro = new Libro(tituloLibro, precioLibro, numPaginas, anioPublicacion, precioDescuento);
                    System.out.println("Nuevo Libro agregado.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}