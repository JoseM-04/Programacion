package Ejercicio_01;

public class Estudiantes {
	
	private String nombre, grado;
	private int edad;
	
	public Estudiantes(String nombre, int edad, String grado) {
		this.nombre = nombre;
		this.edad = edad;
		this.grado = grado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	
}
