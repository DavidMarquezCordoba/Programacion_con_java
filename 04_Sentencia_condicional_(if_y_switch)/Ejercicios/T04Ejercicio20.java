/*
 * Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio20 {
  public static void main(String[] args) {
    
    //Declaración de variables necesarias
    int iNum;                         //Variable que almacerará el número introducido por el usuario
    String sNum;                      //Variable que contendrá el parseo del nº introducido por el usuario

    String sCompara1ParteIzquierda;   //Variable con el 1er dígito de la parte izq
    String sCompara2ParteIzquierda;   //Variable que contiene el 2º dígito de la parte izq

    String sCompara1ParteDerecha;     //Variable que contiene el último dígito
    String sCompara2ParteDerecha;     //Variable que contiene el penúltimo dígito

    boolean comprobacion1;            //Comprueba el primer y el último dígito
    boolean comprobacion2;            //Comprueba el segundo y el penúltimo dígito

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("****************************************************************");
    System.out.println("*                      ¿CAPICÚA O NO?                          *");
    System.out.println("*                      --------------                          *");
    System.out.println("****************************************************************");
    System.out.println("");
    System.out.println("                          PROBEMOS                              ");
    System.out.println("                          --------                              ");
    System.out.println("");
    System.out.print("Introduce un número para averiguar si es capicua: ");
    iNum = teclado.nextInt();

    //Verificamos que el número introducido por pantalla tiene 5 carácteres
    if (iNum <= 99999) {
      sNum = Integer.toString(iNum);

      //Vamos paso a paso según los dígitos totales que el usuario meta por pantalla
      if (iNum >= 0 && iNum <=9) {
        System.out.println("");
        System.out.println("El número es capicua");                             //Un número solo siempre es capicúa
        System.out.println("");
      }

      //Controlamos la casuística de 2 dígitos (el primero y el último deben ser iguales)
      if (iNum >=10 && iNum <=99) {
        sCompara1ParteIzquierda = sNum.substring(0, 1);
        sCompara1ParteDerecha = sNum.substring(1, 2);

        comprobacion1 = sCompara1ParteIzquierda.equals(sCompara1ParteDerecha);  //Comprobamos si son iguales con el método equals

          if (comprobacion1) {
            System.out.println("");
            System.out.println("Es capicuo");
            System.out.println("");
          } else{
            System.out.println("");
            System.out.println("No es capicua");
            System.out.println("");
          }
      }

      //Controlamos la casuística de 3 dígitos (el primero y el último deben ser iguales, ya que el del medio nos da igual)
      if (iNum >=100 && iNum <=999) {
        sCompara1ParteIzquierda = sNum.substring(0, 1);
        sCompara1ParteDerecha = sNum.substring(2, 3);                           //Cambiamos las posiciones del dígito con respecto 2 dígitos.

        comprobacion1 = sCompara1ParteIzquierda.equals(sCompara1ParteDerecha);

          if (comprobacion1) {
            System.out.println("");
            System.out.println("Es capicuo");
            System.out.println("");
          } else{
            System.out.println("");
            System.out.println("No es capicua");
            System.out.println("");
          }
      }

      //Controlamos la casuística de 4 dígitos ( 1º=4º && 2º=3º)
      if (iNum >= 1000 && iNum <= 9999){
        sCompara1ParteIzquierda = sNum.substring(0, 1);
        sCompara2ParteIzquierda = sNum.substring(1, 2);

        sCompara1ParteDerecha = sNum.substring(3, 4);
        sCompara2ParteDerecha = sNum.substring(2, 3);                             //Cambiamos las posiciones del dígito con respecto a 3 dígitos

        comprobacion1 = sCompara1ParteIzquierda.equals(sCompara1ParteDerecha);    //Hacemos dos comprobaciones ahora, en lugar de 1
        comprobacion2 = sCompara2ParteIzquierda.equals(sCompara2ParteDerecha);

        if (comprobacion1) {
          if (comprobacion2) {
            System.out.println("");
            System.out.println("Es capicuo");
            System.out.println("");
          } else{
            System.out.println("");
            System.out.println("No es capicua");
            System.out.println("");
          }
        }
      }

      //Controlamos la casuística de 4 dígitos ( 1º=4º && 2º=3º, la del medio nos da igual)
      if (iNum >= 9999 && iNum <= 99999){
        sCompara1ParteIzquierda = sNum.substring(0, 1);
        sCompara2ParteIzquierda = sNum.substring(1, 2);

        sCompara1ParteDerecha = sNum.substring(4, 5);                             //Cambiamos las posiciones del dígito con respecto a 4 dígitos
        sCompara2ParteDerecha = sNum.substring(3, 4);

        comprobacion1 = sCompara1ParteIzquierda.equals(sCompara1ParteDerecha);
        comprobacion2 = sCompara2ParteIzquierda.equals(sCompara2ParteDerecha);

        if (comprobacion1) {
          if (comprobacion2) {
            System.out.println("");
            System.out.println("Es capicuo");
            System.out.println("");
          } else{
            System.out.println("");
            System.out.println("No es capicua");
            System.out.println("");
          }
        }
      }
      
    } else {
      System.out.println("");
      System.out.println("Introduce un dígito de 5 cifras como máximo");
      System.out.println("");
    }

    teclado.close();
  }
}

// DUDAS: ¿Existe un StringBuilder que facilite la lectura inversa y compare?
//¿por qué los sub string abarcan dos lugares? 0 a 1, ¿No ocupa el puesto 0 el primer número por ejemplo?