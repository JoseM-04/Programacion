package Ejercicio_04;

import javax.swing.JOptionPane;

public class Descuentos {
	
	public static void main(String[] args) {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad : "));
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio : "));
		
		descuento des = new descuento(cantidad, precio);
		
		JOptionPane.showMessageDialog(null, "El precio final es : " + des.precioFinal());
		
	}

}

class descuento{
	
	private final double descuento;
	private int cantidad;
	private double precio;
	
	public descuento(int cantidad, double precio){
		this.cantidad = cantidad;
		this.descuento = 0.10;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getDescuento() {
		return descuento;
	}
	
	public double precioFinal() {
		if (cantidad > 5) {
			return (cantidad * precio) - ((cantidad * precio) * descuento);  
		}
		else {
			return cantidad * precio;
		}
	}
}