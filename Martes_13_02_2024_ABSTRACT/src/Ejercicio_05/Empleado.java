package Ejercicio_05;

public abstract class Empleado {

	public abstract double calcularSalario();
}

class EmpTmpCompleto extends Empleado{
	
	private final double salarioMensual;
	
	public EmpTmpCompleto() {
		this.salarioMensual = 1200;
	}
	
	@Override
	public double calcularSalario() {
		return salarioMensual;
	}
}

class EmpTmpParcial extends Empleado{
	
	private final double salarioxHora;
	private int horasTrabajadas;
	
	public EmpTmpParcial(int horasTrabajadas) {
		this.salarioxHora = 30;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double calcularSalario() {
		return salarioxHora * horasTrabajadas;
	}
}