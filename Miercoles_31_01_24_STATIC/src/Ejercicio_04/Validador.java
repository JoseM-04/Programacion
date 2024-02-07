package Ejercicio_04;

public class Validador {
	
    public static boolean esNumero(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean enRango(int numero, int min, int max) {
        return numero >= min && numero <= max;
    }

    public static void main(String[] args) {
 
        String cadena = "o";
        int numero = 21;

        System.out.println(esNumero(cadena) ? "La cadena es un número" : "La cadena no es un número");

        System.out.println(enRango(numero, 1, 20) ? "El número está en el rango" : "El número no está en el rango");
    }

}
