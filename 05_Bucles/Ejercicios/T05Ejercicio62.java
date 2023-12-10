import java.util.Scanner;

/**
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio62 {
  public static void main(String[] args) {
    
    long numIntroducido = 0;
    int ultimoDigito = 0;
    int contadorBuenaSuerte = 0;
    int contadorMalaSuerte = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    numIntroducido = teclado.nextLong();
    long copiaNumIntroducido = numIntroducido;

    while (numIntroducido>0) {
      
      ultimoDigito = (int) numIntroducido % 10;

      if ((ultimoDigito == 3)||(ultimoDigito == 7)||(ultimoDigito == 8)||(ultimoDigito == 9)) {
        contadorBuenaSuerte++;
      } else {
        contadorMalaSuerte++;
      }

      numIntroducido/=10;
    }

    if (contadorBuenaSuerte>contadorMalaSuerte) {
      System.out.println("El " + copiaNumIntroducido + " es un número afortunado");
    } else if (contadorMalaSuerte>=contadorBuenaSuerte) {
      System.out.println("El " + copiaNumIntroducido + " NO es un número afortunado");
    }


    teclado.close();
  }
}
