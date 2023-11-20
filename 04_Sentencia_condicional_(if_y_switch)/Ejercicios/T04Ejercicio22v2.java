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


//    HECHO

// public class T04Ejercicio22bis {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     final int MINUTOS_TOTALES_SEMANA_LABORAL = (4 * 24 * 60) + (15 * 60);   //Calculando minutos desde lunes 00 hasta Viernes 15:00
//     final int MINUTOS_TOTALES_FIN_DE_SEMANA = (2 * 24 * 60) + ((24-15)*60);
//     int diasTranscurridos = 0;

//     System.out.println("¿Qué día es hoy?: ");
//     String diaFinDeSemana = sc.nextLine();


//     System.out.println("Por favor, introduce una hora: ");
//     int hora = sc.nextInt();
//     System.out.println("Introduce los minutos: ");
//     int minutos = sc.nextInt();

//     switch (diaFinDeSemana) {
//       case "viernes":
//         diasTranscurridos = 0;
//         break;

//       case "sabado":
//         diasTranscurridos = 1;
//         break;

//       case "domingo":
//         diasTranscurridos = 2;
//         break;
    
//       default:
//       System.out.println("No es un día válido.");
//         break;
//     }
//     int minutosTranscurridos = ((((diasTranscurridos * 24 * 60) + (hora * 60) + minutos) - 900) + MINUTOS_TOTALES_SEMANA_LABORAL);
//     System.out.println(minutosTranscurridos);

//   }
  
// }