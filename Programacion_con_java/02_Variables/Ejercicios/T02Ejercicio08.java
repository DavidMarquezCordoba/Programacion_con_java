/*
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación
de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author David Márquez Córdoba
 */

public class T02Ejercicio08 {
  public static void main(String[] args) {
    char letra1 = 'D';
    char letra2 = 'a';
    char letra3 = 'v';
    char letra4 = 'i';
    char letra5 = 'd';

    String nombre = ""+ letra1 + letra2 + letra3 + letra4 + letra5;

    System.out.println(nombre);
  }
}
