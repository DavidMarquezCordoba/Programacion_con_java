import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y
 * el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca un número entero positivo: 406783
 * Introduzca la posición donde quiere insertar: 3
 * Introduzca el dígito que quiere insertar: 5
 * El número resultante es 4056783.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio44 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    long numIntroducido;
    long copiaNumIntroducido;
    long numeroVolteado = 0;
    long ultimoDigito;
    int digitoAIntroducir;
    int posicionDigito;
    int contador = 0;

    try {
      System.out.print("Por favor, introduzca un número entero positivo: ");
      numIntroducido = teclado.nextLong();
      copiaNumIntroducido = numIntroducido;
  
      System.out.print("Introduzca la posición donde quiere insertar: ");
      posicionDigito = teclado.nextInt();
  
      System.out.print("Introduzca el dígito que quiere insertar: ");
      digitoAIntroducir = teclado.nextInt();
  
      System.out.print("El número resultante es: ");
      
      while (copiaNumIntroducido > 0) {
  
        ultimoDigito = copiaNumIntroducido % 10;
        numeroVolteado = numeroVolteado * 10 + ultimoDigito;
        contador++;
  
        copiaNumIntroducido /= 10;
      }
  
      for (int i = 0; i < posicionDigito - 1; i++) {
        ultimoDigito = numeroVolteado % 10;
        numeroVolteado /= 10;
  
        System.out.print(ultimoDigito);
      }
  
      System.out.print(digitoAIntroducir);
  
      for (int i = 0; i < (contador - posicionDigito) + 1; i++) {
        ultimoDigito = numeroVolteado % 10;
        numeroVolteado /= 10;
        System.out.print(ultimoDigito);
      }
    } catch (InputMismatchException e) {
      System.out.println("");
      System.out.println("---------------------------------------------------");
      System.out.println("| Error | No se pueden introducir letras/carácteres");
      System.out.println("---------------------------------------------------");
      System.out.println("Eror de mensaje." + e.getMessage());
      System.out.println("Clase de excepción." + e.getClass());
      System.out.println("");
    } finally{
      System.out.println("*************GRACIAS******************");
    }

    teclado.close();
  }
}

// LUIS
// public class S05Ejercicio44 {
//   public static void main(String[] args) {

//     System.out.print("Por favor, introduzca un número entero positivo: ");
//     long numeroIntroducido = Long.parseLong(System.console().readLine());
//     System.out.print("Introduzca la posición donde quiere insertar: ");
//     long posicion = Long.parseLong(System.console().readLine());
//     System.out.print("Introduzca el dígito que quiere insertar: ");
//     long digito = Long.parseLong(System.console().readLine());
//     long numero = numeroIntroducido;

//     // calcula la longitud del número
//     int longitud = 0;

//     do {
//       numero /= 10;
//       longitud++;
//     } while (numero > 0);

//     // parte izquierda con el dígito pegado
//     long parteIzquierda = numeroIntroducido / (long) (Math.pow(10, longitud - posicion + 1));
//     parteIzquierda = parteIzquierda * 10 + digito;

//     // parte derecha
//     long parteDerecha = numeroIntroducido % (long) (Math.pow(10, longitud - posicion + 1));

//     // resultado
//     numero = parteIzquierda * (long) (Math.pow(10, longitud - posicion + 1)) + parteDerecha;
//     System.out.print("El número resultante es " + numero);
//   }
// }