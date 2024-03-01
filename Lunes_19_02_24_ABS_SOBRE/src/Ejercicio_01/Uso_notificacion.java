package Ejercicio_01;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Uso_notificacion {
	
	public static void main(String[] args) {
		
		int opciones;
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String strDate = formatter.format(date);
				 
		do {
			
			opciones = Integer.parseInt(JOptionPane.showInputDialog("Mostrar notificaciones :\n" + 
																											"1. Correo Electronico\n" + 
																											"2. SMS\n" + 
																											"3. Notificaciones de APP\n" + 
																											"0. Salir"));
			
			switch(opciones) {
			
				case 1:
					String usuario = JOptionPane.showInputDialog("Ingresa tu correo electronico : ");
					String destinatario = JOptionPane.showInputDialog("Ingresa el correo electronico del destinatario : ");
					String asunto = JOptionPane.showInputDialog("Ingresa el asunto : ");
					String mensaje = JOptionPane.showInputDialog("Ingresa el mensaje : ");
					CorreoElectronico correo = new CorreoElectronico(mensaje, destinatario, usuario, asunto, date);
					JOptionPane.showMessageDialog(null, correo.enviar());
					break;
			
				case 2:
					String contacto = JOptionPane.showInputDialog("Ingresa el nombre del contacto : ");
					int numcontacto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero del contacto : "));
					String correocontacto = JOptionPane.showInputDialog("Ingresa el correo del contacto : ");
					String mensajecorreo = JOptionPane.showInputDialog("Escribe el mensaje : ");
					SMS sms = new SMS(numcontacto, contacto, correocontacto, mensajecorreo);
					JOptionPane.showInternalMessageDialog(null, sms.enviar());
					break;
					
				case 3:
					String app = JOptionPane.showInputDialog("Ingresa el nombre de la APP : ");
					String noti = JOptionPane.showInputDialog("Ingresa el mensaje : ");
					NotificacionApp notify = new NotificacionApp(date, noti, app);
					JOptionPane.showMessageDialog(null, notify.enviar());
					
				case 0:
					JOptionPane.showMessageDialog(null, "Adios!!!");
					break;
			
				default:
					JOptionPane.showMessageDialog(null, "Opcion no valida");
			}
		} while (opciones != 0);
	}
}
