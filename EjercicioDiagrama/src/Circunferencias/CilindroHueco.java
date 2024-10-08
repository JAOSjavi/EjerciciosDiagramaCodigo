package Circunferencias;
import java.util.Scanner;
class CilindroHueco extends Cilindro {
	
    private double radioInterno;

    public CilindroHueco(double radio, double altura, double radioInterno) {
        super(radio, altura);
        this.radioInterno = radioInterno;
    }

    public void leerRadioInterno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio interno del cilindro hueco: ");
        this.radioInterno = scanner.nextDouble();
    }

    public double getRadioInterno() {
        return radioInterno;
    }


    public double areaCilindroHueco() {
        return 2 * Math.PI * (Math.pow(getRadio(), 2) - Math.pow(radioInterno, 2)) + 2 * Math.PI * (getRadio() + radioInterno) * getAltura();
    }


    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Área del cilindro hueco: " + areaCilindroHueco());
    }
}
