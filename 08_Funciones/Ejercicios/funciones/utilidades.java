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

  /**
   * Función para calcular la potencia de base elevado a exponente.
   * 
   * @param x int de base
   * @param y int de exponente
   * @return La potencia de base elevado a exponente
   */

  public static double potencia(int x, int y){

    return Math.pow(x, y);
  }

  /**
   * Función que cuenta el número de dígitos de un número entero.
   * 
   * @param x número introducido por teclado
   * @return el número de dígitos de un número
   */

  public static long cuentaDigitos (long x){

    int contador = 0;

    while (x>0) {
      x/=10;
      contador++;
    }
    return contador;
  }


  /**
   * Función voltea: Le da la vuelta a un número.
   * 
   * @param x tipo long, número que introducimos por pantalla.
   * @return número volteado
   */

  public static long voltea(long x){
    int ultimoDigito = 0;
    long numVolteado = 0;

    if ( x < 0) {
      return voltea(-x);
    }
    while (x>0) {
      ultimoDigito = (int) x%10;
      numVolteado = (numVolteado*10)+ultimoDigito;
      x/=10;
    }

    return numVolteado;
  }

  /**
   * Función digitoN: Devuelve el dígito que está en la posición n de un número entero.
Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param x long número entero
   * @param y int posición
   * @return digito, el dígito que ocupa la posición y de x
   */

  public static int digitoN(long x, int y){

    long numVolteado = 0;
    int ultimoDigito = 0;
    long numRestaurado = 0;

    while (x>0) {
      ultimoDigito = (int)x%10;
      numVolteado = numVolteado*10 + ultimoDigito;
      x/=10;
    }

    for (int i = 0; i < y; i++) {
      ultimoDigito = (int)numVolteado%10;
      numRestaurado = numRestaurado*10 + ultimoDigito;
      numVolteado/=10;
    }

    return ultimoDigito;

  }

  
  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no lo encuentra devuelve -1
   * 
   * @param numEntero valor de un número entero
   * @param digito dígito a buscar dentro de numEntero
   * @return Posición del número dentro de un número entero 
   */

  public static int posicionDeDigito (int numEntero, int digito){

    long numeroDigitos = cuentaDigitos(numEntero);
    long numVolteado = voltea(numEntero);
    int ultimoDigito = 0;

    for (int i = 1; i <= numeroDigitos; i++) {
      ultimoDigito = (int)numVolteado%10;

      if (ultimoDigito == digito) {
        return i;
      }
      numVolteado/=10;
    }

    return -1;
  }

  /**
   * Función quitaPorDetras: Le quita a un número n dígitos por detrás (por la
derecha).
   * 
   * @param numEntero número que introducimos por teclado
   * @param quitaDigitos cantidad que dígitos que vamos a recortar a numEntero
   * @return el número ya recortado
   */

  public static long quitaPorDetras (long numeroEntero, int quitaDigitos){

    for (int i = 0; i < quitaDigitos; i++) {
      numeroEntero/=10;
    }

    return numeroEntero;
  }

  /**
   * quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda).
   * 
   * @param x tipo long, número introducido por teclado para recortar.
   * @param y tipo int , cantidad de dígitos a recortar.
   * @return long número recortado por delante.
   */

  public static long quitaPorDelante (long x, int y){

    long numVolteado = voltea(x);
    long numRecortado = quitaPorDetras(numVolteado, y);
    return voltea(numRecortado);
  }
}
