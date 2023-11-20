/*
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio28 {
  public static void main(String[] args) {
    
    String jugador1 = "";
    String jugador2 = "";

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    jugador1 = teclado.nextLine();

    boolean j1Piedra = jugador1.equals("piedra");
    boolean j1Papel = jugador1.equals("papel");
    boolean j1Tijeras = jugador1.equals("tijera");

    if (j1Piedra || j1Papel || j1Tijeras) {
      
      System.out.printf("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
      jugador2 = teclado.nextLine();

      boolean j2Piedra = jugador2.equals("piedra");
      boolean j2Papel = jugador2.equals("papel");
      boolean j2Tijeras = jugador2.equals("tijera");

      if (j2Piedra || j2Papel || j2Tijeras) {
        
        if ((j1Piedra && j2Tijeras) || (j1Papel && j2Piedra) || (j1Tijeras && j2Papel)) {
          System.out.println("Gana el jugador 1");
        } else if ((j2Papel && j1Piedra) || (j2Piedra && j1Tijeras) || (j2Tijeras && j1Papel)){
          System.out.println("Gana el jugador 2");
        } else if ((j1Piedra && j2Piedra) || (j1Papel && j2Papel) || (j1Tijeras & j2Tijeras)){
          System.out.println("Empate");
        }

      } else {
        System.out.println("Opción no válida del jugador 2");
      }
    } else {
      System.out.println("Opción no válida del jugador 1");
    }

    teclado.close();
  }
}
