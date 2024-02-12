package Ejercicio_02;

public class Estudiante  extends Persona{
	
	String carrera;

	public Estudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
}
