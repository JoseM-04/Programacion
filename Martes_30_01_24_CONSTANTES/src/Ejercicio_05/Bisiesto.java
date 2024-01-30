package Ejercicio_05;

import javax.swing.JOptionPane;

public class Bisiesto {
	
	public static void main(String[] args) {
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año : "));
		
		bisiestoa a = new bisiestoa(ano);
		
		JOptionPane.showMessageDialog(null, a.anoBisiesto());
		
	}

}

class bisiestoa{
	
	private int anno;
	private final int num1, num2, num3, num4;
	
	public bisiestoa(int anno) {
		this.anno = anno;
		this.num1 = 4;
		this.num2 = 100;
		this.num3 = 400;
		this.num4 = 0;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getNum3() {
		return num3;
	}
	
	public int getNum4() {
		return num4;
	}

	public String anoBisiesto() {
		if ((anno % num1 == num4 && anno % num2 != num4) || (anno % num2 == num4 && anno % num3 == num4)) {
			return "Año " + anno + " es bisiesto";
		}
		else {
			return "Año " + anno + " no es bisiesto";
		}
	}
}