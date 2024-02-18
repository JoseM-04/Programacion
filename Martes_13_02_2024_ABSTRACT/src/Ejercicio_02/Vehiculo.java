package Ejercicio_02;

public abstract class Vehiculo {

	public abstract String acelerar();
	public abstract String frenar();
}

class Automovil extends Vehiculo{
	
	@Override
	public String acelerar() {
		return "El automovil acelera de 0 a 100 en 2.1 segundos";
	}
	
	@Override
	public String frenar() {
		return "El automovil esta frenando";
	}
}

class Motocicleta extends Vehiculo{
	
	@Override
	public String acelerar() {
		return "La motocicleta acelera de 0 a 100 en 2,6 segundos";
	}
	
	@Override
	public String frenar() {
		return "La motocicleta esta frenando";
	}
}
