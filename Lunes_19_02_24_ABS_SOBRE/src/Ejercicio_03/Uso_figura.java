package Ejercicio_03;

import javax.swing.JOptionPane;

public class Uso_figura {

	public static void main(String[] args) {
		
		int opciones;
		
		do {
			
			opciones = Integer.parseInt(JOptionPane.showInputDialog("Elije una figura geometrica : " + "\n" + 
																										  "1. Circulo" + "\n" + 
																										  "2. Rectangulo" + "\n" + 
																										  "3. Triangulo" + "\n" + 
																										  "0. Salir"));
			
			switch (opciones) {
				case 1:
					double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio : ")); 
					int dibujar = Integer.parseInt(JOptionPane.showInputDialog("Como quieres mostrar la figura : " + "\n" + 
																												   "1. Solo con relleno\n" + 
																												   "2. Solo con el borde\n" + 
																												   "3. Ambos\n" + 
																												   "4. Sin color"));
					if (dibujar == 1) {
						String colorRelleno = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						FiguraGeometrica circulo = new Circulo(null, colorRelleno, radio, dibujar);
						JOptionPane.showConfirmDialog(null, circulo.mostrarDetalles());
					}
					else if (dibujar == 2) {
						String colorLinea = JOptionPane.showInputDialog("Ingresa el color de la linea : ");
						FiguraGeometrica circulo = new Circulo(colorLinea, null, radio, dibujar);
						JOptionPane.showConfirmDialog(null, circulo.mostrarDetalles());
					}
					else if (dibujar == 3) {
						String colorRelleno = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						String colorLinea = JOptionPane.showInputDialog("Ingresa el color del borde : ");
						FiguraGeometrica circulo = new Circulo(colorLinea, colorRelleno, radio, dibujar);
						JOptionPane.showConfirmDialog(null, circulo.mostrarDetalles());
					}
					else {
						FiguraGeometrica circulo = new Circulo(null, null, radio, dibujar);
						JOptionPane.showConfirmDialog(null, circulo.mostrarDetalles());
					}
				break;

				case 2:
					double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base : ")); 
					double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura : ")); 
					int dibujar1 = Integer.parseInt(JOptionPane.showInputDialog("Como quieres mostrar la figura : " + "\n" + 
																												   "1. Solo con relleno\n" + 
																												   "2. Solo con el borde\n" + 
																												   "3. Ambos\n" + 
																												   "4. Sin color"));
					if (dibujar1 == 1) {
						String colorRelleno = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						FiguraGeometrica rectangulo = new Rectangulo(base, altura, dibujar1, null, colorRelleno);
						JOptionPane.showConfirmDialog(null, rectangulo.mostrarDetalles());
					}
					else if (dibujar1 == 2) {
						String colorLinea = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						FiguraGeometrica rectangulo = new Rectangulo(base, altura, dibujar1, colorLinea, null);
						JOptionPane.showConfirmDialog(null, rectangulo.mostrarDetalles());
					}
					else if (dibujar1 == 3) {
						String colorRelleno = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						String colorLinea = JOptionPane.showInputDialog("Ingresa el color del borde : ");
						FiguraGeometrica rectangulo = new Rectangulo(base, altura, dibujar1, colorLinea, colorRelleno);
						JOptionPane.showConfirmDialog(null, rectangulo.mostrarDetalles());
					}
					else {
						FiguraGeometrica rectangulo = new Rectangulo(base, altura, dibujar1, null, null);
						JOptionPane.showConfirmDialog(null, rectangulo.mostrarDetalles());
					}
				break;
				
				case 3:
					double baseT = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base : ")); 
					double alturaT= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura : ")); 
					int dibujarT = Integer.parseInt(JOptionPane.showInputDialog("Como quieres mostrar la figura : " + "\n" + 
																												   "1. Solo con relleno\n" + 
																												   "2. Solo con el borde\n" + 
																												   "3. Ambos\n" + 
																												   "4. Sin color"));
					if (dibujarT == 1) {
						String colorRelleno = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						FiguraGeometrica triangulo = new Triangulo(baseT, alturaT, dibujarT, null, colorRelleno);
						JOptionPane.showConfirmDialog(null, triangulo.mostrarDetalles());
					}
					else if (dibujarT == 2) {
						String colorLinea = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						FiguraGeometrica triangulo = new Triangulo(baseT, alturaT, dibujarT, colorLinea, null);
						JOptionPane.showConfirmDialog(null, triangulo.mostrarDetalles());
					}
					else if (dibujarT == 3) {
						String colorRelleno = JOptionPane.showInputDialog("Ingresa el color del relleno : ");
						String colorLinea = JOptionPane.showInputDialog("Ingresa el color del borde : ");
						FiguraGeometrica triangulo = new Triangulo(baseT, alturaT, dibujarT, colorLinea, colorRelleno);
						JOptionPane.showConfirmDialog(null, triangulo.mostrarDetalles());
					}
					else {
						FiguraGeometrica triangulo = new Triangulo(baseT, alturaT, dibujarT, null, null);
						JOptionPane.showConfirmDialog(null, triangulo.mostrarDetalles());
					}
				break;
				
			case 0:
				JOptionPane.showMessageDialog(null, "Adios!!!");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta!!!");
			}	
		} while (opciones != 0);
	}
}
