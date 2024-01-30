package Ejercicio_03;

import javax.swing.JOptionPane;

public class Edad {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre : ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad : "));
		
		edades e = new edades(nombre, edad);
		
		JOptionPane.showMessageDialog(null, e.getNombre() + e.edadminima());
		
	}

}

class edades{
	
	private String nombre;
	private int edad;
	private final int edadmini;
	
	public edades(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.edadmini = 18;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getEdadmini() {
		return edadmini;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String edadminima() {
		if (edad >= edadmini) {
			return " es elegible";
		}
		else {
			return " no  puede votar";
		}
	}
}
