package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author David Márquez Córdoba
 */

public class Varias {

  /**
  * Comprueba si un número entero positivo es primo o no.
  * Un número es primo cuando únicamente es divisible entre
  * él mismo y la unidad.
  *
  * @param x un número entero positivo
  * @return <code>true</code> si el número es primo
  * @return <code>false</code> en caso contrario
  */

  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
      return false;
      }
    }

    return true;
  }


  /**
  * Devuelve el número de dígitos que contiene un número entero
  *
  * @param x un número entero
  * @return la cantidad de dígitos que contiene el número
  */

  public static int digitos(int x) {

      if (x == 0) {
        return 1;
      } else {

        int n = 0;

        while (x > 0) {
          x = x / 10;
          n++;

        }

        return n;
      }
  }


  
  /** 
   * Función que devuelve el número introducido volteado
   * 
   * @param x un número de tipo long
   * @return long el número volteado
   */
  public static long voltearNumeros (long x){
    
    int ultimoDigito = 0;
    long numVolteado = 0;


    if ( x < 0) {
      return voltearNumeros(-x);
    }
    while (x>0) {
      ultimoDigito = (int) x%10;
      numVolteado = (numVolteado*10)+ultimoDigito;
      x/=10;
    }

    return numVolteado;
  }

  /** 
   * Función que voltea un número
   * 
   * @param x un número de tipo int
   * @return int el número volteado
   */
  public static int voltearNumeros(int x){

    return (int) voltearNumeros((long)x);
  }

  /** 
   * Función que comprueba si un número es capicúa o no (LONG)
   * 
   * @param x un número de tipo long
   * @return devuelve true si es capicuo un número o false cuando no lo es
   */
  public static boolean esCapicua (long x){
    boolean resultado = false;

    if (x == voltearNumeros(x)) {
      resultado = true;
    }

    return resultado;
  }

  /** 
   * Función que comprueba si un número es capicúa o no (INT)
   * 
   * @param x un número de tipo int
   * @return devuelve true si es capicuo un número o false cuando no lo es
   */
  public static boolean esCapicua(int x){

    return esCapicua((long)x);
  }

  /** 
   * Función que te dice cual es el siguiente número primo 
   * 
   * @param x un número de tipo int
   * @return devuelve el siguiente número primo
   */
  public static int siguientePrimo (int x){
    do {
      x++;
    } while (esPrimo(x)== false);
    return x;
  }

  /** 
   * Función que suma los divisores propios de un número
   * 
   * @param x un número de tipo int
   * @return devuelve true si es capicuo un número o false cuando no lo es
   */
  public static int sumaDivisoresPropios (int x){
    int suma= 0;

    for (int i = 1; i < x; i++) {
      if (x%i==0) {
        suma+=i;
      }
    }
    return suma;
  }

  /** 
   * Función que comprueba si la suma de dos divisores propios son iguales, y son amigos
   * 
   * @param x un número de tipo int
   * @param y un número de tipo int
   * @return devuelve true si es amigo un número o false cuando no lo es
   */
  public static boolean numerosAmigos (int x, int y){
    if (x == sumaDivisoresPropios(y) && y == sumaDivisoresPropios(x)) {
      return true;
    }
    return false;
  }

  /////////////////////////HECHOS POR MI//////////////////////////////////

  /**
   * Función que suma los 100 números siguientes al introducido
   * 
   * @param x Número introducido por pantalla
   * @return el valor de la suma de los 100 números siguientes al introducido
   */

  public static long sumaCienNumerosSiguientes (int x){

    long bote = 0;
    for (int i = x+1; i <= (x+100); i++) {
      bote+=i;
    }
    return bote;
  }


  /**
   * Función que pinta pirámides del tamaño que quiera el usuario
   * 
   * @param x altura introducida por teclado
   * @return pirámide con la altura introducida
   */

  public static void piramide (int x){

    int nivel=1;
    int asteriscos = 1;

    while (nivel <= x) {

      for (int i = 1; i <= x-nivel; i++) {
        System.out.print(" ");
      }

      if (nivel==1) {

        System.out.print("*");

      } else {

        System.out.print("*");

        for (int i = 1; i < asteriscos; i++) {
          System.out.print("*");
        }
      }

      System.out.println("");
      asteriscos+=2;
      nivel++;
      
    }

  }
}
