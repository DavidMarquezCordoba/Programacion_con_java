/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 *
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio21 {
  public static void main(String[] args) {

    double numeroIntroducido;

    double auxiliar = 0;

    double primerNumero = 0;
    double segundoNumero = 0;
    double esMayor = 0;

    int acumuladorNumeros = 0;
    int acumuladorImpares = 0;

    double mediaNumNegativo = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("*--------------------------*");
    System.out.println("|  Juguemos a los números  |");
    System.out.println("*--------------------------*");
    System.out.println("");
    System.out.println("Introduce números enteros positivos, el programa parará cuando introduzcas un número negativo");
    System.out.println("Calcularemos: ");
    System.out.println("1. Cuántos números se han introducido en total");
    System.out.println("2. Media de los impares");
    System.out.println("3. Mayor de los pares");
    System.out.println("");

    do {
      System.out.printf("Introduce un número: ");
      numeroIntroducido = teclado.nextDouble();

      if (numeroIntroducido>0) {

        //Acumulamos números introducidos mayores de 0
        acumuladorNumeros++;

        //Discernimos números impares de los pares
        if (!(numeroIntroducido%2==0)) {
          acumuladorImpares++;                            //Acumulamos los números impares
          auxiliar += numeroIntroducido;                  //Lo metemos en una var aux para ir sumando los números impares
          mediaNumNegativo = auxiliar/acumuladorImpares;  //Hacemos la media de números impares
        }

        //Averiguamos el mayor de los pares
        if ((numeroIntroducido%2==0)&&(acumuladorNumeros>=2)) {
          
          primerNumero = numeroIntroducido;           //Asignamos el valor del núm introducido para empezar la comparativa

              //Aquí empezamos a comparar números para determinar cuál es mayor
          if (primerNumero>= segundoNumero) {         //Entre el primero y el segundo

            esMayor = primerNumero;                   //Si el primero es mayor, asignaremos la variable al n1
            segundoNumero = esMayor;                  //Actualizamos segundo número y tomará el valor del número mayor, 
                                                      //para que en la próxima vuelta pueda compararse el nuevo num 
                                                      //y el ganador previo

            //Lo mismo que el caso anterior, pero en el caso que el n2 sea mayor ( válido a partir de numIntroducido >=3)
          } else if (segundoNumero > primerNumero){
            esMayor = segundoNumero;
            segundoNumero = esMayor;
          }
        }
      }

    } while (numeroIntroducido>=0);

    System.out.println("Resultado");
    System.out.println("---------");
    System.out.println("");
    System.out.printf("Se han introducido %d números \n", acumuladorNumeros);
    System.out.printf("La media de los números impares es %.2f \n", mediaNumNegativo);
    System.out.printf("El mayor de los números posivos ha sido el %.2f\n", esMayor);

    teclado.close();
  }
}
