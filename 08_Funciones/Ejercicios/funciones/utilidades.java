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


  /**
   * Función pegaPorDetras: Añade un dígito a un número por detrás.
   * 
   * @param x long: Número entero introducido por teclado.
   * @param y long: Número que se añadirá por detrás a x
   * @return long número completo con las dos partes unidas
   */

  public static long pegaPorDetras (long x, long y){

    String numeroComoStringX = String.valueOf(x);
    String numeroComoStringY = String.valueOf(y);
    String sNumCompleto = numeroComoStringX+numeroComoStringY;
    long parseo = Long.parseLong(sNumCompleto);
    return parseo;
  }

  /**
   * Función pegaPorDelante: Añade un dígito a un número por delante.
   * 
   * @param x long con el número entero introducido por teclado
   * @param y long con el número que se añadirá por delante de x
   * @return long número completo con las dos partes unidas
   */

  public static long pegaPorDelante (long x, long y){
    String numeroComoStringX = String.valueOf(x);
    String numeroComoStringY = String.valueOf(y);
    String sNumCompleto = numeroComoStringY+numeroComoStringX;
    long parseo = Long.parseLong(sNumCompleto);
    return parseo;
  }

  /**
   * Función trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param num long - Número introducido para recortar
   * @param x int posición que cortará por delante
   * @param y int posición que cortará por detrás
   * @return long devuelve el trozo recortado por delante y por detrás
   */

  public static long trozoDeNumero (long num, int x, int y){
    long numRecortado = quitaPorDelante(num, x);
    long trozo = quitaPorDetras(numRecortado, y);
    return trozo;
  }

  /**
   * Función juntaNumerosIzq: Pega dos números para formar uno.
   * 
   * @param num1 long Número que formará otro número mayor juntando el num2
   * @param num2 long Número que formará otro número mayor juntando el num1
   * @return long valor de junta num1 y num2
   */

  public static long juntaNumerosIzq(long num1, long num2){

    return pegaPorDelante(num1, num2);
  }

    /**
   * Función juntaNumerosDer: Pega dos números para formar uno.
   * 
   * @param num1 long Número que formará otro número mayor juntando el num2
   * @param num2 long Número que formará otro número mayor juntando el num1
   * @return long valor de junta num1 y num2
   */

  public static long juntaNumerosDer(long num1, long num2){

    return pegaPorDetras(num1, num2);
  }

  /**
   * Función que muestra los números primos que hay entre 1 y 1000.
   */

  public static void primosDe1A1000(){
    for (int i = 1; i < 1000; i++) {
      if (esPrimo(i)) {
        System.out.print(i+" "); 
      }
    }
  }

  /**
   * Función que Muestra los números capicúa que hay entre 1 y 99999.
  */

  public static void capicuasEntre1Y99999(){
    for (int i = 1; i < 99999; i++) {
      if (esCapicua(i)) {
        System.out.print(i+" "); 
      }
    }
  }

  /**
   * Función que pasa de binario a decimal.
   * 
   * @param x long - Número binario que introduce el usuario por teclado.
   * @return long - Número decimal equivalente al número binario introducido
  */

  public static long binarioADecimal(long x){

    
    
    long digitos = cuentaDigitos(x);          // Contamos los dígitos de x
    long total = 0;
    String binarioString = String.valueOf(x); // Convertir el número binario a una cadena para obtener su longitud

    //Una vez obtenemos la longitud, lo vamos recorriendo caracter a caracter hasta el final
    for (int i = 0; i < binarioString.length(); i++) {
      //Obtenemos el valor de cada caracter en cada una de las posiciones
      int valorCaracter = Character.getNumericValue(binarioString.charAt(i));
      //Vamos acumulando valores del resultado de multiplicar el valor del caracter por la potencia base 2 de cada uno de los dígitos.
      total += valorCaracter * Math.pow(2, digitos - i -1);
    }

    return total;
  }
  

  /**
   * Función que pasa de decimal a binario.
   * @param x long - Número decimal introducido por el usuario
   * @return String - Número binario en formato String
  */

  public static String decimalABinario(long x){

    int modulo;
    String binario="";

    do {
      
      modulo = (int) x%2;
      x/=2;
      binario += Integer.toString(modulo);
      
    } while (!(x ==0));

  
    StringBuilder sb = new StringBuilder(binario);
    sb.reverse();
    return sb.toString();
  }

  
}
