import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author David Márquez Córdoba
 */
public class T05Ejercicio54 {
  public static void main(String[] args) {
    
    int altura = 0;
    int nivel = 1;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca la altura de la figura: ");
    altura = teclado.nextInt();

    //Pintamos parte de arriba
    for (int j = 0; j < altura; j++) {
      System.out.print("*");
    }
    System.out.println("");

    //Controlamos los niveles, para que vaya disminuyendo
    for (int i = 1; i < altura; i++) {

      //Pintamos el caracter izquierdo
      System.out.print("*");

      //Pintamos espacios por dentro -i porque reduce en cada nivel 1 y -2 porque son los espacios reservados por los asteriscos
      for (int j = 0; j < (altura-i)-2; j++) {
        System.out.print(" ");
      }

      //Subimos un nivel, que controlará si se pintará o no el último asterisco antes de finalizar.
      nivel++;

      //Mientras que no sea el último nivel, seguirá pintando asteriscos y habrá salto de nivel para el siguiente.
      if (nivel < altura) {
        System.out.print("*");
      }      
      System.out.println("");

    }

    teclado.close();
  }
}
