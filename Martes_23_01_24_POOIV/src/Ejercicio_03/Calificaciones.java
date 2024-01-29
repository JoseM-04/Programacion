package Ejercicio_03;

public class Calificaciones {
	
	private String nomCurso;
	private double calificacion;
	
	public Calificaciones(String nomCurso, double calificacion) {
		this.nomCurso = nomCurso;
		this.calificacion = calificacion;
	}

	public String getNomCurso() {
		return nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	public String Categorizar() {
		switch ((int)calificacion) {
		case 0,1,2:
			return "F";
		case 3,4:
			return "D";
		case 5,6:
			return "E";
		case 7,8:
			return "C";
		case 9:
			return "B";
		default:
			return "A";
		}
	}
}
