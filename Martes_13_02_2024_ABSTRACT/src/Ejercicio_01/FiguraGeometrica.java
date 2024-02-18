package Ejercicio_01;

public abstract class FiguraGeometrica {

	public abstract double calcularArea();
}

class Rectangulo extends FiguraGeometrica{
	
	private double base, altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return base * altura * 0.5;
	}
}

class Circulo extends FiguraGeometrica{

	private double radio;
	private final double pi;

	public Circulo(double radio) {
		this.radio = radio;
		this.pi = Math.PI;
	}

	@Override
	public double calcularArea() {
		return pi * Math.pow(radio, 2);
	}
}

class Triangulo extends FiguraGeometrica{
	
	private double base, altura;
	
	public Triangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
}

class Hexagono extends FiguraGeometrica{
	
	private double lado;

	public Hexagono(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return 3 * Math.sqrt(3) * Math.pow(lado, 2);
	}
}

