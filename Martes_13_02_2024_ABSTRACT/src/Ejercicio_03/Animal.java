package Ejercicio_03;

public abstract class Animal {
	
	public abstract String hacerSonido();
	public abstract String moverse();
}

class Perro extends Animal{
	
	@Override
	public String hacerSonido() {
		return "Ladrar";
	}
	
	@Override
	public String moverse() {
		return "Los perros se mueven con normalidad";
	}
}

class Gato extends Animal{
	
	@Override
	public String hacerSonido() {
		return "Maullar";
	}
	
	@Override
	public String moverse() {
		return "Los gatos van con discrecion";
	}
}
