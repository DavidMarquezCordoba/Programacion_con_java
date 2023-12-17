package funciones;

public class utilidades {

  //AQUÍ VAN TODAS LAS FUNCIONES NECESARIAS PARA LA RESOLUCIÓN DE EJERCICIOS DEL TEMA 8 

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
}
