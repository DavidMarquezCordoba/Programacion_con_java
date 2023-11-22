/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio23 {
  public static void main(String[] args) {
    
    int numIntroducido;
    int bote=0;
    int contadorNumerosContandoCeros=0;
    int contadorNumerosMedia = 0;
    double media = 0;

    final int LIMITE = 10000;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("Bienvenidos al acumulador de Campanillas");
    System.out.println("========================================");
    System.out.println("");
    System.out.println("Límite 10000");
    System.out.println("************");
    System.out.println("Superado el límite, se mostrará");
    System.out.println("");
    System.out.println("1. Total acumulado");
    System.out.println("2. Cantidad de números introducidos");
    System.out.println("3. La media de todos los números");
    System.out.println("");
    
    do {
      do {
        System.out.print("Introduce un número: ");
        numIntroducido = teclado.nextInt();

        //Acumulamos valores en un bote
        bote+=numIntroducido;

        //Aumentamos contador de número introducidos
        contadorNumerosContandoCeros++;
        
        //Averiguamos la media, 
        if (numIntroducido>0) {
          contadorNumerosMedia++;
          media = bote / contadorNumerosMedia;
        }
        
        
      } while ((numIntroducido>=0)&& bote<=LIMITE);
    } while (bote<=LIMITE); //Controlamos que se repita el proceso hasta superar el límite

    System.out.println("");
    System.out.println("Resultados");
    System.out.println("==========");
    System.out.println("1. En total has sumado "+bote);
    System.out.println("Has introducido "+contadorNumerosContandoCeros+" números (incluyendo el 0)");
    System.out.println("La media de todos los números es "+ media+ " (excluyendo los ceros)");
    System.out.println("");
    teclado.close();
  }
}
