package Ejercicio_02;

import javax.swing.JOptionPane;

public class Calculadora {
	
	public static double suma(double a, double b) {
		return a + b;
	}
	
	public static double resta(double a, double b) {
		return a - b;
	}
	
	public static double multilpicacion(double a, double b) {
		return a * b;
	}

	public static double division(double a, double  b) {
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}
		return a /  b;
	}
	
	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa otro numero"));
		
		JOptionPane.showMessageDialog(null, "Suma : " + Calculadora.suma(n1, n2) + "\n" + "Resta : " + Calculadora.resta(n1, n2) + 
																"\n" + "Multiplicacion : " + Calculadora.multilpicacion(n1, n2) + "\n" + "Division : " + 
																Calculadora.division(n1, n2));
	}

}
