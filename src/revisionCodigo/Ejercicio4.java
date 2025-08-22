package revisionCodigo;
/*
 * Este programa recrea el juego de piedra, papel o tijeras entre dos jugadores.
 * Se solicitan las jugadas a cada jugador y se determina el ganador
 * basándose en las reglas del juego. El programa ha sido refactorizado
 * para corregir errores, mejorar la legibilidad y optimizar el código.
 */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Se corrigió la inicialización del Scanner
    
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase(); // Se lee la jugada del J1 y se convierte a minúsculas
    
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se corrigió el mensaje para el J2
        String j2 = s.nextLine().toLowerCase();
    
        // Se valida que la entrada sea correcta 
        if (!isValid(j1) || !isValid(j2)) {
            System.out.println("No es válida una respuesta, intenta de nuevo");
            s.close();
            return;
        }
    
        // Comparativa
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2; // Asignamos g por defecto
            
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { // Se usa .equals() para comparar String
                        g = 1; // Si J1 es piedra, J2 tijeras gana J1
                    }
                    break; // Se añadió break
                case "papel":
                    if (j2.equals("piedra")) { // Se usa .equals() para comparar String
                        g = 1; // Si J1 es papel, J2 piedra gana J1
                    }
                    break; // Se añadió break
                case "tijeras":
                    if (j2.equals("papel")) { // Se usa .equals() para comparar String
                        g = 1; // Si J1 es tijeras y J2 es papel, gana J1
                    }
                    break; // Se añadió break
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close();
    } // main
    
    //  La función estaba fuera de la clase, se corrigió su posición
    public static boolean isValid(String jugada) {
        return jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijeras");
    } // isValid
} // Clase Codigo4