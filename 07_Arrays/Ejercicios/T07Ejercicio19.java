/**
 * Explica tu código aquí
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio19 {
  public static void main(String[] args) {
    int [] num = new int [12];

    //Rellenamos el array
    for (int i = 0; i < num.length; i++) {
      num [i] = (int)(Math.random()*201);
    }

    System.out.println("Array original");
    System.out.print("Índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%5d", i);
    }

    System.out.print("\nValor  ");

    for (int i = 0; i < num.length; i++) {
      System.out.printf("%5d", num[i]);
    }

    System.out.println("");
    System.out.print("Introduzca el número que quiere insertar:");
    int numIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca la posición donde quiere insertar (0 - 11)");
    int posicion = Integer.parseInt(System.console().readLine());

    //Desplazar los valores e insertar el número
    for (int i = num.length - 1; i > posicion ; i--) {
      num [i] = num [i - 1];
    }
  }
}
