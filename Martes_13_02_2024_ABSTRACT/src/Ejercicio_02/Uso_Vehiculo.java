package Ejercicio_02;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {
	
	public static void main(String[] args) {
		
		Vehiculo automovil = new Automovil();
		Vehiculo motocicleta = new Motocicleta();
		
		JOptionPane.showMessageDialog(null, "Automovil :\n" + automovil.acelerar() + "\n" +
																automovil.frenar() + "\n" + "Motocicleta :\n" +
																motocicleta.acelerar() + "\n" + motocicleta.frenar());
	}

}
