package Ejercicio_01;

import javax.swing.JOptionPane;

public class ContadorInstacias {
	
	private static int contador = 0;
	
	public  ContadorInstacias() {
		contador++;
	}
	 
	public static int numInstancias() {
		return contador;
	}
	
	public static void main(String[] args) {
		
		ContadorInstacias i1 = new ContadorInstacias();
		ContadorInstacias i2 = new ContadorInstacias();
		ContadorInstacias i3 = new ContadorInstacias();
		ContadorInstacias i4 = new ContadorInstacias();
		ContadorInstacias i5 = new ContadorInstacias();

		JOptionPane.showMessageDialog(null, "Instancias creadas : " + ContadorInstacias.numInstancias());
	}
}
