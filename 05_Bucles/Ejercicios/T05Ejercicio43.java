import java.util.Scanner;

/**
 * Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio43 {
  public static void main(String[] args) {
    
    long numeroIntroducido = 0;
    int cuentaDigitos = 0;
    int numeroCorte = 1;
    long restar = 0;
    long numerosARestar = 0;
    long numeroIzquierda = 0;
    long numerosDerecha = 0;
    long aux = 0;
    long numeroVolteado = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Por favor, introduzca un número entero positivo: ");
    numeroIntroducido = teclado.nextLong();
    long copiaNumeroIntroducido = numeroIntroducido;

    System.out.printf("Introduzca la posición a partir de la cual quiere partir el número: ");
    numeroCorte = teclado.nextInt();

    //Calculamos número de dígitos tiene el número introducido
    for (int i = 0; i < numeroIntroducido; i++) {
      restar = numeroIntroducido % 10;
      cuentaDigitos+=1;
      numeroIntroducido = restar;
    }

    //Reiniciamos el número introducido a su valor original
    numeroIntroducido = copiaNumeroIntroducido;

    //Calculamos cuantos números tiene que quitar por la parte derecha
    numerosARestar = numeroIntroducido - (numeroCorte-1);

    //Damos la vuelta al número
    for (int i = 0; i < cuentaDigitos; i++) {
      numeroVolteado = (numeroIntroducido%10)+ (numeroVolteado*10);
      //Actualizamos valor
      numeroIntroducido = numeroIntroducido/10;
    }
    
    //Vamos recorriendo el número introducido para ir 
    for (int i = 1; i < numeroCorte; i++) {
      numeroIzquierda = numeroVolteado % 10;
      //Vamos actualizando valor
      numeroVolteado = numeroVolteado/10;
    }

    System.out.println("El número de la parte izquierda es "+numeroIzquierda);

    // System.out.println(cuentaDigitos);


    teclado.close();
  }
}
