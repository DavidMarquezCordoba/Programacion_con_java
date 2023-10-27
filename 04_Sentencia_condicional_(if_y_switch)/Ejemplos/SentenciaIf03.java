/*
 * El usuario introduce una nota; si esta nota es mayor o igual a 5 se
le mostrará un mensaje diciendo que ha aprobado y en caso de que no se cumpla la
condición se mostrará un mensaje diciendo que está suspenso.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class SentenciaIf03 {
  public static void main(String[] args) {

    int nota;

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("");
    System.out.print("Introduce una nota: ");
    nota = teclado.nextInt();
    teclado.close();

    if (nota >= 0 && nota <=10) {
      if (nota >= 5) {
        System.out.println("Estás aprobado!!");
      } else {
        System.out.println("Estás suspenso :-(");
      }
    } else {
      System.out.println("Nota no válida");
    }
  }
}
