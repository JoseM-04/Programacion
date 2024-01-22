package Ejercicio_01;

public class Uso_coche {

	public static void main(String[] args) {
		
		Coche c = new Coche();
		c.setAncho(c.getAncho());
		c.setLargo(c.getLargo());
		c.setMotor(c.getMotor());
		c.setPeso(c.getPeso());
		c.setRueda(c.getRueda());
		c.setDatos(c.getDatos());
		c.configura_asientos("si");
		
		System.out.println(c.getAncho());
		System.out.println(c.getLargo());
		System.out.println(c.getMotor());
		System.out.println(c.getPeso());
		System.out.println(c.getRueda());
		System.out.println(c.getDatos());
		System.out.println(c.dime_asientos());
	}
}
