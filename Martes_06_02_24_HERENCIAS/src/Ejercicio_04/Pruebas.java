package Ejercicio_04;

import java.text.DecimalFormat;

public class Pruebas {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("0.00");
		Rectangulo r1 = new Rectangulo(2, 32);
		Circulo c1 = new Circulo(4);
		
		System.out.println("Rectangulo");
		System.out.println("Area");
		System.out.println("Rectángulo base " + r1.getBase() + " y altura " + r1.getAltura() + " es " + r1.calcularArea());
		System.out.println();
		System.out.println("Circulo");
		System.out.println("Area");
		System.out.println("Circulo radio: "+ c1.getRadio() + " : " + formato.format(c1.calcularArea()));
	}

}
