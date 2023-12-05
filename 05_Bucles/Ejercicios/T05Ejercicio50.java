import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio50 {
  public static void main(String[] args) {
    
    int altura = 0;
    int espaciosEntreNumeros = 0;
    int diferencia = 0;

    Scanner teclado = new Scanner(System.in);

    try {
      do {

        System.out.println("");
        System.out.print("Introduzca la altura (5 como mínimo): ");
        altura = teclado.nextInt(); 
        
        if (altura >= 5) {

          do {
            System.out.println("");
            System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
            espaciosEntreNumeros = teclado.nextInt();
  
            if (espaciosEntreNumeros<1) {
              System.out.println("");
              System.out.println("El espacio mínimo es 1");
            }

          } while (espaciosEntreNumeros < 1);

        } else {
          System.out.println("");
          System.out.println("La altura mínima es 5");
        }
  
      } while (altura < 5);

      diferencia = (altura - 4)-1;

      //Primer nivel
        
      System.out.print("*");

      for (int j = 0; j < espaciosEntreNumeros; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < espaciosEntreNumeros; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }

      System.out.println("");

      //Segundo nivel

      System.out.print("*");

      for (int j = 0; j < espaciosEntreNumeros; j++) {
        System.out.print(" ");
      }
      
      System.out.print("*");

      for (int j = 0; j < espaciosEntreNumeros+3; j++) {
        System.out.print(" ");
      }

      System.out.print("*");

      System.out.println("");

      //Tercer nivel

      System.out.print("*");

      for (int j = 0; j < espaciosEntreNumeros; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < espaciosEntreNumeros; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }

      System.out.println("");

      // Cuarto nivel

      System.out.print("*");    

      for (int j = 0; j < espaciosEntreNumeros+3; j++) {
        System.out.print(" ");
      }

      System.out.print("*");  

      for (int j = 0; j < espaciosEntreNumeros+3; j++) {
        System.out.print(" ");
      }    

      System.out.print("*");  

      System.out.println("");

      // Quinto nivel

      //Ahora se va a estar repitiendo según la altura introducida
      
      for (int i = 0; i < diferencia; i++) {
        
        System.out.print("*");  

        for (int j = 0; j < espaciosEntreNumeros+3; j++) {
          System.out.print(" ");
        }

        System.out.print("*"); 

        for (int j = 0; j < espaciosEntreNumeros+3; j++) {
          System.out.print(" ");
        } 
        
        System.out.print("*"); 

        System.out.println("");
      }

      //Empezamos a pintar la base

      System.out.print("*");

      for (int j = 0; j < espaciosEntreNumeros; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < espaciosEntreNumeros; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }

      System.out.println("");  

    } catch (InputMismatchException e) {
      System.out.println("ERROR: Solo se pueden introducir números");
    }

    teclado.close();
  }
}
