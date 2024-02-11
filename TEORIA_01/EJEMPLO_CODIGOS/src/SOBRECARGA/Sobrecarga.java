  package SOBRECARGA;

public class Sobrecarga {
	
	public static void main(String[] args) {
		
		//Creamos la instancia
		Operaciones suma = new Operaciones();
		System.out.println(suma.sumar(1, 2));
		System.out.println(suma.sumar(1, 2.5));
		System.out.println(suma.sumar(1, 2, 3, 4));
	}

}

/*Creamos la clase operaciones que contiene los metodos sumar, cada uno
con diferentes parametros*/
class Operaciones{
	
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public double sumar(double a, double b) {
		return a + b;
	}
	
	public int sumar(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}
