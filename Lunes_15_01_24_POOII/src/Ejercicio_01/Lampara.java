package Ejercicio_01;

public class Lampara {

	private int potencia;
	private String tipo, color;
	
	public Lampara(){
		potencia = 60;
		tipo = "LED";
		color = "Blanco";
	}
	
	public int getpotencia() {
		return potencia;
	}
	
	public String gettipo() {
		return tipo;
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setpotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
}
