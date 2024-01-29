package Ejercicio_05;

import javax.swing.JOptionPane;

public class Aumento {
	
	public static void main(String[] args) {
		
		aumentosuel[] aumento = new aumentosuel[3];
		
		for(int i = 0; i <aumento.length; i++) {
			
			String nombre = JOptionPane.showInputDialog("Introduce nombre del empleado : " + (i + 1));
			double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce suledo del empleado : "));
			int añocon = Integer.parseInt(JOptionPane.showInputDialog("¿En que año fue contratado?"));
			aumentosuel emp = new aumentosuel(nombre, sueldo, añocon);
			
		}
		
		for(aumentosuel empleado : aumento) {
			
			if (empleado.getAñocon() < 2021) {
				
				empleado.aumentosueldo(5);
				double sueldoactu = empleado.getSueldo();
				
				for(aumentosuel empleado1 : aumento) {
					JOptionPane.showMessageDialog(null, "Nombre : " + empleado1.getNombre() + "\nSueldo : " + sueldoactu);
					
				}
			}
		}
		
		
		
	}

}

class aumentosuel{
	
	private String nombre;
	private double sueldo;
	private int añocon;
	
	public aumentosuel(String nombre, double sueldo, int añocon) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.añocon = añocon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getAñocon() {
		return añocon;
	}

	public void setAñocon(int añocon) {
		this.añocon = añocon;
	}
	
	public void aumentosueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	
	
	
	
}