/*
 * Escribe un programa que nos diga el horóscopo a partir del día y el mesNacimiento de
nacimiento.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio10 {
  public static void main(String[] args) {
    
    int diaNacimiento;
    int mesNacimiento;

    boolean mesValido;
    boolean diaValido;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("+-------------------------------------------------+");
    System.out.println("|          HORÓSCOPO - ¿QUÉ SIGNO ERES?           |");
    System.out.println("+-------------------------------------------------+");
    System.out.println("");
    System.out.print("Introduzca el día que naciste (en número): ");
    diaNacimiento = teclado.nextInt();
    System.out.print("Introduzca el mes que naciste (en número): ");
    mesNacimiento = teclado.nextInt();
    System.out.println("");

    teclado.close();

    //Controlamos los días y los meses válidos para filtar de manera más eficiente
    diaValido = (diaNacimiento >= 1 && diaNacimiento<=31);
    mesValido = (mesNacimiento >= 1 && mesNacimiento<= 12);

    if (diaValido && mesValido) {

      //Una vez controlados los meses correctos controlaremos los días concretos para cada mez en concreto
      switch (mesNacimiento) {

        case 1:

          if (diaNacimiento >=20) {
            System.out.println("Eres Acuário");
            System.out.println("");
          } else {
            System.out.println("Eres Capricornio");
            System.out.println("");
          }

          break;

        case 2:
          
          if (diaNacimiento >=19 && diaNacimiento<=28) {
            System.out.println("Eres Piscis");
            System.out.println("");
          } else {
            System.out.println("Eres Acuário");
            System.out.println("");
          }

          break;

        case 3:
          
          if (diaNacimiento >=21) {
            System.out.println("Eres Aries");
            System.out.println("");
          } else {
            System.out.println("Eres Piscis");
            System.out.println("");
          }

          break;

        case 4:

          if (diaNacimiento >=20) {
            System.out.println("Eres Tauro");
            System.out.println("");
          } else {
            System.out.println("Eres Aries");
            System.out.println("");
          }

          break;

        case 5:
          
          if (diaNacimiento >=21) {
            System.out.println("Eres Géminis");
            System.out.println("");
          } else {
            System.out.println("Eres Tauro");
            System.out.println("");
          }

          break;

        case 6:
          
          if (diaNacimiento >=21) {
            System.out.println("Eres Cáncer");
            System.out.println("");
          } else {
            System.out.println("Eres Géminis");
            System.out.println("");
          }
          
          break;

        case 7:
          
          if (diaNacimiento >=23) {
            System.out.println("Eres Leo");
            System.out.println("");
          } else {
            System.out.println("Eres Cáncer");
            System.out.println("");
          }
          
          break;

        case 8:
          
          if (diaNacimiento >=23) {
            System.out.println("Eres Virgo");
            System.out.println("");
          } else {
            System.out.println("Eres Leo");
            System.out.println("");
          }
          
          break;

        case 9:
          
          if (diaNacimiento >=23) {
            System.out.println("Eres Libra");
            System.out.println("");
          } else {
            System.out.println("Eres Virgo");
            System.out.println("");
          }
          
          break;

        case 10:
          
          if (diaNacimiento >=23) {
            System.out.println("Eres Escorpio");
            System.out.println("");
          } else {
            System.out.println("Eres Libra");
            System.out.println("");
          }
          
          break;

        case 11:
          
          if (diaNacimiento >=22) {
            System.out.println("Eres Sagitario");
            System.out.println("");
          } else {
            System.out.println("Eres Escorpio");
            System.out.println("");
          }
          
          break;

        case 12:
          
          if (diaNacimiento >=22) {
            System.out.println("Eres Capricornio");
            System.out.println("");
          } else {
            System.out.println("Eres Sagitario");
            System.out.println("");
          }
          
          break;
      }

    } else {
      System.out.println("No existe esa fecha");
      System.out.println("");
    }

  }
}
