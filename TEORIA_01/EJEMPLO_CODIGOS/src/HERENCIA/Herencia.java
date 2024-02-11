package HERENCIA;

public class Herencia {

	public static void main(String[] args) {
		
		//Creamos la instancia
		Figura rectangulo = new Rectangulo(6, 2);
		rectangulo.calcularArea();
	}
	
}

//Creamos la clase base
class Figura{
	
	double area;
	
	public void calcularArea() {
		System.out.println("Calculando el area de la figura");
	}
}

//Creamos la clase derivada llamada rectangulo 
class Rectangulo extends Figura{
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		//Area se hereda de la clase base figura
		area = base * altura;
		System.out.println("El area del rectangulo es : " + area);
	}
}
