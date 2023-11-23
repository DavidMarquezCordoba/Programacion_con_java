/*
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio34 {
  public static void main(String[] args) {
    
    long numIntroducido1=0;
    long numIntroducido2=0;

    long numCreado1 = 0;
    long numCreado2 = 0;

    int ultimoDigito = 0;

    long primerDigito1 = 0;
    long primerDigito2 = 0;

    int controlDigitos1 = 1;
    int controlDigitos2 = 1;
    
    int contador = 0;

    long numerosQueQuedan = 0;

    long digitoAPintar = 0;

    System.out.println("");
    Scanner teclado = new Scanner(System.in);
    
    System.out.printf("Por favor, introduzca un número:");
    numIntroducido1 = teclado.nextLong();
    // long numIntroducidoOriginal1 = numIntroducido1;

    System.out.printf("Introduzca otro número:");
    numIntroducido2 = teclado.nextLong();
    // long numIntroducidoOriginal2 = numIntroducido2;

    //Controlamos el primer número Introducido

    while (numIntroducido1>=10) {
      primerDigito1 = numIntroducido1/10;
      numIntroducido1 = numIntroducido1/10;
      controlDigitos1++;
    }

    for (int i = 0; i < controlDigitos1; i++) {
      while (numIntroducido1>=10) {
        primerDigito1 = numIntroducido1/10;
        numIntroducido1 = numIntroducido1/10;

      }
      
      System.out.printf("%d", primerDigito1);
    }

    //Controlamos el segundo número Introducido

    while (numIntroducido2>=10) {
      primerDigito2 = numIntroducido2/10;
      numIntroducido2 = numIntroducido2/10;
      controlDigitos2++;
    }

    for (int i = 0; i < controlDigitos2; i++) {
      while (numIntroducido2>=10) {
        primerDigito2 = numIntroducido2/10;
        numIntroducido2 = numIntroducido2/10;
      }
      System.out.printf("%d", primerDigito2);
    }
    
    teclado.close();
  }
}

//Copia seguridad

    // while (numIntroducido1>=10) {
    //   primerDigito1 = numIntroducido1/10;
    //   numIntroducido1 = numIntroducido1/10;
    //   controlDigitos++;
    // }

    // for (int i = 0; i < controlDigitos; i++) {
    //   while (numIntroducido1>=10) {
    //     primerDigito1 = numIntroducido1/10;
    //     numIntroducido1 = numIntroducido1/10;
    //   }
    //   System.out.printf("%d", primerDigito1);
    // }