import java.util.Scanner;

/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio14 {
  public static void main(String[] args) {
    
    //Array principal de palabras
    String [] arrayPalabras = new String[8];
    //Array donde guardaremos los colores
    String [] arrayGuardaColores = new String[8];
    //Array donde guardaremos las demás palabras
    String [] arrayDemasPalabras = new String[8];
    //Array con los colores
    String [] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    int indiceGuardaColores = 0;
    int indiceDemasPalabras = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Escriba 8 palabras, pulse ENTER para la siguiente palabra: ");

    for (int i = 0; i < arrayPalabras.length; i++) {
      System.out.print("Palabra "+(i+1)+": ");
      String palabra = teclado.next();

      boolean esColor = false;

      //Buscamos la palabra introducida por si fuera un color dentro del array de colores
      for (int j = 0; j < colores.length; j++) {
        //Si la palabra está contenida en el array, la guardaremos y aumentaremos su índice
        if (palabra.equals(colores[j])) {
          arrayGuardaColores[indiceGuardaColores] = palabra;
          indiceGuardaColores++;
          esColor = true;
        }
      } 
      //Si no es color, se introduce en el array DemasPalabras
      if (!esColor) {
        arrayDemasPalabras[indiceDemasPalabras] = palabra;
        indiceDemasPalabras++;
      }
      arrayPalabras[i] = palabra;
    }

    //Mostramos Array Original
    for (int i = 0; i < arrayPalabras.length; i++) {
      System.out.printf("%10d", i);
    }

    System.out.println("");

    for (int i = 0; i < arrayPalabras.length; i++) {
      System.out.printf("%10s", arrayPalabras[i]);
    }

    System.out.println("");

    //Mostramos el array modificado

    for (int i = 0; i < indiceGuardaColores; i++) {
      System.out.printf("%10s", arrayGuardaColores[i]);
    }
    for (int i = 0; i < indiceDemasPalabras; i++) {
      System.out.printf("%10s", arrayDemasPalabras[i]);
    }

    teclado.close();
  }
}
