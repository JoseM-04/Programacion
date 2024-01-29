package Ejercicio_04;

import javax.swing.JOptionPane;

public class Uso_inventario {

	public static void main(String[] args) {
		
		Inventario[] productos = new Inventario[3];
		
		for(int i = 0; i  < productos.length; i++) {
			
			String nomproducto = JOptionPane.showInputDialog("Introduce nombre del producto : " + (i + 1));
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad del producto : " + (i + 1)));
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce precio del producto : " + (i +1)));
			
			productos[i] = new Inventario(nomproducto, cantidad, precio);
			
		}
		
		for(Inventario producto : productos) {
			
			System.out.println("Nombre   : " + producto.getNomproducto());
			System.out.println("Cantidad : " + producto.getCantidad());
			System.out.println("Precio   : " + producto.getPrecio());
			System.out.println();
			
		}
	}
}
