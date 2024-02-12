package Ejercicio_02;

import javax.swing.JOptionPane;

public class Uso_Estudiante {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		String carrera = JOptionPane.showInputDialog("Introduce tu carrera");
		
		Estudiante est = new Estudiante(nombre, edad, carrera);
		
		JOptionPane.showInternalMessageDialog(null, est.nombre + "\n" + est.edad + "\n" + est.carrera);
	}

}
