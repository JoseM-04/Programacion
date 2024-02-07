package Ejercicio_03;

import javax.swing.JOptionPane;

public class ConvertidorUniades {

	public static double kilometrosAmillas(double km) {
		return km * 0.621371;
	}
	
	public static double millasAkilometros(double mi) {
		return mi  * 1.60934;
	}
	
	public static double celciusAfahrenheit(double cels) {
		return (cels * 9 / 5) + 32;
	}
	
	public static double fahrenheitAdelcius(double faht) {
		return (faht - 32) * 5 / 9;
	}
	
	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa las millas para convertir a kilometros : "));
		JOptionPane.showMessageDialog(null, num1 + " millas son " + ConvertidorUniades.millasAkilometros(num1) + " kilometros");
		
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los kilometros para convertir a millas : "));
		JOptionPane.showMessageDialog(null, num2 + " km son " + ConvertidorUniades.kilometrosAmillas(num2) + " millas");
		
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los ºCelcius para convertir a ºFahrenheit : "));
		JOptionPane.showMessageDialog(null, num3 + "º Celcius son " + ConvertidorUniades.celciusAfahrenheit(num3) + "º Fahrenheit");
		
		double num4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los ºFahrenheit para convertir a ºCelcius : "));
		JOptionPane.showMessageDialog(null, num4 + "º Fahrenheit son " + ConvertidorUniades.fahrenheitAdelcius(num4) + "º Celcius");
	}
}
