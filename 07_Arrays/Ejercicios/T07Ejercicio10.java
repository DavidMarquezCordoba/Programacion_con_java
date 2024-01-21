/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio10 {
  public static void main(String[] args) {

    int [] num = new int [20];

    //Creamos los arrays "contenedores" que irán almacenando los números
    int [] par = new int [20];
    int [] impar = new int [20];

    //Contadores 
    int pares = 0;
    int impares = 0;

    System.out.println("\n20 NÚMERO ALEATORIOS ENTRE 0-100");
    System.out.println("================================\n");

    //Rellenamos
    // 1º Creamos los números y 2º clasificamos
    for (int i = 0; i < num.length; i++) {
      num [i] = (int)(Math.random()*101);

      //Vamos clasificando los números y lo vamos metiendo en un array u otro
      if (num[i]%2 == 0) {
        par[pares++] = num [i];
      } else {
        impar[impares++] = num[i];
      }
    }

    //Mostramos Array original
    System.out.println("Array original:");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i]+" ");
    }

    //Metemos los pares en las primeras posiciones del array original
    System.out.println("\nArray modificado:");
    for (int i = 0; i < pares; i++) {
      System.out.print(par[i]+" ");
    }

    //Metemos los impares en las posiciones siguientes
    for (int i = 0; i < impares; i++) {
      System.out.print(impar[i]+" ");
    }

  }
}
