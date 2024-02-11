package POLIMORFISMO_PARAMETRICO;

public class Poli_Parametrico {
	
	public static void main(String[] args) {
		
		//Creamos varias instancias con diferentes tipos de datos
		Contenedor<Integer> contenedorEntero = new Contenedor<>(10);
		System.out.println("Contenedor de enteros : " + contenedorEntero.getObjeto());
		
		Contenedor<String> contenedorCadena = new Contenedor<>("Hola, mundo");
		System.out.println("Contenedor de cadena : " + contenedorCadena.getObjeto());
		
		Contenedor<Double> contenedorDecimal = new Contenedor<>(12.4);
		System.out.println("Contenedor de decimales : " + contenedorDecimal.getObjeto());
	}

}

/*Creamos la clase generica, el parametro <S>  indica que la clase puede trabjar con
cualquier tipo de dato*/
class Contenedor<S>{
	
	private S objeto;
	
	//Generamos el constructor que recibe un objeto de tipo "S"
	public Contenedor(S objeto) {
		this.objeto = objeto;
	}

	//Metodos get y set
	public S getObjeto() {
		return objeto;
	}

	public void setObjeto(S objeto) {
		this.objeto = objeto;
	}
}
