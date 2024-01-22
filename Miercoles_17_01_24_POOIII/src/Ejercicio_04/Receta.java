package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Receta {

	private List<String> ingredientes;
	private List<String> pasos;
	
	public Receta() {
		this.ingredientes = new ArrayList<>();
		this.pasos = new ArrayList<>();
	}
	
	public void aggIngredientes(String ingrediente) {
		ingredientes.add(ingrediente);
	}
	
	public void elimIngredientes(String ingrediente) {
		ingredientes.remove(ingrediente);
	}
	
	public void aggPaso(String paso) {
		pasos.add(paso);
	}
	
	public void mostrarReceta() {
		System.out.println("Receta del dia : ");
		System.out.println("Ingredientes : ");
		for (String ingrediente : ingredientes) {
			System.out.println(" - " + ingrediente);
		}
		
		System.out.println("Pasos : ");
		for (int i = 0; i < pasos.size(); i++) {
			System.out.println((i+1) + " - "  + pasos.get(i));
		}
	}
}
