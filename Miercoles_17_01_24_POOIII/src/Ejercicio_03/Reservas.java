package Ejercicio_03;

public class Reservas {
	
	private int numero;
	private boolean ocupada;
	
	public Reservas(int numero) {
		this.numero  = numero;
		this.ocupada = false;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean getOcupada() {
		return ocupada;
	}
	
	public void reservar() {
		ocupada  = true;
		System.out.println("Habitacion " + numero + " reservada!!!");
	}
	
	public void cancelarReserva() {
		ocupada = false;
		System.out.println("Reserva de la habitacion " + numero + " cancelada!!!");
	}

}

class Hotel{
	
	private Hotel[] habitaciones;

	public Hotel(int numHabitaciones) {
		habitaciones = new Hotel[numHabitaciones];
		for(int i = 0; i < numHabitaciones; i++) {
			habitaciones[i] = new Hotel(i+1);
		}
	}

	public void Disponibilidad() {
		System.out.println("Habitaciones disponibles : ");
		for(Hotel habitacion : habitaciones) {
			
		}
	}	
}