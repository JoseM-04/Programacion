package Ejercicio_04;

import javax.swing.JOptionPane;

public class Lista {
	
	public static void main(String[] args) {
		
		listaEmp[] empleados = new listaEmp[3];
		
		for(int i = 0; i < empleados.length; i++) {
			
			String nombre = JOptionPane.showInputDialog("Introduce nombre del empleado : " + (i + 1));
			double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce sueldo del empleado : " + (i + 1)));
			
			empleados[i] = new listaEmp(nombre, sueldo);
			
		}
		
		for(listaEmp lista : empleados) {
			JOptionPane.showMessageDialog(null, "Empleado : " + "\n" + lista.getNombre() + "\n" + lista.getSueldo());
		}
		
	}

}

class listaEmp{
	
	private String nombre;
	private double sueldo;
	
	public listaEmp(String nombre, double sueldo) {
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
	
}