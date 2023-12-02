import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio61 {
  public static void main(String[] args) {
    
    int altura = 0;
    int nivel1 = 0;
    int nivel2 = 0;

    Scanner teclado = new Scanner(System.in);

    try {
      System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
      altura = teclado.nextInt();

      if (altura >=3) {
        nivel1 = altura;
        nivel2 = altura;

        System.out.println("");
        for (int i = 0; i < altura; i++) {

          //Espacios por delante
          for (int j = 0; j < altura-nivel1; j++) {
            System.out.print(" ");
            
          }

          //Asteriscos izq
          for (int j = 0; j < 3; j++) {
            System.out.print("*");
          }

          //Espacios intermedios
          for (int j = 0; j < (nivel2*2)-2; j++) {
            System.out.print(" ");
          }

          //Asteriscos dcha
          for (int j = 0; j < 3; j++) {
            System.out.print("*");
          }

          System.out.println("");
          nivel1--;
          nivel2--;
        }

        System.out.println("");

        teclado.close();      
      } else {
        System.out.println("La altura debe ser mayor o igual a 3.");
      }      
    } catch (InputMismatchException e) {
      System.out.println("Por favor, introduzca solo números. Letras no son admitidas");
    }


  }
}
