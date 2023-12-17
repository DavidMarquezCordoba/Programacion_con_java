package funciones;

public class utilidades {

  //AQUÍ VAN TODAS LAS FUNCIONES NECESARIAS PARA LA RESOLUCIÓN DE EJERCICIOS DEL TEMA 8 

  /**
   * Devuelve true o false si un número introducido es capicúa
   * 
   * @param x Número introducido por teclado de tipo long
   * @return true si es capicúa o false si no es capicúa
   * 
   */

  public static boolean esCapicua (long x){

    long numOriginal = x;
    long numVolteado = 0;

    while (x>0) {
      long ultimacifra = x%10; 
      numVolteado = numVolteado*10 + ultimacifra;
      x/=10;
    }

    if (numVolteado==numOriginal) {
      return true;
    } else {
      return false;
    }
  }


  /**
   * Función que comprueba si un número es primo o no
   * 
   * @param x número introducido de tipo int
   * @return true si es primo o false si no lo es
   */
  public static boolean esPrimo(int x){

    for (int i = 2; i < x; i++) {
      if ((x%i)==0) {
        return false;
      } 
    }

    return true;
  }

  /**
   * Devuelve el siguiente número primo partiendo del número introducido
   * 
   * @param x int valor del número introducido por teclado
   * @return devuelve el siguiente número primo
   */

  public static int siguientePrimo (int x){

    do {
      x++;
    } while (esPrimo(x)==false);

    return x;
  }









}
