/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
 * 
 * @author David Márquez Córdoba
 */
public class T07Ejercicio01_Bi {
  public static void main(String[] args) {
    
    int [][] num = new int [3][6];

    num [0][0] = 0;
    num [0][1] = 30;
    num [0][2] = 2;
    // num[0][3] = ;
    // num[0][4] = ;
    num [0][5] = 5;

    num [1][0] = 75;
    // num [1][1] = 30;
    // num [1][2] = 2;
    // num [0][3] = ;
    num [1][4] = 0;
    // num [1][5] = 5;

    // num [2][0] = 0;
    // num [2][1] = 30;
    num [2][2] = -2;
    num [2][3] = 9;
    // num [0][4] = ;
    num [2][5] = 11;

    System.out.printf("Array num");
    
    for (int i = 0; i < num[0].length; i++) {
      System.out.printf("%10s %d", "Columna", i);
    }

    System.out.println("");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("Fila %d", i);
      for (int j = 0; j < num[0].length; j++) {
        System.out.printf("%12d", num[i][j]);
      }
      System.out.println("");
    }
  }
}
