/*
 * Se pide al usuario un número de
mes y el programa da el nombre del mes que corresponde a ese número
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class SentenciasSwitch {
  public static void main(String[] args) {
    
    int numeroMes;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.print("Introduzca el número del mes para comprobar que mes se trata: ");
    numeroMes = teclado.nextInt();

    teclado.close();

    switch (numeroMes) {
      case 1:
        System.out.printf("El número %d corresponde a enero \n", numeroMes);
        break;

      case 2:
        System.out.printf("El número %d corresponde a febrero \n", numeroMes);
      break;
      
      case 3:
        System.out.printf("El número %d corresponde a marzo \n", numeroMes);
      break;

      case 4:
        System.out.printf("El número %d corresponde a abril \n", numeroMes);
      break;

      case 5:
        System.out.printf("El número %d corresponde a mayo \n", numeroMes);
      break;

      case 6:
        System.out.printf("El número %d corresponde a junio \n", numeroMes);
      break;

      case 7:
        System.out.printf("El número %d corresponde a julio \n", numeroMes);
      break;

      case 8:
        System.out.printf("El número %d corresponde a agosto (Vuelve pronto) \n", numeroMes);
      break;

      case 9:
        System.out.printf("El número %d corresponde a septiembre \n", numeroMes);
      break;

      case 10:
        System.out.printf("El número %d corresponde a octubre \n", numeroMes);
      break;

      case 11:
        System.out.printf("El número %d corresponde a noviembre \n", numeroMes);
      break;

      case 12:
        System.out.printf("El número %d corresponde a diciembre \n", numeroMes);
      break;

      default:
      System.out.println("Mes no reconocido. No inventes.");
        break;

    }
  }
}
