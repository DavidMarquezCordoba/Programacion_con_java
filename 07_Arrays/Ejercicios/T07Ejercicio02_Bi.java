import java.util.Scanner;

/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio02_Bi {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int [][] arrayNumeros = new int[4][5];
    int sumaFila = 0;
    int sumaColumna = 0;
    int sumaTotal = 0;

    //Rellenamos 20 números
    System.out.println("\nIntroduzca 20 números enteros: ");
    for (int fila = 0; fila < arrayNumeros.length; fila++) {

      for (int columna = 0; columna < arrayNumeros[fila].length; columna++) {
        System.out.print("Introduzca un número -> ");
        arrayNumeros[fila][columna] = teclado.nextInt();
      }
    }

    System.out.println("");

    //Mostramos por pantalla y sumamos cada una de las filas
    for (int fila = 0; fila < arrayNumeros.length; fila++) {

      for (int columna = 0; columna < arrayNumeros[fila].length; columna++) {
        System.out.printf("%5d", arrayNumeros[fila][columna]);
        sumaFila+=arrayNumeros[fila][columna];
      }
      System.out.print("| "+sumaFila);
      System.out.println("");
      sumaFila = 0;
      
    }

    System.out.println("-------------------------|---");

    //Ahora recorremos el bucle al revés 1º columnas y luego filas y sumamos cada una de las columnas
    for (int columna = 0; columna < 5; columna++) {
      //Reseteamos valor de la suma parcial columna
      sumaColumna = 0;

      for (int fila = 0; fila < 4; fila++) {
        sumaColumna+=arrayNumeros[fila][columna];
        
      }

      sumaTotal+=sumaColumna;
      System.out.printf("%5d", sumaColumna);

    }

    System.out.printf("%4d", sumaTotal);












    teclado.close();
  }
}
