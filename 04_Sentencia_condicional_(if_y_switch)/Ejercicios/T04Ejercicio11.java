/*
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio11 {
  public static void main(String[] args) {
    
    int horaIntroducida;
    int minutosIntroducidos;

    boolean horaValida;
    boolean minutoValido;

    int conversionHorasSegundos;
    int conversionMinutosSegundos;

    int totalHorasMinutosSegundos;

    int totalHorasSegundosRestantes;

    //Declaración de CTE´s
    final int DIA_SEGUNDOS = 86400;
    final int HORAS_SEGUNDOS = 3600;
    final int MINUTOS_SEGUNDOS = 60;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("-----------------------------------------------------------");
    System.out.print("Introduce la hora (0-23): ");
    System.out.println("");
    horaIntroducida = teclado.nextInt();

    horaValida = horaIntroducida >= 0 && horaIntroducida<=23;

    if (horaValida) {

      System.out.print("Introduce los minutos (0-59): ");
      System.out.println("");
      minutosIntroducidos = teclado.nextInt();

      minutoValido = minutosIntroducidos >= 0 && minutosIntroducidos <=59;

      if (minutoValido) {
        
        conversionHorasSegundos = horaIntroducida *HORAS_SEGUNDOS;
        conversionMinutosSegundos = minutosIntroducidos*MINUTOS_SEGUNDOS;

        totalHorasMinutosSegundos = conversionHorasSegundos + conversionMinutosSegundos;

        totalHorasSegundosRestantes = DIA_SEGUNDOS - totalHorasMinutosSegundos;

        System.out.println("");
        System.out.printf("Para que finalice el día quedan exactamente: %d segundos\n", totalHorasSegundosRestantes);
        System.out.println("-----------------------------------------------------------");

      } else {
        System.out.println("Esos minutos no existen. Introduzca un valor entre 0 y 59");
      }
    } else {
      System.out.println("Esa hora no existe. Introduzca un valor entre 0 y 23");
    }

    teclado.close();
  }
}
