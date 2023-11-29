import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio57 {
  public static void main(String[] args) {
    
    int altura;
    int nivel = 1;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca la altura de la figura: ");
    altura = teclado.nextInt();

    //Pintamos la parte superior
    for (int i = 0; i < altura; i++) {
      System.out.print("*");
    }

    System.out.println("");
    //Pintamos la parte del medio con un for para controlar los niveles
    for (int i = 1; i < altura; i++) {
      
      //Pintamos espacios en blanco por delante
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }


      //Pintamos asterisco del borde
      System.out.print("*");

      //Pintamos espacios en blanco interior
      for (int j = 0; j < (altura-i)-2; j++) {
        System.out.print(" ");
      }

      nivel++;

      if (nivel<altura) {
        //Pintamos asterisco del borde
        System.out.print("*");  
      }
    
      System.out.println("");

    }
    
    teclado.close();
  }
}
