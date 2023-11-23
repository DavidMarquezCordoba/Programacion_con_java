/*
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio32 {
  public static void main(String[] args) {
    int amarillo; //variable para ver que ejercicio está incompleto 
    long numeroIntroducido = 0;
    int sumaNumerosPares = 0;
    long ultimoDigito =0;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    numeroIntroducido = teclado.nextLong();

    while (numeroIntroducido>=10) {

      ultimoDigito = numeroIntroducido % 10;        // "Recorto" el numero para saber cuál es su último dígito y lo meto en su variable.
      numeroIntroducido = numeroIntroducido / 10;   // Actualizo el valor del número introducido para seguir recortando.
      
      while (ultimoDigito%2==0) {
        System.out.printf(" %d ", ultimoDigito);
        sumaNumerosPares+=ultimoDigito;
        ultimoDigito++; //Para que salga del bucle
      }
      
      ultimoDigito--; //Restamos el dígito para que saliera del bucle
    }
    System.out.println("");
    System.out.println("La suma de todos los números pares es: "+ sumaNumerosPares);
    teclado.close();
  }
}

//Incompleto, falta ordenarlo


