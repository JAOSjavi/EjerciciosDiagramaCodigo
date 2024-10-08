package Circunferencias;

import java.util.Scanner;


class Circulo {
	
	
 private double radio; 


 public Circulo(double radio) {
     this.radio = radio;
 }


 public void leerRadio() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Introduce el radio del círculo: ");
     this.radio = scanner.nextDouble();
 }


 public double getRadio() {
     return radio;
 }

 public double area() {
     return Math.PI * radio * radio;
 }

 public double circunferencia() {
     return 2 * Math.PI * radio;
 }

 public void mostrar() {
     System.out.println("Área del círculo: " + area());
     System.out.println("Circunferencia del círculo: " + circunferencia());
 }
}