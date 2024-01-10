/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio02 {
  public static void main(String[] args) {

    //En el caso que sea un Arrays de String el resultado es: NULL
    System.out.println("ARRAYS DE STRINGS\n");

    String [] simbolo = new String[10];

    simbolo [0] = "'a'";
    simbolo [1] = "'x'";
    // simbolos [2] = "'$'";
    // simbolos [3] = "'$'";
    simbolo [4] = "'@'";
    // simbolos [5] = "'$'";
    simbolo [6] = "' '";
    simbolo [7] = "'+'";
    simbolo [8] = "'Q'";
    // simbolos [9] = "'$'";

    for (int i = 0; i < simbolo.length; i++) {
      System.out.println("Posición " + i + " contiene el carácter : " +simbolo[i]);
    }

    System.out.println("");
    System.out.println("-----------------");
    System.out.println("ARRAYS DE CHAR\n");

    //En el caso que sea un Arrays de Char el resultado es: vacío
    char[] simboloChar = new char[10];

    simboloChar[0] = 'a';
    simboloChar[1] = 'x';
    // simbolo[2] = '$';
    // simbolo[3] = '$';
    simboloChar[4] = '@';
    // simbolo[5] = '$';
    simboloChar[6] = ' ';
    simboloChar[7] = '+';
    simboloChar[8] = 'Q';
    // simbolo[9] = '$';

    for (int i = 0; i < simboloChar.length; i++) {
      System.out.println("Posición " + i + " contiene el carácter : " + simboloChar[i]);
    }
  }
}
