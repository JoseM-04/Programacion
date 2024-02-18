package Ejercicio_04;

public class Coche {
	
	private String marca, modelo, color, traccion, motor;
	private int año;
	private double altura, ancho;
	
	public Coche(String marca, String modelo, String color, String traccion, String motor, int año, double altura, double ancho) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.traccion = traccion;
		this.motor = motor;
		this.año = año;
		this.altura = altura;
		this.ancho = ancho;
	}

	public Coche(String marca, String modelo, String color, int año, double altura, double ancho) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
		this.altura = altura;
		this.ancho = ancho;
	}

	public Coche(String marca, String modelo, String color, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
	
	public String informacion() {
		return "Marca : " + marca + "\n" + "Modelo : " + modelo + "\n" + "Color : " + color + "\n" + "Traccion : " + traccion +
				"\n" + "Motor : " + motor + "\n" + "Año : " + año + "\n" + "Altura : " + altura + "\n" + "Ancho : " + ancho;
	}
}
