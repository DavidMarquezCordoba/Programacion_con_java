/**
 * Ejemplos de uso de un Array - 01
 * 
 * @author David Márquez Córdoba
 */

public class Array01 {
  public static void main(String[] args) {
    
                // FORMA DE CREAR 1 //
    //Creamos un array de números enteros
    int [] n;
    //Reservamos espacio para 4 enteros
    n = new int [4];

    //Asignamos valores a cada posición del array
    n [0] = 26;
    n [1] = -30;
    n [2] = 0;
    n [3] = 100;

    System.out.print("El valor de los arrays es el siguiente: ");
    System.out.print(n[0]+ ", " + n[1] + ", " + n[2] + ", " + n[3]);
    System.out.println("");
    int suma = n[0] + n[3];
    System.out.printf("El resultado de sumar la primera posición del array con el último es: %d", suma);
  }
}
