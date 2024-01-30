package Ejercicio_02;

import javax.swing.JOptionPane;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double celsius = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los grados Celsius : "));
		
		temperaturaCon tem = new temperaturaCon(celsius);
		
		JOptionPane.showMessageDialog(null, "Grados Fahrenheit : " + tem.conversor());
		
	}

}

class temperaturaCon{
	
	private double celsius;
	private final double facConversion, ajuste;
	
	public temperaturaCon(double celsius) {
		this.celsius = celsius;
		this.facConversion = 1.8;
		this.ajuste = 32;
	}

	public double getCelcius() {
		return celsius;
	}

	public void setCelcius(double celcius) {
		this.celsius = celcius;
	}

	public double getFacConversion() {
		return facConversion;
	}

	public double getAjuste() {
		return ajuste;
	}
	
	public double conversor() {
		return (celsius * facConversion) + ajuste;
	}
}
