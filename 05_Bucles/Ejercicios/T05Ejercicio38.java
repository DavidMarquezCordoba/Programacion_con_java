import java.util.Scanner;

/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio38 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int altura;
    int mitad;
    int nivel = 0;
    int asteriscos = 1;

    System.out.print("Por favor, introduzca la altura del reloj de arena: ");
    altura = teclado.nextInt();
    System.out.println("");

    mitad = (altura-1)/2;

    if ((altura >= 3) && (altura % 2 != 0)) {

      //Controlamos altura de la primera mitad (superior)
      for (int i = 0; i < mitad; i++) {

        //Pintamos los espacios
        for (int j = 0; j < i; j++) {
          System.out.print(" ");
        }

        //Pintamos los asteriscos
        for (int j = 0; j < altura - nivel; j++) {
          System.out.print("*");
        }
        
        nivel+=2;
        System.out.println("");
      } 

      // Pintamos la altura de la segunda mitad (Inferior) - Una pirámide normal

      //Controlamos la altura de la pirámide, que será la mitad de la altura +1, ya que en la parte superior, solo hicimos la mitad -1
      for (int i = 0; i < mitad+1; i++) {
        
        //Pintamos espacios, cada planta restará 1 espacio en blanco
        for (int j = 0; j < mitad - i; j++) {
          System.out.print(" ");
        }

        //Sabemos que cada planta, aumentará 2 asteriscos más, por lo que después de la iteración aumentaremos en +2
        for (int j = 0; j < asteriscos; j++) {
          System.out.print("*");
        }

        //Aumentamos 2
        asteriscos+=2;


        System.out.println("");
        
      }

      System.out.println("");
      
    } else {
      System.out.println("");
      System.out.println(" La altura debe ser impar y mayor o igual a 3");
    }

    teclado.close();
  }
}


// Por favor, introduzca la altura del reloj de arena: 5

// *****
//  ***
//   *
//  ***
// *****