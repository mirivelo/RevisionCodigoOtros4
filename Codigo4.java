/*
 /*
 * Este programa recrea el juego de piedra, papel o tijeras entre dos jugadores.
 * Se solicitan las jugadas a cada jugador y se determina el ganador
 * basándose en las reglas del juego. El programa ha sido refactorizado
 * para corregir errores, mejorar la legibilidad y optimizar el código.
 */

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase();
    
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();
    
        if (!isValid(j1) || !isValid(j2)) {
            System.out.println("No es válida una respuesta, intenta de nuevo");
            s.close();
            return;
        }
    
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close();
    }
    
    public static boolean isValid(String jugada) {
        return jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijeras");
    }
}