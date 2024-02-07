package Ejercicio_05;

public class contadorDeLlamadas {
	
	private static int contador = 0;
	
	public static void mensaje() {
		System.out.println("Hola profe :)");
		contador ++;
	}
	
	public static int vecesContadas(){
		return contador;
	}
	
	public static void main(String[] args) {
		
		contadorDeLlamadas.mensaje();
		contadorDeLlamadas.mensaje();
		contadorDeLlamadas.mensaje();
		contadorDeLlamadas.mensaje();
		contadorDeLlamadas.mensaje();
		contadorDeLlamadas.mensaje();
		contadorDeLlamadas.mensaje();
		
		System.out.println("El metodo emprimir se ha llamado " + contadorDeLlamadas.vecesContadas() + " veces");
		
	}
}
