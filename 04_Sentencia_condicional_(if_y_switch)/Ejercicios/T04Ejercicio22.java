/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio22 {
  public static void main(String[] args) {
    
    int decision;
    int hora;
    int minutos;

    int minutosDeHorasTrabajados;
    // int minutosQuedanDelDiaActual;
    // int minutosQuedanDeSemana;
    int total;

    final int VALOR_HORA_EN_MINUTOS = 60;
    final int VALOR_DIA_EN_MINUTOS = 1440;
    //Considero semana hasta el viernes a las 15:00 es decir; 7200 minutos (4 días completos [1440*4]) + 900 minutos (desde las 00 del viernes hasta las 15 como fecha tope [60*15])
    final int MINUTOS_EN_SEMANA = 6660;

    Scanner teclado = new Scanner(System.in);

    System.out.println("+---------------------------------------------------------+");
    System.out.println("+             ¿CUÁNTO FALTA PARA EL FINDE?                +");
    System.out.println("+---------------------------------------------------------+");
    System.out.println("");
    System.out.println("             Lo estás deseando, y lo sabes                 ");
    System.out.println("");
    System.out.println("¿Qué día es hoy? ");
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miércoles");
    System.out.println("4. Jueves");
    System.out.println("5. Viernes");
    System.out.print("Elija una opción: ");
    decision = teclado.nextInt();
    System.out.println("");

    if (decision >= 1 && decision <=5) {

      System.out.println("");
      System.out.print("Intruzca una hora: ");
      hora = teclado.nextInt();
      System.out.println("");

      if (hora >= 0 && hora < 24) {
        
        System.out.println("");
        System.out.print("Introduzca los minutos: ");
        minutos = teclado.nextInt();
        System.out.println("");

        if (minutos >= 0 && minutos < 60) {

          minutosDeHorasTrabajados = hora * VALOR_HORA_EN_MINUTOS;

          switch (decision) {

            case 1:
              total = (MINUTOS_EN_SEMANA - (minutosDeHorasTrabajados + minutos));
              
              System.out.println("Para el día, hora y minuto seleccionado quedan: " + total + " minutos para que finalice la semana laboral");
              break;
          
            case 2:
              total = (MINUTOS_EN_SEMANA - ((VALOR_DIA_EN_MINUTOS * 1)) - (minutosDeHorasTrabajados + minutos));
              System.out.println("Para el día, hora y minuto seleccionado quedan: " + total + " minutos para que finalice la semana laboral");          
              break;

            case 3:
              total = (MINUTOS_EN_SEMANA - ((VALOR_DIA_EN_MINUTOS * 2)) - (minutosDeHorasTrabajados + minutos));
              System.out.println("Para el día, hora y minuto seleccionado quedan: " + total + " minutos para que finalice la semana laboral");           
              break;

            case 4:
              total = (MINUTOS_EN_SEMANA - ((VALOR_DIA_EN_MINUTOS * 3)) - (minutosDeHorasTrabajados + minutos));
              System.out.println("Para el día, hora y minuto seleccionado quedan: " + total + " minutos para que finalice la semana laboral");         
              break;

            case 5:
              total = (MINUTOS_EN_SEMANA - ((VALOR_DIA_EN_MINUTOS * 4)) - (minutosDeHorasTrabajados + minutos));
              System.out.println("Para el día, hora y minuto seleccionado quedan: " + total + " minutos para que finalice la semana laboral");
              break;
          }
        } else {
          System.out.println("Error. Minutos no válidos");
        }
      } else {
        System.out.println("Error. Hora no válida, inténtelo de nuevo más tarde");
      }


      
    } else {
      System.out.println("Opción no permitida");
    }

    teclado.close();
  }
  
}
