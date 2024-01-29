package Ejercicio_05;

public class Contactos {
	
	private String nombre, email;
	private int numtelefono;
	
	public Contactos(String nombre, String email, int numtelefono) {
		this.nombre = nombre;
		this.numtelefono = numtelefono;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumtelefono() {
		return numtelefono;
	}

	public void setNumtelefono(int numtelefono) {
		this.numtelefono = numtelefono;
	}

}
