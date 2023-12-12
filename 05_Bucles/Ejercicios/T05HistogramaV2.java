import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) 
 * hasta que se introduzca un número negativo. A continuación se mostrará una tabla donde en la primera columna aparecerán
 * los números introducidos y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.

Introduce un número entre 0 y 9 y pulsa INTRO. Introduce un número negativo para salir:
2
4
8
0
1
-1

  --- --- --- --- --- --- --- --- ---
  | 2 | * | * |   |   |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
  | 4 | * | * | * | * |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
  | 8 | * | * | * | * | * | * | * | * |
  --- --- --- --- --- --- --- --- ---
  | 0 |   |   |   |   |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
  | 1 | * |   |   |   |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
 * 
 * @author David Márquez Córdoba
 */

public class T05HistogramaV2 {
  public static void main(String[] args) {
    
    //Declaración de variables del programa Histograma
    int numIntroducido = 0;
    String asterisco = "*";
    String cadenaNumeros = "";
    String strAux = "";
    int intAux = 0;
    int mayor = 0;
    int numVolteado = 0;
    int primerDigito = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número entre 0 y 9 y pulsa INTRO. Introduce un número negativo para salir:");
    
    //1ª Parte del ejercicio - Formar cadena de números hasta introducir un número negativo que salga del programa
    try {
      do {
        System.out.print("Su número -> ");
        //Metemos el número por teclado
        numIntroducido = teclado.nextInt();

        if (numIntroducido<0) {
          System.out.println("");
          System.out.println("Número negativo....Saliendo....");
        } else if (numIntroducido>=10){
          System.out.println("(número ignorado) Solo números entre 0 y 9.. Repítalo de nuevo");
        } else if (numIntroducido>=0 && numIntroducido<10){
          System.out.println("Muy bien, otro más:");
          // Vamos controlando cada número introducido y asignándole el valor a la variable "mayor" para determinar, cuál es el mayor
          if (numIntroducido>=mayor) {
            mayor = numIntroducido;
          }        
        }
        
        if (numIntroducido>=0 && numIntroducido<10) {
          //Parseamos cada dígito a una cadena de texto
          cadenaNumeros = Integer.toString(numIntroducido);
          
          //Lo vamos acumulando en la cadena vacía en cada iteración para formar el número completo 
          strAux+=cadenaNumeros;        
        }

        //Despreciamos el último dígito para que no lo tenga en cuenta
        if (numIntroducido>=0 && numIntroducido<10) {
          //Convertimos la cadena de números a int para poder operar con ellos
          intAux = Integer.parseInt(strAux);
        }
      } while (numIntroducido>=0);

      //2ª Parte; Voltear el número para que en la 3ª parte pueda ir sacándolo poco a poco

      while (intAux>0) {
        //Vamos dándole la vuelta a los dígitos
        numVolteado = (intAux % 10) + (numVolteado * 10);
        
        //Actualizamos el número introducido
        intAux = intAux/10;
      }

      //3ª Parte, que aparezca el número y los asteriscos correspondientes

      System.out.println("");
      
      while (numVolteado>0) {
        //Vamos convirtiendo el último dígito en el primero
        primerDigito = numVolteado % 10;
        
        //Actualizamos el valor del número volteado quitándole un dígito
        numVolteado /= 10;

        //+------------------------------------------+
        //|             CAPA SUPERIOR                |
        //+------------------------------------------+
        
        //Pintamos la cajita con los números por orden
        System.out.print(" ---  ");

        //Pintamos la capa superior de cada dígito
        for (int i = 0; i < mayor; i++) {
          System.out.print("--- ");
        }

        System.out.println("");

        //+------------------------------------------+
        //|             CAPA INTERMEDIA              |
        //+------------------------------------------+

        System.out.print("| " + primerDigito + " ||");

        for (int j = 0; j < primerDigito; j++) {
          System.out.print(" " + asterisco + " |");
        }

        for (int i = 0; i < mayor-primerDigito; i++) {
          System.out.print("   |");
        }

        System.out.println("");
      }

      //+------------------------------------------+
      //|             CAPA INFERIOR                |
      //+------------------------------------------+

      //Pintamos la cajita con los números por orden
      System.out.print(" ---  ");

      //Pintamos la base de la cajita de cada número
      for (int i = 0; i < mayor; i++) {
        System.out.print("--- ");
      }

      System.out.println("");
      System.out.println("");

      teclado.close();

    } 
    catch (InputMismatchException e) {
      System.out.println("Error: No se pueden introducir letras, solo números");
    } 
  }
}








