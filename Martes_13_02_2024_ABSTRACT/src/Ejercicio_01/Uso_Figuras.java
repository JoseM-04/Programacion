package Ejercicio_01;

import javax.swing.JOptionPane;

public class Uso_Figuras {
		
	public static void main(String[] args) {
			
		int opciones;
			
		do {
			opciones = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción:\n" +
																											"1. Calcular area de Rectángulo\n" +
																											"2. Calcular area de Círculo\n" +
																											"3. Calcular area de Triángulo\n" +
																											"4. Calcular area de Hexagono\n"  +
							                    															"0. Salir"));
				
			switch (opciones) {
				
				case 1:
					double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base : "));
					double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura : "));
					Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
					JOptionPane.showMessageDialog(null, "Area del rectangulo : " + rectangulo.calcularArea());
					break;
						
				case 2:
					double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio"));
					Circulo circulo = new Circulo(radioCirculo);
					JOptionPane.showMessageDialog(null, "Area del circulo : " + circulo.calcularArea());
					break;
						
				case 3:
					double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base : "));
					double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura : "));
					Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
					JOptionPane.showMessageDialog(null, "Area del triangulo : " + triangulo.calcularArea());
					break;
						
				case 4:
					double ladoHexagono = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado"));
					Hexagono hexagono = new Hexagono(ladoHexagono);
					JOptionPane.showMessageDialog(null, "Area del hexagono : " + hexagono.calcularArea());
					break;
						
				case 0:
					JOptionPane.showMessageDialog(null, "Bye!!!");
					break;
						
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opciones != 0);
	}
}
