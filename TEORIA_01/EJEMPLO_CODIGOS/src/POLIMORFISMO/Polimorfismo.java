package POLIMORFISMO;

public class Polimorfismo {
	
	/*Creamos el metodo moverTransporte que puede recibir instancias de cualquier 
	clase que implemente la interfaz "Transporte"*/
	public static void moverTransporte(Transporte transporte) {
		transporte.mover();
	}
	
	public static void main(String[] args) {
		
		/*Creamos la instancia de avion y barco y la tratamos como objetos de 
		tipo transporte*/
		Transporte avion = new Avion();
		Transporte barco = new Barco();
		
		//Pasamos las instancuas como argumentos al metodo "moverTransporte" 
		moverTransporte(avion);
		moverTransporte(barco);
	}

}

//Creamos la interfaz transporte que define el metodo mover
interface Transporte{
	void mover();
}

//Creamos las clases avion y barco implementando la interfaz transporte
class Avion implements Transporte{
	
	@Override
	public void mover() {
		System.out.println("Volando por el aire");
	}
}

class Barco implements Transporte{
	
	@Override
	public void mover() {
		System.out.println("Navegando por el agua");
	}
}