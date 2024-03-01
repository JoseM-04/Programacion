package Ejercicio_01;

import java.util.Date;

public abstract class Notificacion {

	String mensaje, destinatario;

	public Notificacion(String mensaje, String destinatario) {
		this.mensaje = mensaje;
		this.destinatario = destinatario;
	}

	public abstract String enviar();
}

class CorreoElectronico extends Notificacion{
	
	private String usuario, asunto;
	private Date fecha;

	public CorreoElectronico(String mensaje, String destinatario, String usuario, String asunto, Date fecha) {
		super(destinatario, mensaje);
		this.usuario = usuario;
		this.asunto = asunto;
		this.fecha = fecha;
	}
	
	public String enviar() {
		return "De : " + usuario + "\n" + "Para : " + destinatario + "\n" + "Fecha : " + fecha + 
				"\n" + "Asunto : " + asunto + "\n" + "Mensaje : \n" + mensaje;
	}
}

class SMS extends Notificacion{
	
	private int numeroContacto;
	private String contacto;
	
	public SMS(int numeroContacto, String contacto, String mensaje, String destinatario) {
		super(mensaje, destinatario);
		this.numeroContacto = numeroContacto;
		this.contacto = contacto;
	}
	
	public String enviar() {
		return contacto + " - " + numeroContacto + "\n" +  mensaje + "\n" + destinatario ;
	}
}

class NotificacionApp extends Notificacion{
	
	private Date fecha;

	public NotificacionApp(Date fecha, String mensaje, String destinatario) {
		super(mensaje, destinatario);
		this.fecha = fecha;
	}
	
	public String enviar() {
		return destinatario + " - " + fecha + "\n" + mensaje;
	}
}