package Ejercicio_02;

public class Salario {

	private String nombre;
	private double horasTrabajadas, tarifaHora;
	
	public Salario(String nombre, double horasTrabajadas, double tarifaHora) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas; 
		this.tarifaHora = tarifaHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}
	
	public double calcularSalario() {
		return horasTrabajadas * tarifaHora;
	}
}
