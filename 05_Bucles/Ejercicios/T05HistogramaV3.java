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

public class T05HistogramaV3 {
  public static void main(String[] args) {
    
    char caracter=' ';
    int numIntroducido = 0;
    String sNumIntroducido = "";
    String aux = "";
    int esElMayor = 0;
    int valorChar = 0;

    Scanner teclado = new Scanner(System.in);

    //Controlamos el error con un try catch en el caso que no se introduzca un número
    try {
      System.out.print("Introduzca un caracter: ");
      caracter = teclado.next().charAt(0);
  
      System.out.println("Introduce un número entre 0 y 9 y pulsa INTRO. Introduce un número negativo para salir: ");
  
      do {
        numIntroducido = teclado.nextInt();
    
        //Mensajes personalizados dependiendo de la casuística

        //Si es negativo, mostrará un mensaje antes de cerrar la entrada de números por teclado
        if (numIntroducido<0) {

          System.out.println("");
          System.out.println("Número negativo....Saliendo....");
          System.out.println("");

        //Si se introduce un número de dos dígitos, se ignorará y mostrará un mensaje personalizado
        } else if (numIntroducido>=10){

          System.out.println("(número ignorado) Solo números entre 0 y 9.. Repítalo de nuevo:");

          //En caso de que los valores introducidos sean los correctos (entre 0 y 9) continuaremos
        } else if (numIntroducido>=0 && numIntroducido<10) {

          System.out.println("Muy bien, otro más:");

          //Vamos calculando cuál es el número más alto de los que se introducen
          if (numIntroducido >= esElMayor) {
            esElMayor = numIntroducido;
          }

          //Convertimos a String y almacenaremos, (Guardo en String para que se muestren los 0 al principio y al final)
          aux = Integer.toString(numIntroducido);
          sNumIntroducido+=aux;          
        }
  
      } while (numIntroducido>=0);
  
      //Empezamos a pintar, repitiendo el proceso tantas veces como dígitos hayamos introducido (los dígitos se controlan mediante lenght ya que es un string)
  
      for (int i = 0; i < sNumIntroducido.length(); i++) {
  
        //Obtenemos el valor del caracter en la posición "i" es decir, 
        //hacemos un parseo de char a int, para saber cuántas veces imprimirá el caracter elegido
        valorChar = Character.getNumericValue(sNumIntroducido.charAt(i));

        //+------------------------------------------+
        //|             CAPA SUPERIOR                |
        //+------------------------------------------+

        //Pintamos capa superior, que será el número mayor introducido +1 del nº del dígito
        for (int j = 0; j < esElMayor+1; j++) {
          System.out.print(" ---");
        }
        //Siguiente línea
        System.out.println("");
  
        //+------------------------------------------+
        //|             CAPA INTERMEDIA              |
        //+------------------------------------------+

        //Pintamos cada número introducido
        System.out.print("| "+sNumIntroducido.charAt(i)+" |");
      
        //Pintamos tantas veces el caracter, como número le hayamos indicado
        for (int j2 = 0; j2 < valorChar; j2++) {
          System.out.print(" "+caracter+" |");
        }
  
        //Completa el recuadro con los espacios y las barras que faltan hasta completar el número máx introducido
        for (int j2 = 0; j2 < esElMayor-valorChar; j2++) {
          System.out.print("   |");
        }
  
        System.out.println("");
      }
  
      //+------------------------------------------+
      //|             CAPA INFERIOR                |
      //+------------------------------------------+

      //Pintamos la base del recuadro, que será el número mayor introducido +1 del nº del dígito
      for (int i = 0; i < esElMayor+1; i++) {
        System.out.print(" ---");
      }
  
      teclado.close();

    } catch (InputMismatchException e) {
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
