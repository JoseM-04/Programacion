package Ejercicio_01;

public class Automovil extends Vehiculo {
	
	int tipoDeCombustible;

	public Automovil(String marca, String modelo, int año, int tipoDeCombustible) {
		super(marca, modelo, año);
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public int getTipoDeCombustible() {
		return tipoDeCombustible;
	}

	public void setTipoDeCombustible(int tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
	
}
