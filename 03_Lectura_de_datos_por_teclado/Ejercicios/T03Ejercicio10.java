/*
 * Realiza un conversor de Mb a Kb.
 * 
 * @author David Márquez Córdoba
 */

import java.util.*;

public class T03Ejercicio10 {
  public static void main(String[] args) {
    
    int mb;
    int kb;

    final int VALOR_KB = 1024;
    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("Indique cuantos los MB que quiere convertir: ");
    mb = teclado.nextInt();
    System.out.println("");

    teclado.close();

    //Lógica
    kb = mb * VALOR_KB;

    //Salida por pantalla
    System.out.println(mb+" MB son "+kb+" Kb.");
    System.out.println("");
  }
}
