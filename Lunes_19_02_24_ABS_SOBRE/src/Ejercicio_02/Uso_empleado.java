package Ejercicio_02;

import javax.swing.JOptionPane;

public class Uso_empleado {

	public static void main(String[] args) {
		
		int opciones;
		
		do {
			
			opciones = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de empleado eres?\n" + 
																											"1. Permanente\n" + 
																											"2. Temporal\n" + 
																											"3. Contratista\n" + 
																											"0. Salir"));
			
			switch (opciones) {
				case 1:
					String nombre = JOptionPane.showInputDialog("Introduce nombre completo : ");
					int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce ID :"));
					int beneficios = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de beneficio tienes?\n" +  
																														 "1. Plus Antiguedad\n" + 
																														 "2. Idiomas\n" + 
																														 "3. Experiencia"));
					int tiempoT = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años llevas trabajando?"));
					Empleado permanente = new EmpPermanente(nombre, id, beneficios, tiempoT);
					Empleado permanente2 = new EmpPermanente(nombre, id);
					JOptionPane.showMessageDialog(null, permanente.mostrarDetalles());
					JOptionPane.showMessageDialog(null, permanente2.mostrarDetalles());
					break;
					
				case 2:
					String nombre2 = JOptionPane.showInputDialog("Introduce nombre completo : ");
					int id2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce ID :"));
					int periodo = Integer.parseInt(JOptionPane.showInputDialog("¿Por cuentos años fuiste contratado?"));
					Empleado temporal = new EmpTemporal(nombre2, id2, periodo);
					Empleado temporal2= new EmpTemporal(nombre2, id2);
					JOptionPane.showMessageDialog(null, temporal.mostrarDetalles());
					JOptionPane.showMessageDialog(null, temporal2.mostrarDetalles());
					break;
					
				case 3:
					String nombre3 = JOptionPane.showInputDialog("Introduce nombre completo : ");
					int id3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce ID :"));
					int horasT = Integer.parseInt(JOptionPane.showInputDialog("¿Cuentas horas trabajastes?"));
					int jornada = Integer.parseInt(JOptionPane.showInputDialog("Tipo de jornada :\n" + 
																													 "1. Nocturna\n" + 
																													 "2. Diurna\n"));
					Empleado contratista = new contratista(nombre3, id3, horasT, jornada);
					Empleado contratista2 = new contratista(nombre3, id3);
					JOptionPane.showMessageDialog(null, contratista.mostrarDetalles());
					JOptionPane.showMessageDialog(null, contratista2.mostrarDetalles());
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
			
		} while (opciones != 0);
	}
}
