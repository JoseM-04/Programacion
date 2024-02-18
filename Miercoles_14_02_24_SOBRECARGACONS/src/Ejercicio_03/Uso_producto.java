package Ejercicio_03;

import javax.swing.JOptionPane;

public class Uso_producto {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto : ");
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
		int stock = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad en stock"));
		
		Producto a1 = new Producto(nombre, precio, stock);
		Producto a2 = new Producto(nombre, precio);
		Producto a3 = new Producto();
		
		JOptionPane.showMessageDialog(null, "Nombre : " + a1.getNombre() + "\n" + "Precio : " + a1.getPrecio() + "\n" + "Stock : " + a1.getStock());
		JOptionPane.showMessageDialog(null, "Nombre : " + a2.getNombre() + "\n" + "Precio : " + a2.getPrecio() + "\n" + "Stock : " + a2.getStock());
		JOptionPane.showMessageDialog(null, "Nombre : " + a3.getNombre() + "\n" + "Precio : " + a3.getPrecio() + "\n" + "Stock : " + a3.getStock());

	}
}
