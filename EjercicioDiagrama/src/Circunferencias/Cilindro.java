package Circunferencias;
import java.util.Scanner;
class Cilindro extends Circulo {
	
	
    private double altura; 

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public void leerAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del cilindro: ");
        this.altura = scanner.nextDouble();
    }
    public double getAltura() {
        return altura;
    }

    public double areaCilindro() {
        return 2 * Math.PI * getRadio() * (getRadio() + altura);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Área del cilindro: " + areaCilindro());
    }
}