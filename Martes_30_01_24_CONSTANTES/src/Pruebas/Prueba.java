package Pruebas;

public class Prueba {
	
	public static void main(String[] args) {
		
		empleado trabajador1 = new empleado("Loli");
		empleado trabajador2 = new empleado("Tefy");
		
		trabajador1.setSeccion("Recursos Humanos");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		
	}

}

class empleado{
	
	private final String nombre;
	private String seccion;
	
	public empleado(String nom) {
		nombre = nom;
		seccion = "Administracion";
	}

	public String getNombre() {
		return nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es " + seccion;
	}
}
