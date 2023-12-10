import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual.
 * 
 * Ejemplo 1:
      Introduzca un número: 609831
      El número resultado es 160983

  Ejemplo 2:
      Introduzca un número: 78201345
      El número resultado es 57820134

  Ejemplo 3:
      Introduzca un número: 24
      El número resultado es 42

  Ejemplo 4:
      Introduzca un número: 8
      El número resultado es 8

 * @author David Márquez Córdoba
 */

public class T05Ejercicios55 {
  public static void main(String[] args) {
    
    long numIntroducido;
    long numVolteado = 0;
    long ultimoDigito = 0;
    long deUltimoAPrimero = 0;
    int contadorDigitos = 0;

    Scanner teclado = new Scanner(System.in);

    try {
      System.out.print("Introduzca un número: ");
      numIntroducido = teclado.nextLong();
  
      if (numIntroducido >= 0) {
        //En la primera iteración obtendrá el valor del último dígito, lo guardará y reiniciará valores para actualizar el valor del número a voltear.
        //A partir de la 2ª Iteración cogerá los números del penúltimo hasta el primero
        while (numIntroducido>0) {
  
          ultimoDigito = numIntroducido%10;
          numVolteado = numVolteado*10 + ultimoDigito;
          numIntroducido/=10;
          contadorDigitos++;
  
          //Recogemos el valor de la última posición (se recoge en la primera iteración)
          if (contadorDigitos == 1) {
            deUltimoAPrimero = ultimoDigito;
            //Se actualiza a 0 para empezar a recortar números a partir del penúltimo
            numVolteado = 0;
            ultimoDigito = 0;
          }
        }
        
        // Si el número introducido tiene más de un dígito, empezará a intercambiarse las posiciones.
        if (contadorDigitos > 1) {
          //Se repetirá el proceso hasta que el num a voltear se quede sin dígitos
          while (numVolteado>0) {
            ultimoDigito = numVolteado%10;
            numIntroducido = numIntroducido*10 + ultimoDigito;
            numVolteado/=10;
          }
          // Si tiene más de un dígito lanzará el mensaje siguiente:
          System.out.println("El número resultante es: "+ deUltimoAPrimero + numIntroducido);
        } else {
          //Solo si tiene un dígito, mostrará este mensaje, si lo hubiéramos puesto arriba, se imprimiría un 0 de más
          System.out.println("El número resultante es: "+deUltimoAPrimero);
        }
  
        teclado.close();      
      }else {
        System.out.println("No se pueden introducir números negativos");
      }
    } catch (InputMismatchException e) {
      System.out.println("");
      System.out.println("ERROR - Solo pueden introducirse números.");
      System.out.println("Clase de error - "+ e.getClass());
      System.out.println("Mensaje de error - "+e.getMessage());
    } finally {
      System.out.println("");
      System.out.println("Hasta luego");
      System.out.println("");
    }
  } 
}
