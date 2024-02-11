package POLIMORFISMO_DE_INCLUSION;

public class Poli_Inclusion {
	
	public static void main(String[] args) {
		
		//Creamos la instancia 
		Vehiculo runrun = new Coche();
		
		//Llamamos al metodo aceleracion
		runrun.aceleracion();
	}

}

/*Creamos la clase base que contiene el metodo aceleracion que imprime un 
mensaje generico*/
class Vehiculo {
	
	public void aceleracion() {
		System.out.println("Acelera el vehiculo");
	}
}

/*Creamos la clase coche derivada de vehiculo sobrescribiendo el metodo 
aceleracion*/
class Coche extends Vehiculo {
	
	@Override
	public void aceleracion() {
		System.out.println("Acelera la Ford Raptor");
	}
}
