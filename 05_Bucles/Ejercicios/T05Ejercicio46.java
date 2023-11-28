import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio46 {
  public static void main(String[] args) {
    
    String asterisco = "*";
    int anchura = 0;
    int altura = 0;
    int nivel = 1;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");

    do {
      System.out.printf("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
      anchura = teclado.nextInt();

      if (anchura >=2) {
        System.out.printf("Ahora introduzca la altura (como mínimo 2): ");
        altura = teclado.nextInt();

        if (anchura >=2) {
          //Pintamos la capa superior
          for (int i = 0; i < anchura; i++) {
            System.out.print(asterisco);
          }

          System.out.println("");

          //Pintamos el centro
          while (nivel <= altura-2) {
            System.out.print(asterisco);
            for (int i = 0; i < anchura-2; i++) {
              System.out.print(" ");
            }
            System.out.print(asterisco);
            System.out.println("");
            nivel++;
          }

          for (int i = 0; i < anchura; i++) {
            System.out.print(asterisco);
          }

          System.out.println("");          

        } else {
          System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        }
      } else {
        System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
      }
    } while (anchura <2);

    teclado.close();
  }
}
