import java.util.Scanner;

/**
 * Ejemplo de Arrays - 06
 * 
 * Usaremos la clase Math y su generador de números aleatorios
 * 
 * @author David Márquez Córdoba
 */

public class Array06 {
  public static void main(String[] args) {
    
    String color [] = {"Rojo", "Amarillo", "Verde", "Blanco", "Azul", "Negro"};

    System.out.println("\nGenerador de Banderas Aleatorio");
    System.out.println("================================\n");

    Scanner teclado = new Scanner(System.in);

    System.out.print("¿Cuántas franjas quiere para la bandera?:");
    int franjas = teclado.nextInt();

    System.out.println("------------------");
    for (int i = 0; i < franjas; i++) {
      System.out.println(color[(int)(Math.random()*6)]);
      System.out.println("------------------");
    }
    teclado.close();
  }
}
