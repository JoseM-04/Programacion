package Ejercicio_01;

public class Empleado {

	private String nombre, puesto, departamento;
	private int salario;
	
	public Empleado(String nombre, String puesto, String departamento, int salario) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.departamento = departamento;
		this.salario = salario;
	}

	public Empleado(String nombre, String departamento, int salario) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}

	public Empleado() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public String informacion() {
		return "Nombre : " + nombre + "\n" + "Puesto : " + puesto + "\n" + "Departamento : " + departamento + "\n" + "Salario : " + salario; 
	}
}
