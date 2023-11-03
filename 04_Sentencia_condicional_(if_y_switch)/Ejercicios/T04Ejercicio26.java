/*
 * Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio26 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int numEntradas;
    String diaSemana ="";
    boolean bDiaSemanaValido = false;
    char cTarjetaDescuento = ' ';
    boolean bTarjetaDescuentoValida = false;
    int precioBaseTicket = 8;
    int precioBaseMiercoles = 5;

    int precioBaseJuevesPareja = 11;

    System.out.println("");
    System.out.println("Venta de entradas Cine Turin");
    System.out.println("----------------------------");
    System.out.println("Número de entradas: ");
    numEntradas = teclado.nextInt();

    if (numEntradas>0) {
      System.out.println("Día de la semana: ");
      diaSemana = teclado.next();

      bDiaSemanaValido = diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miercoles") || diaSemana.equals("jueves") || diaSemana.equals("viernes") || diaSemana.equals("sabado") || diaSemana.equals("domingo") ;
      
      if (bDiaSemanaValido) {
        System.out.println("¿Tiene tarjeta CineTurin? (s/n): ");
        cTarjetaDescuento = teclado.next().charAt(0);

        bTarjetaDescuentoValida = cTarjetaDescuento == 's' || cTarjetaDescuento == 'n';

        if (bTarjetaDescuentoValida) {


          System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
          
          if (cTarjetaDescuento == 's') {
            switch (diaSemana) {

              case "lunes", "martes", "viernes", "sabado", "domingo":
                double totalDineroNumEntradas = numEntradas * precioBaseTicket;

                System.out.printf("Entradas individuales        %-5d", numEntradas);
                break;

              case "miercoles":

                System.out.printf("Entradas individuales        %-5d", numEntradas);
                break;

              case "jueves":

                System.out.printf("Entradas individuales        %-5d", numEntradas);
                System.out.printf("Precio por entrada de pareja        %-5d", numEntradas);
                break;

            }            
          } else {
            System.out.println("Tarjeta descuento -> NO");
          }
          









        } else {
          System.out.println("Introduce una opción válida");
        }

      } else {
        System.out.println("Introduzca un día válido");
      }
    } else {
      System.out.println("Introduce un número válido");
    }
    
    

  }
}
