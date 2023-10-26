/*
 * Escribe un programa que pinte por pantalla una pirámide rellena a base de
asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
Ejemplo:
        *
       ***
      *****
     *******
    *********
 * 
 * @author David Márquez Córdoba
 */

public class T01Ejercicio6 {
  public static void main(String[] args) {
    System.out.printf("%8s\n", "*");
    System.out.printf("%9s\n", "***");
    System.out.printf("%10s\n", "*****");
    System.out.printf("%11s\n", "*******");
    System.out.printf("%12s\n", "*********");
  }
}
