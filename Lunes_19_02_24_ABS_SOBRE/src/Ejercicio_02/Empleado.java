package Ejercicio_02;

public abstract class Empleado {
	
	String nombre;
	int id;
	double salario = 1600;
	
	public Empleado(String nombre, int id, double salario) {
		this.nombre = nombre;
		this.id = id;
		this.salario = salario;
	}
	
	public Empleado(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	public abstract double calcularSalario();
	public abstract String mostrarDetalles();
}

class EmpPermanente extends Empleado {
	
	int beneficios;
	int tiempoT;

	public EmpPermanente(String nombre, int id, int beneficios, int tiempoT) {
		super(nombre, id);
		this.beneficios = beneficios;
		this.tiempoT = tiempoT;
	}

	public EmpPermanente(String nombre, int id) {
		super(nombre, id);
	}
	
	
	public double calcularSalario() {
		
		switch (beneficios) {
			case 1:
				
				if (tiempoT == 4 & tiempoT <= 5) {
					return salario += 120;
				}
				else if (tiempoT == 6 & tiempoT <= 7) {
					return salario += 180;
				}
				else if(tiempoT >= 8) {
					return salario += 240;
				}
				else {
					return salario; 
				}
				
			case 2:
				return salario += 150;
				
			case 3: 
				return salario += 200;

			default:
				return salario;
		}
	}
	
	public String mostrarDetalles() {
		return "Nombre : " + nombre + "\n" + 
				  "ID : " + id + "\n" + 
				  "Tiempo Trabajado : " + tiempoT + " años" + "\n" +
				  "Salario : " + calcularSalario() + "\n";
	}
}

class EmpTemporal extends Empleado{
	
	private int periodo;

	public EmpTemporal(String nombre, int id, int periodo) {
		super(nombre, id);
		this.periodo = periodo;
	}

	public EmpTemporal(String nombre, int id) {
		super(nombre, id);
	}
	
	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	@Override
	public double calcularSalario() {
		
		switch (periodo) {
		case 0,1:
			return 1200;
		case 2:
			return 1500;
		default:
			return 1800;
		}
	}
	
	@Override
	public String mostrarDetalles() {
		return "Nombre : " + nombre + "\n" + 
				  "ID : " + id + "\n" + 
				  "Años de contrato : " + periodo + "\n" +
				  "Salario : " + calcularSalario() + "\n";
	}	
}

class contratista extends Empleado{
	
	private int horasT;
	private int jornada;

	public contratista(String nombre, int id, int horasT, int jornada) {
		super(nombre, id);
		this.horasT = horasT;
		this.jornada = jornada;
	}

	public contratista(String nombre, int id) {
		super(nombre, id);
	}
	
	public int getHorasT() {
		return horasT;
	}

	public void setHorasT(int horasT) {
		this.horasT = horasT;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	
	public String tipoJornada() {
		if (jornada == 1) {
			return "Nocturna";
		}
		else {
			return "Diurna";
		}
	}

	public double calcularSalario() {
		
		switch (jornada) {
			case 1:
				return horasT * 40;

			default:
				return horasT * 30;
		}
	}
	
	public String mostrarDetalles() {
		return "Nombre : " + nombre + "\n" + 
				  "ID : " + id + "\n" + 
				  "Tipo de Jornada : " + tipoJornada() + "\n" +
				  "Salario : " + calcularSalario() + "\n";
	}
}
