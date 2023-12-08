import java.util.Scanner;

/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio49 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int numIntroducido;
    int suma = 0;
    int contador = 0;
    int max = 0;
    int menor = 0;
    double media = 0;
    int aux;
    boolean esPrimo;

    System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");

    do {
      numIntroducido = teclado.nextInt();

      if ((numIntroducido % numIntroducido==0)&&(numIntroducido%1==0)) {
        
        //Averiguamos el mayor
        if (numIntroducido > max) {
          max = numIntroducido;
        }

        //Averiguamos el menor
        if (numIntroducido < max) {
          menor = numIntroducido;
        }

        //Averiguamos la media
        if (numIntroducido>0) {
          contador++;
          suma+=suma;
        }


        
        esPrimo = true;
      } else {
        esPrimo = false;
      }

    } while (!esPrimo);


    teclado.close();
  }
}
