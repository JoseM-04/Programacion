package Ejercicio_04;

import javax.swing.JOptionPane;

public class Uso_coche {
	
	public static void main(String[] args) {

		String marca = JOptionPane.showInputDialog("Introduce la marca del vehiculo : ");
		String modelo = JOptionPane.showInputDialog("Introduce el modelo del vehiculo : ");
		String color = JOptionPane.showInputDialog("Introduce el color del vehiculo : ");
		String traccion = JOptionPane.showInputDialog("Introduce la traccion del vehiculo : ");
		String motor = JOptionPane.showInputDialog("Introduce el tipo de motor del vehiculo : ");
		int año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de fabricacion : "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del vehiculo : "));
		double ancho = Double.parseDouble(JOptionPane.showInputDialog("Introduce el ancho del vehiculo : "));
		
		Coche auto1 = new Coche(marca, modelo, color, traccion, motor, año, altura, ancho);
		Coche auto2 = new Coche(marca, modelo, color, año, altura, ancho);
		Coche auto3 = new Coche(marca, modelo, color, año);
		
		JOptionPane.showMessageDialog(null, auto1.informacion());
		JOptionPane.showMessageDialog(null, auto2.informacion());
		JOptionPane.showMessageDialog(null, auto3.informacion());
	}
}
