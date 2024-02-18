package Ejercicio_02;

public class Rectangulo {

	private double altura, ancho;

	public Rectangulo(double altura, double ancho) {
		this.altura = altura;
		this.ancho = ancho;
	}
	
	public Rectangulo() {
		this.altura = 0;
		this.ancho = 0;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double area() {
		return ancho * altura;
	}
	
	public double perimetro() {
		return 2 * (ancho + altura);
	}
}
