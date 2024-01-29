package Ejercicio_04;

public class Inventario {
	
	private String nomproducto;
	private int cantidad;
	private double precio;
	
	public Inventario(String nomproducto, int cantidad, double precio) {
		this.nomproducto = nomproducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNomproducto() {
		return nomproducto;
	}

	public void setNomproducto(String nomproducto) {
		this.nomproducto = nomproducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
