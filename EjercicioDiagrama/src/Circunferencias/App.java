package Circunferencias;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------- Círculo---------");
        System.out.print("Introduce el radio del circulo: ");
        double radioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo(radioCirculo);
        circulo.mostrar();

        System.out.println("-------------- Cilindro---------");
        System.out.print("Introduce la altura del cilindro: ");
        double alturaCilindro = scanner.nextDouble();
        Cilindro cilindro = new Cilindro(radioCirculo, alturaCilindro);
        cilindro.mostrar();

        System.out.println("--------------- Cilindro Hueco -----------");
        System.out.print("Introduce el radio interno del cilindro hueco: ");
        double radioInterno = scanner.nextDouble();
        CilindroHueco cilindroHueco = new CilindroHueco(radioCirculo, alturaCilindro, radioInterno);
        cilindroHueco.mostrar();

        scanner.close();
    }
}