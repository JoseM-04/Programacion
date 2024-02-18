package Ejercicio_01;

public class Uso_empleado {
	
	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Jose", "Gerente", "Ventas", 3000);
		Empleado emp2 = new Empleado("Marcos", "RRHH", 2000);
		Empleado emp3 = new Empleado();
		
		emp3.setNombre("Maria");
		emp3.setSalario(1000);
		
		System.out.println(emp1.informacion());
		System.out.println();
		System.out.println(emp2.informacion());
		System.out.println();
		System.out.println(emp3.informacion());
		
	}

}
