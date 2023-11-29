import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio53 {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    
    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduzca la altura de la figura: ");
    numeroIntroducido = teclado.nextInt();

    System.out.println("");

    //Con el primer for vamos recorriendo niveles, para que en cada iteración el nivel o planta vaya bajando
    for (int i = 0; i < numeroIntroducido; i++) {
      //Con el segundo for vamos pintando asteriscos, para que en cada iteración/planta vaya disminuyendo 1
      for (int j = 0; j < numeroIntroducido-i; j++) {
        System.out.print("*");
      }
      //Añadimos el salto de línea y pinte abajo el siguiente nivel
      System.out.println("");
    }

    System.out.println("");

    teclado.close();
  }
}