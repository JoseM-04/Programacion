package Ejercicio_03;

public abstract class FiguraGeometrica {

	String colorLinea, colorRelleno;
	
	public FiguraGeometrica(String colorLinea, String colorRelleno) {
		super();
		this.colorLinea = colorLinea;
		this.colorRelleno = colorRelleno;
	}

	public abstract String dibujar();
	
	public abstract double calcularArea(); 
	
	public abstract String mostrarDetalles();
}

class Circulo extends FiguraGeometrica{
	
	private double radio;
	private int dibujar;

	public Circulo(String colorLinea, String colorRelleno, double radio, int dibujar) {
		super(colorLinea, colorRelleno);
		this.radio = radio;
		this.dibujar = dibujar;
	}
	
	public Circulo(String colorLinea, String colorRelleno) {
		super(colorLinea, colorRelleno);		
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public int getDibujar() {
		return dibujar;
	}

	public void setDibujar(int dibujar) {
		this.dibujar = dibujar;
	}

	@Override
	public String dibujar() {
		
		switch (dibujar) {
		case 1:
			return "El color del relleno del circulo es " + colorRelleno;

		case 2:
			return "El color del borde del circulo es " + colorLinea;
			
		case 3: 
			return "El color del borde y el relleno del circulo respectivamente es " + colorLinea + " - " + colorRelleno;
			
		case 4: 
			return null;
			
		default:
			return "Error, opcion no valida";
		}
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public String mostrarDetalles() {
		return "CIRCULO :\n" + 
				  "Info : " + dibujar() + "\n" + 
				  "Area : " + calcularArea();
	}
}

class Rectangulo extends FiguraGeometrica{
	
	private double base, altura;
	private int dibujar;

	public Rectangulo(double base, double altura, int dibujar, String colorLinea, String colorRelleno) {
		super(colorLinea, colorRelleno);
		this.altura = altura;
		this.base = base;
		this.dibujar = dibujar;
	}

	public Rectangulo(String colorLinea, String colorRelleno) {
		super(colorLinea, colorRelleno);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String dibujar() {
		
		switch (dibujar) {
		case 1:
			return "El color del relleno del rectangulo es " + colorRelleno;

		case 2:
			return "El color del borde del rectangulo es " + colorLinea;
			
		case 3: 
			return "El color del borde y el relleno del rectangulo respectivamente es " + colorLinea + " - " + colorRelleno;
			
		case 4: 
			return null;
			
		default:
			return "Error, opcion no valida";
		}
	}
	
	@Override
	public double calcularArea() {
		return base * altura;
	}
	
	public String mostrarDetalles() {
		return "RECTANGULO :\n" + 
				  "Info : " + dibujar() + "\n" + 
				  "Area : " + calcularArea();
	}
}

class Triangulo extends FiguraGeometrica{
	
	private double base, altura;
	private int dibujar;
	
	public Triangulo(double base, double altura, int dibujar,String colorLinea, String colorRelleno) {
		super(colorLinea, colorRelleno);
		this.altura = altura;
		this.base = base;
		this.dibujar = dibujar;
	}
	
	public Triangulo(String colorLinea, String colorRelleno) {
		super(colorLinea, colorRelleno);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDibujar() {
		return dibujar;
	}

	public void setDibujar(int dibujar) {
		this.dibujar = dibujar;
	}
	
	@Override
	public String dibujar() {
		
		switch (dibujar) {
		case 1:
			return "El color del relleno del triangulo es " + colorRelleno;

		case 2:
			return "El color del borde del triangulo es " + colorLinea;
			
		case 3: 
			return "El color del borde y el relleno del triangulo respectivamente es " + colorLinea + " - " + colorRelleno;
			
		case 4: 
			return null;
			
		default:
			return "Error, opcion no valida";
		}
	}
	
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	@Override
	public String mostrarDetalles() {
		return "TRIANGULO :\n" + 
				  "Info : " + dibujar() + "\n" + 
				  "Area : " + calcularArea();
	}
}