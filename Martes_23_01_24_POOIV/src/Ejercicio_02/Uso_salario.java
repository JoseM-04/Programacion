package Ejercicio_02;

import javax.swing.JOptionPane;

public class Uso_salario {
	
	public static void main(String[] args) {
		
		Salario[] empleado = new Salario[5];
		
		for(int i = 0; i < 5; i++) {
			String nombre = JOptionPane.showInputDialog("Nombre del empleado : ");
			double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas horas trabajastes?"));
			double tarifaHora = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es tu tarifa?"));
			
			empleado[i] = new Salario(nombre, horasTrabajadas, tarifaHora);
			
			JOptionPane.showMessageDialog(null, "Salario de " + empleado[i].getNombre() + " : $" + empleado[i].calcularSalario());
		}	
	}

}
