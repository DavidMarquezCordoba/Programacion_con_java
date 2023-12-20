import java.util.Scanner;

/**
 * Ejemplo de Array - 02
 * 
 * @author David Márquez Córdoba
 */

public class Array02 {
  public static void main(String[] args) {
    
            // FORMA DE CREAR 2 //
    // int [] nomVariable = new int [5];

    // nomVariable[0] = 8;
    // nomVariable[1] = 33;
    // nomVariable[2] = 200;
    // nomVariable[3] = 150;
    // nomVariable[4] = 11;

            // FORMA DE CREAR 3 //
    int[] nomVariable = {8, 33, 200, 150, 11};
    

    System.out.println("El array nomVariable tiene 5 elementos ¿cuál de ellos quiere ver?");
    System.out.print("Introduzca un número del 0 al 4: ");

    Scanner teclado = new Scanner(System.in);

    int indice = teclado.nextInt();

    System.out.printf("El número que se encuentra en la posición %d es el %d", indice, nomVariable[indice]);

    teclado.close();
  }
}
