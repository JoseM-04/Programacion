package Principal;

import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {
		
    	int filas = 7;
    	int columnas = 7;
    	char [][] asientos = new char[filas][columnas];
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = '0';
            }
        }
    	
    	while (true) {
			
        System.out.print("Ingrese el número de fila (1-" + filas + "): ");
        int fila = scanner.nextInt();

        System.out.print("Ingrese el número de columna (1-" + columnas + "): ");
        int columna = scanner.nextInt();
        
        if (asientos[fila - 1][columna - 1] == '0') {
            asientos[fila - 1][columna - 1] = 'X'; 
            System.out.println("¡Asiento reservado con éxito!");
        } else {
            System.out.println("¡Asiento ocupado!... Elije otro.");
            System.out.println("----------------------------------------");
        }
    	
    	System.out.println("Actualizacion de los asientos:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
        
	}
    
}
 
}
