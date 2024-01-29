package Ejercicio_01;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Uso_Empleado {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Dime tu nombre : ");
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Dime el sueldo : "));
		int año =Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia"));
      
        Empleado emp = new Empleado(nombre, sueldo, año, mes, dia);
        
        JOptionPane.showMessageDialog(null, emp.getNombre() + "\n" + emp.getSueldo() + "\n" + emp.getAlta_contrato());
     
	}

}

class Empleado{

	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes -1, dia);
		
		alta_contrato  = calendario.getTime();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getAlta_contrato() {
		return alta_contrato;
	}
	
	public void subeSueldo (double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date alta_contrato;
	
}
