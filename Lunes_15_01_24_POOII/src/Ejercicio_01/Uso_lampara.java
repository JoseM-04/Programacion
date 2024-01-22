package Ejercicio_01;

public class Uso_lampara {

	public static void main(String[] args) {
		
		Lampara Philips = new Lampara();
		Philips.setcolor(Philips.getcolor());
		Philips.setpotencia(Philips.getpotencia());
		Philips.settipo(Philips.gettipo());
		
		System.out.println(Philips.getcolor());
		System.out.println(Philips.getpotencia());
		System.out.println(Philips.gettipo());
	}
}
