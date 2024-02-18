package Ejercicio_03;

public class Uso_Animal {

	public static void main(String[] args) {
		
		Animal perro = new Perro();
		Animal gato = new Gato();
		
		System.out.println("Perro : ");
		System.out.println(perro.hacerSonido());
		System.out.println(perro.moverse());
		System.out.println();
		System.out.println("Gato : ");
		System.out.println(gato.hacerSonido());
		System.out.println(gato.moverse());		
	}
}
