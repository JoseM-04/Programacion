package Ejercicio_05;

public class Estudiante {

	private String nombre, logro;
	private int edad;
	private double promedio;
	
	public Estudiante(String nombre, String logro, int edad, double promedio) {
		this.nombre = nombre;
		this.logro = logro;
		this.edad = edad;
		this.promedio = promedio;
	}

	public Estudiante(String nombre, int edad, double promedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getPromedio() {
		return promedio;
	}

	public int getEdad() {
		return edad;
	}

	public String getLogro() {
		if (promedio == 10) {
			return "Exelente";
		}
		else {
			return null;
		}
	}
}
