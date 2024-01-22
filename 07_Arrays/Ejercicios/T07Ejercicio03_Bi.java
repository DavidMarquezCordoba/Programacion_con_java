import java.util.Scanner;

/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.

Modifica el programa anterior de tal forma que los números 
que se introducen en el array se generen de forma aleatoria (valores entre 100 y 999)
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio03_Bi {
  public static void main(String[] args) {
    
    int [][] tabla = new int [4][5];

    int sumaFila;
    int sumaColumnas;
    int sumaTotal = 0;

    //Lo usaremos para los índices del bucle for
    int fila;
    int columna;

    // System.out.println("Número de filas");
    Scanner teclado = new Scanner(System.in);

    //Rellenar el Array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*900 + 100);
      }
    }

    //Mostrar el array bidi + sumatoria de cada fila
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila= 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("|%8d   ", tabla[fila][columna]);
        sumaFila+=tabla[fila][columna];
      }
      System.out.print("|");
      System.out.print("  "+sumaFila);
      System.out.println("");
    }

    //Le damos la vuelta para hacer la sumatoria de columnas
    System.out.println("-------------------------------------------------------------");

    for (int j = 0; j < tabla[0].length; j++) {
      sumaColumnas = 0;
      for (int i = 0; i < tabla.length; i++) {
        sumaColumnas+=tabla[i][j];
      }
      sumaTotal+=sumaColumnas;
      System.out.printf("|%8d   ", sumaColumnas);
    }

    System.out.printf("| %d", sumaTotal);

    teclado.close();
  }
}
