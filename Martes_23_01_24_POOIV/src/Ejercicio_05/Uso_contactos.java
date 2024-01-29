package Ejercicio_05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Uso_contactos {

	public static void main(String[] args) {
		
		ArrayList<Contactos> sistema = new ArrayList<>();
		
		while(true) {
			
			int opciones = Integer.parseInt(JOptionPane.showInputDialog("1. Añadir contacto \n2. Buscar contacto \n3. Mostrar contactos \n4. Salir"));
			
			switch(opciones) {
			
				case 1 : 
					
					String nombre = JOptionPane.showInputDialog("Ingresa nombre del contacto : ");
					int numtelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de telefono del contacto : "));
					String email = JOptionPane.showInputDialog("Ingresa email del contacto : ");
					sistema.add (new Contactos(nombre, email, numtelefono));
					break;
					
				case 2 :
					
					String buscarcon = JOptionPane.showInputDialog("Ingresa el nombre del contacto existente : ");
					
					for (Contactos contacto : sistema) {
						if (contacto.getNombre().equals(buscarcon)) {
							JOptionPane.showConfirmDialog(null, "Nombre : " + contacto.getNombre() + "\nNumero de telefono : " + contacto.getNumtelefono() + "\nEmail : " + contacto.getEmail());
							break;
						}
					}
					break;
					
				case 3 : 
					
					for(Contactos contacto : sistema) {
						JOptionPane.showConfirmDialog(null, "Nombre : " + contacto.getNombre() + "\nNumero de telefono : " + contacto.getNumtelefono() + "\nEmail : " + contacto.getEmail());
					}
					break;
					
				case 4 : 
					
					System.exit(0);
					
				default :
					
					JOptionPane.showMessageDialog(null, "Opcion no valida.");
	
			}
		}
	}
}
