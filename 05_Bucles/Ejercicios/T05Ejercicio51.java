import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.
 * 
 * Ejemplo 1:
      Introduzca un número entero (mayor que cero): 51803458
      Después de haber sido comido por el gusano numérico se queda en 51345

  Ejemplo 2:
        Introduzca un número entero (mayor que cero): 29614
        El gusano numérico no se ha comido ningún dígito.

 * @author David Márquez Córdoba
 */

public class T05Ejercicio51 {
  public static void main(String[] args) {
    
    long numIntroducido;
    long numVolteado = 0;
    int ultimoDigito;
    String numRecortado = "";
    String sDigito = "";
    boolean haComido = false;

    Scanner teclado = new Scanner(System.in);

    try {
      System.out.print("Introduzca un número entero (mayor que cero): ");
      numIntroducido = teclado.nextLong();
      System.out.println("");
  
      if (numIntroducido>0) {
        //Volteamos el número para ir comparando dígito a dígito
        while (numIntroducido>0) {
    
          // Hacemos un casteo a entero para que último dígito sea un INT, ya que más adelante, toString, solo admite "int"
          ultimoDigito = (int) (numIntroducido%10);
          // Vamos volteando en cada iteración
          numVolteado = numVolteado*10 + ultimoDigito;
          //Actualizamos valor
          numIntroducido/=10;
        }
    
        numIntroducido = 0;
    
        //Vamos dándole la vuelta al dígito introducido, ya que en pantalla se mostrará por orden
        while (numVolteado>0) {
          
          ultimoDigito = (int) (numVolteado%10);
    
          numIntroducido = numIntroducido*10 + ultimoDigito;
    
          numVolteado/=10;
    
          // Analizamos si tiene un 0 o un 8, en caso que lo contenga, no se pintará o guardará dicho dígito
          if ((ultimoDigito !=0) && (ultimoDigito !=8)) {
            // Con toString, parseamos de int a string y vamos acumulando el valor en numRecortado, que será el número que se mostrará al final
            sDigito = Integer.toString(ultimoDigito);
            //Vamos acumulando dígito a dígito
            numRecortado+=sDigito;
            
            haComido = true;
          }
        }
    
        //Dependiendo de si ha comido o no, mostrará un mensaje u otro.
        if (haComido) {
          System.out.print("Después de haber sido comido por el gusano numérico se queda en "+ numRecortado);
        } else {
          System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }
    
        System.out.println("");        
      } else {
        System.out.println("Solo números mayores que cero (0)");
      }

      teclado.close();
      
    } catch (InputMismatchException e) {
      System.out.println("");
      System.out.println("ERROR - Solo pueden introducirse números.");
      System.out.println("Clase de error - "+ e.getClass());
      System.out.println("Mensaje de error - "+e.getMessage());
    } finally {
      System.out.println("");
      System.out.println("Vuelva a intentarlo más tarde");
      System.out.println("");
    }
  }
}
