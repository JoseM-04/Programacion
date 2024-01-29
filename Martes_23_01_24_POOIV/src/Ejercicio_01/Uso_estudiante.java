package Ejercicio_01;

import javax.swing.JOptionPane;

public class Uso_estudiante {

	public static void main(String[] args) {
	
	    Estudiantes estudiante1 = crearEstudiante();
	    Estudiantes estudiante2 = crearEstudiante();
	    Estudiantes estudiante3 = crearEstudiante();

	    mostrarInformacionEstudiante(estudiante1);
	    mostrarInformacionEstudiante(estudiante2);
	    mostrarInformacionEstudiante(estudiante3);
	    
	}

	public static Estudiantes crearEstudiante() {
	    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante :");
	    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante :"));
	    String grado = JOptionPane.showInputDialog("Ingrese el grado del estudiante :");

	    return new Estudiantes(nombre, edad, grado);
	}

	public static void mostrarInformacionEstudiante(Estudiantes estudiante) {
		JOptionPane.showMessageDialog(null, "Información del estudiante:\nNombre: " + estudiante.getNombre()
	    + "\nEdad: " + estudiante.getEdad() + "\nGrado: " + estudiante.getGrado());
	}
	

}
