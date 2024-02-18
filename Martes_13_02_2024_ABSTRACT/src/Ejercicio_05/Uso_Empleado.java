package Ejercicio_05;

import javax.swing.JOptionPane;

public class Uso_Empleado {
	
	public static void main(String[] args) {
		
		int opciones;
		
		do {
			opciones = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de empleado eres?" + "\n" + 
																											"1. Tiempo Completo" + "\n" +
																											"2. Tiempo Parcial" + "\n" +
																											"0. Salir"));
			
			switch (opciones ) {
			
				case 1:
					Empleado completo = new EmpTmpCompleto();
					JOptionPane.showMessageDialog(null, "Sueldo de : " + completo.calcularSalario() + "€");
					break;
					
				case 2:
					int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas al mes : "));
					Empleado parcial = new EmpTmpParcial(horasTrabajadas);
					JOptionPane.showMessageDialog(null, "Sueldo de : " + parcial.calcularSalario() + "€");
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "Bye!!!");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		}while (opciones != 0);
	}
}
