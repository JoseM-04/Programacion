package Ejercicio_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reloj {
	
	private String hora_alarma, hora_actual;
	private boolean est_alarma;
	
	public Reloj() {
		hora_alarma = "Definimos en el main";
		hora_actual = obtenerHoraActual();
		est_alarma = false;
	}

	public String getHora_alarma() {
		return hora_alarma;
	}

	public void setHora_alarma(String hora_alarma) {
		this.hora_alarma = hora_alarma;
	}

	public String getHora_actual() {
		return hora_actual;
	}

	public void setHora_actual() {
		this.hora_actual = obtenerHoraActual();
	}

	public boolean getActivada() {
		return est_alarma;
	}

	public void setActivarDesctivar(boolean activada) {
		this.est_alarma = activada;
	}
	
	public void comprobacion() {
		if (est_alarma && hora_actual.equals(hora_alarma)) {
			System.out.println("Alarma sonando");
		}
		else {
			System.out.println("Siga durmiendo... son las " + hora_actual);
		}
	}
	
	private String obtenerHoraActual() {
		SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
		return formatoHora.format(new Date());
	}
}
