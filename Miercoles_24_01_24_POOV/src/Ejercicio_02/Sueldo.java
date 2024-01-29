package Ejercicio_02;

import javax.swing.JOptionPane;

public class Sueldo {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Ingresa nombre del empleado : ");
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu sueldo : "));
		aumentosueldo empleado2 = new aumentosueldo(nombre, sueldo);
			
		empleado2.aumentoSueldo(10);
		double sueldoactu = empleado2.getSueldo();
		
		JOptionPane.showMessageDialog(null, "Sueldo de " + empleado2.getNombre() + " se actualizo a " + sueldoactu + " euros.");	
			
	}

}

class aumentosueldo{
	
	private String nombre;
	private double sueldo;
	
	public aumentosueldo(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
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
	
	public void aumentoSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
}