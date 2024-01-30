package Ejercicio_01;

import javax.swing.JOptionPane;

public class Impuestos {
	
	public static void main(String[] args) {
		
		String nomProducto = JOptionPane.showInputDialog("Ingresa nombre del producto : ");
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa precio del producto : "));
		
		impuesto pro = new impuesto(nomProducto, precio);
		
		JOptionPane.showMessageDialog(null, "El precio de " + pro.getNomProducto() + " con impuestos es " + pro.aumentoImpuesto());
	}
}

class impuesto{
	
	private String nomProducto;
	private double precio;
	private final double porcentaje; 
	
	public impuesto(String nomProducto, double precio) {
		this.nomProducto = nomProducto;
		this.precio = precio;
		this.porcentaje = 0.15;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPorcentaje() {
		return porcentaje;
	}
	
	public double aumentoImpuesto() {
		return precio + (precio * porcentaje);
	}

}