/**
 * Ejemplos Arrays Bidimensionales - 01
 * 
 * @author David Márquez Córdoba
 */

public class ArrayBi01 {
  public static void main(String[] args) {
    
    int [][] n = new int [3][2]; //Array de 3 filas por 2 columnas

    n[0][0] = 20;
    // n[0][1]= sin valor
    n[1][0] = 67;
    n[1][1] = 33;
    // n [2][0]= sin valor
    n[2][1] = 7;

    System.out.println("Número de filas: " + n.length);
    System.out.println("Número de columnas: " + n[0].length);

    for(int fila = 0; fila < n.length; fila++) {

      System.out.print("Fila: " + fila);

      for(int columna = 0; columna < n[fila].length; columna++) {

        System.out.printf("%10d ", n[fila][columna]);
    
      }
      
      System.out.println();
    }
  }
}
