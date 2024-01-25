// import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
 * 
 * @author David Márquez Córdoba
 */
public class T07Ejercicio04_Bi {
  public static void main(String[] args) throws InterruptedException {

    try {
      System.out.println("+-------------------------------------------------------------------+");
  
      int [][] tabla = new int [4][5];
  
      int sumaFila;
      int sumaColumnas;
      int sumaTotal = 0;
  
      //Ampliacion
      int fila2Parte;
      int columna2Parte;
      //Lo usaremos para los índices del bucle for
      int fila;
      int columna;
  
      // System.out.println("Número de filas");
      Scanner teclado = new Scanner(System.in);
  
      //Rellenar el Array
      for (fila = 0; fila < tabla.length; fila++) {
        for (columna = 0; columna < tabla[fila].length; columna++) {
          tabla[fila][columna] = (int)(Math.random()*900 + 100);
        }
      }
  
      //Mostrar el array bidi + sumatoria de cada fila
      for (fila = 0; fila < tabla.length; fila++) {
        sumaFila= 0;
        for (columna = 0; columna < tabla[fila].length; columna++) {
          System.out.printf("|%8d   ", tabla[fila][columna]);
          sumaFila+=tabla[fila][columna];
          // Thread.sleep(200);
        }
        System.out.print("|");
        // Thread.sleep(1000);
        System.out.print("  "+sumaFila);
        System.out.println(" |");
      }
  
      //Le damos la vuelta para hacer la sumatoria de columnas
      System.out.println("+-------------------------------------------------------------------+");
  
      for (int j = 0; j < tabla[0].length; j++) {
        sumaColumnas = 0;
        for (int i = 0; i < tabla.length; i++) {
          sumaColumnas+=tabla[i][j];
        }
        sumaTotal+=sumaColumnas;
        // Thread.sleep(1000);
        System.out.printf("|%8d   ", sumaColumnas);
      }
      // Thread.sleep(1500);
      System.out.printf("| %d |\n", sumaTotal);
      System.out.println("+-------------------------------------------------------------------+");
  
      System.out.println("\n-----------------");
      System.out.println("¿Qé más operaciones quieres realizar? (pulse 1 o 2)");
      System.out.println("1. Hacer la media");
      System.out.println("2. Restar");
      System.out.print("Indique su opción: ");
      int opcionMediaMultiplicar = Integer.parseInt(System.console().readLine());
  
      int opcionFilaColumna;
      int contadorFilas = 0;
      int contadorColumnas = 0;
      // double media = 0;
      int resta = 0;
  
      switch (opcionMediaMultiplicar) {
        case 1:
          System.out.println("\n¿A qué prefiere hacer la media?");
          System.out.println("1. Fila");
          System.out.println("2. Columna");
          System.out.print("Indique su opción: ");
          opcionFilaColumna = Integer.parseInt(System.console().readLine());
  
          switch (opcionFilaColumna) {
  
            case 1:
              System.out.print("\n¿Qué fila desea para hacer la media? (0-3):");
              fila2Parte = Integer.parseInt(System.console().readLine());
  
              int sumaFilaSeleccionada = 0;
  
              // Quiere decir que va a recorrer todas las columnas (j)
              for (int j = 0; j < tabla[0].length; j++) {
                //Y que va a guardar de TODAS las columnas, SOLO los valores de la fila que hayamos dicho
                sumaFilaSeleccionada += tabla[fila2Parte][j];
                contadorColumnas++;
              }
              // System.out.println("La sumatoria de la fila "+ fila2Parte+ " es: "+ sumaFilaSeleccionada);
              System.out.println("La media de la fila "+ fila2Parte+ " es: "+ (sumaFilaSeleccionada/contadorColumnas));
  
              break;
  
            case 2:
              System.out.print("\n¿Qué columna desea para hacer la media?(0-4):");
              columna2Parte = Integer.parseInt(System.console().readLine());
  
              int sumaColumnaSeleccionada = 0;
  
              //Quiere decir que va a recorrer todas las filas
              for (int i = 0; i < tabla.length; i++) {
                //Y que solo va a almacenar el valor de la columna que se pida de todas las filas
                sumaColumnaSeleccionada += tabla[i][columna2Parte];
                contadorFilas++;
              }
              System.out.println("La media de la columna "+ columna2Parte+ " es: "+ (sumaColumnaSeleccionada/contadorFilas));
              // System.out.println("La sumatoria de la fila "+ columna2Parte+ " es: "+ sumaColumnaSeleccionada);
              break;   
              
              
            default:
            System.out.println("\nOpción no válida");
              break;
          }
          break;
  
  
        case 2:
          System.out.println("\n¿A qué prefiere hacer la resta?");
          System.out.println("1. Fila");
          System.out.println("2. Columna");
          System.out.print("Indique su opción: ");
          opcionFilaColumna = Integer.parseInt(System.console().readLine());
  
          switch (opcionFilaColumna) {
  
            case 1:
              System.out.print("\n¿Qué fila desea para hacer la resta? (0-3):");
              fila2Parte = Integer.parseInt(System.console().readLine());
  
              for (int j = 0; j < tabla[0].length; j++) {
                resta -= tabla[fila2Parte][j];
              }
  
              System.out.println("El resultado de restar los números de la Fila "+fila2Parte+ " es: "+resta);
              break;
  
            case 2:
              System.out.print("\n¿Qué columna desea para hacer la resta?(0-9):");
              columna2Parte = Integer.parseInt(System.console().readLine());
  
              for (int i = 0; i < tabla.length; i++) {
                resta -= tabla[i][columna2Parte];
              }
  
              System.out.println("El resultado de restar los números de la columna "+columna2Parte+ " es: "+resta);
              break;   
              
              
            default:
            System.out.println("\nOpción no válida");
              break;
          }
          break; 
          
          
        default:
          System.out.println("\nOpción no permitida");
          break;
      }
      
  
      teclado.close();
    } catch (NumberFormatException e) {
        System.out.println("");
        System.out.println("ERROR - Solo pueden introducirse números.");
        System.out.println("Clase de error - "+ e.getClass());
        System.out.println("Mensaje de error - "+e.getMessage());
    } finally {
        System.out.println("");
        System.out.println("\nHasta luego");
        System.out.println("");
    }
  }
}
