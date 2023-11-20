/**
 * Explica tu código aquí
 * 
 * @author David Márquez Córdoba
 */
import java.util.*;

public class T04Ejercicio22v2 {
  public static void main(String[] args) {
    

    String decision;
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

    final int MINUTOS_FIN_DE_SEMANA = (60 * 24 * 2) + ((24-15)*60);

    Scanner teclado = new Scanner(System.in);

    System.out.println("+---------------------------------------------------------+");
    System.out.println("+      ¿CUÁNTO FALTA HASTA EL SIGUIENTE FINDE?            +");
    System.out.println("+---------------------------------------------------------+");
    System.out.println("");
    System.out.println("             Lo estás deseando, y lo sabes                 ");
    System.out.println("");
    System.out.println("¿Qué día es hoy? ");
    System.out.println("1. Viernes");
    System.out.println("2. Sábado");
    System.out.println("3. Domingo");
    System.out.print("Elija una opción: ");
    decision = teclado.nextLine();

    switch (decision) {
      case "viernes":
        
        break;

      case "sabado":
        
        break;

      case "domingo":
        
        break;
    
      default:
        break;
    }



    teclado.close();    
  }
}
