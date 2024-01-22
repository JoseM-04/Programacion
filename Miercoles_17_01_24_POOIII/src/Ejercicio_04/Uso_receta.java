package Ejercicio_04;

public class Uso_receta {

	public static void main(String[] args) {
		
		Receta receta = new Receta();
		
		receta.aggIngredientes("Harina");
		receta.aggIngredientes("Agua");
		receta.aggPaso("Combinar la harina con el agua hasta forma una masa");
		receta.aggIngredientes("sal");
		receta.aggIngredientes("Chocolate");
		receta.aggPaso("Incorporar la sal y el chocolate a la masa");
		receta.aggPaso("Poner al horno por 10min");
		System.out.println("Receta completa : ");
		receta.mostrarReceta();
		
	}
}
