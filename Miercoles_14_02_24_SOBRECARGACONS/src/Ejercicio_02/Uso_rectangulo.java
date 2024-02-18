package Ejercicio_02;

public class Uso_rectangulo {

	public static void main(String[] args) {
		
		Rectangulo rec1 = new Rectangulo(23.2, 5.7);
		Rectangulo rec2 = new Rectangulo(10, 5);
		Rectangulo rec3 = new Rectangulo();
		
		System.out.println("Rectangulo 1 : \n" + "Perimetro : " + rec1.perimetro() + "\n" + "Area : " + rec1.area());
		System.out.println();
		System.out.println("Rectangulo 2 : \n" + "Perimetro : " + rec2.perimetro() + "\n" + "Area : " + rec2.area());
		System.out.println();
		System.out.println("Rectangulo 3 : \n" + "Perimetro : " + rec3.perimetro() + "\n" + "Area : " + rec3.area());
	}
}
