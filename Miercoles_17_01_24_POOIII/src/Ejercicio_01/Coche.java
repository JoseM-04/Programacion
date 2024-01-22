package Ejercicio_01;

public class Coche {

	private int ruedas, largo, ancho, motor, peso;
	private String datos;
	private boolean asientos_cuero;
	
	public Coche() {
		ruedas = 4;
		largo = 400;
		ancho = 250;
		motor = 1200;
		peso = 1000;
	}
	
	public int getRueda() {
		return ruedas;
	}
	
	public int getLargo() {
		return largo;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int getMotor() {
		return motor;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public String getDatos() {
		return "La plataforma del coche tiene " + ruedas + " ruedas" + " y mide " + largo/1000 + " metros con un ancho de " + ancho + 
				" centrimetros y un peso de plataforma de " + peso + " Kg"; 
	}
	
	public String dime_asientos() {
		if (asientos_cuero) {
			return "El coche tiene asientos de cuero";
		}else {
			return "Tus asientos son de pena.";
		}
	}
	
	public void setRueda(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public void setMotor(int motor) {
		this.motor = motor;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setDatos(String datos) {
		this.datos = datos;
	}
	
	public void configura_asientos(String asientos_cuero) {
		if(asientos_cuero=="si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
}
