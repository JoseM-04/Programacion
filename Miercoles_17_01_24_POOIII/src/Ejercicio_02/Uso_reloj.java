package Ejercicio_02;

public class Uso_reloj {
	
	public static void main(String[] args) {
		Reloj reloj = new Reloj();
		
		reloj.setHora_alarma("13:41");
		reloj.setActivarDesctivar(true);
		reloj.getHora_actual();
		reloj.comprobacion();
		
	}

}
