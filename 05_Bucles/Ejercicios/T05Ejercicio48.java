import java.util.Scanner;

/**
 * 
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos.
Ejemplo 1:

Introduzca un número entero: 67706

Dígitos que aparecen en el número: 0 6 7

Dígitos que no aparecen: 1 2 3 4 5 8 9

 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio48 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long numIntroducido = 0;
    long numVolteado = 0;
    long ultimoDigito = 0;

    boolean num0 = false;
    boolean num1 = false;
    boolean num2 = false;
    boolean num3 = false;
    boolean num4 = false;
    boolean num5 = false;
    boolean num6 = false;
    boolean num7 = false;
    boolean num8 = false;
    boolean num9 = false;

    System.out.print("Introduzca un número entero:  ");
    numIntroducido = teclado.nextLong();

    do {
      numVolteado = (numIntroducido%10) + (numVolteado*10);
      numIntroducido/=10;
    } while (numIntroducido>0);
    
    do {
      // Vamos sacando el último dígito
      ultimoDigito = numVolteado % 10;
      // Vamos actualizando el valor del número introducido, quitándole un dígito en cada iteración
      numVolteado/=10;


      if (ultimoDigito == 0){
        num0 = true;
      } 
      if (ultimoDigito == 1){
        num1 = true;
      }
      if (ultimoDigito == 2){
        num2 = true;
      } 
      if (ultimoDigito == 3){
        num3 = true;
      } 
      if (ultimoDigito == 4){
        num4 = true;
      }
      if (ultimoDigito == 5){
        num5 = true;
      } 
      if (ultimoDigito == 6){
        num6 = true;
      }
      if (ultimoDigito == 7){
        num7 = true;
      }
      if (ultimoDigito == 8){
        num8 = true;
      } 
      if (ultimoDigito == 9){
        num9 = true;
      } 

    } while (numVolteado>0);

    System.out.println("");
    System.out.print("Dígitos que aparecen en el número: ");

    if (num0) {
      System.out.print("0 ");
    } 
    if (num1) {
      System.out.print("1 ");
    }
    
    if (num2) {
      System.out.print("2 ");      
    }
    
    if (num3) {
      System.out.print("3 ");
    }
    
    if (num4) {
      System.out.print("4 ");
    }
    
    if (num5) {
      System.out.print("5 ");
    }
    
    if (num6) {
      System.out.print("6 ");
    }
    
    if (num7) {
      System.out.print("7 ");
    }
    
    if (num8) {
      System.out.print("8 ");
    }
    
    if (num9) {
      System.out.print("9 ");
    }

    System.out.println("");
    System.out.print("Dígitos que no aparecen: ");

    if (!num0) {
      System.out.print("0 ");
    } 
    if (!num1) {
      System.out.print("1 ");
    }
    
    if (!num2) {
      System.out.print("2 ");      
    }
    
    if (!num3) {
      System.out.print("3 ");
    }
    
    if (!num4) {
      System.out.print("4 ");
    }
    
    if (!num5) {
      System.out.print("5 ");
    }
    
    if (!num6) {
      System.out.print("6 ");
    }
    
    if (!num7) {
      System.out.print("7 ");
    }
    
    if (!num8) {
      System.out.print("8 ");
    }
    
    if (!num9) {
      System.out.print("9 ");
    }

    teclado.close();
  }
}
