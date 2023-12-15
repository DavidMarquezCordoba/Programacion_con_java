import java.util.Scanner;

import matematicas.Area;
import matematicas.Geometria;
import matematicas.Varias;

/**
 * Prueba de diversas funciones
 * 
 * @author David Márquez Córdoba
 */

public class PruebaFunciones01 {
  public static void main(String[] args) {
    
    int numeroIntroducido;

    ///////////////////////////////////////// PRIMO O NO PRIMO ////////////////////////////////////////////////
    //Prueba función de comprobar si el número es primo o no (esPrimo)

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("COMPROBAR SI ES PRIMO O NO");
    System.out.println("==========================");
    System.out.println("");

    System.out.printf("Introduce un número entero positivo: ");
    numeroIntroducido = teclado.nextInt();

    //Llamamos a las funciones por orden desde su paquete original {matematicas} y luego {Varias} y por último su función esPrimo
    if (matematicas.Varias.esPrimo(numeroIntroducido)) {
      System.out.printf("El número %d es primo\n", numeroIntroducido);
    } else {
      System.out.printf("El número %d NO es primo\n", numeroIntroducido);
    }

    ///////////////////////////////////////// PRUEBA DÍGITOS  ////////////////////////////////////////////////
    System.out.println("");
    System.out.println("PRUEBA DÍGITOS");
    System.out.println("==============");
    System.out.println("");

    System.out.printf("Introduce un número entero positivo: ");
    numeroIntroducido = teclado.nextInt();

    System.out.printf("El número %d tiene %d dígitos\n", numeroIntroducido, matematicas.Varias.digitos(numeroIntroducido));

    ///////////////////////////////////////// PRUEBA VOLUMEN CILINDRO  ////////////////////////////////////////////////
    System.out.println("");
    System.out.println("PRUEBA VOLUMEN CILINDRO");
    System.out.println("=======================");
    System.out.println("");

    //Declaración de variables
    double r;
    double h;

    System.out.printf("Introduce el radio (r) en metros: ");
    r = teclado.nextDouble();
    System.out.printf("Introduce la altura (h) en metros: ");
    h = teclado.nextDouble();

    System.out.printf("El volumen del cilindro es de %.2f m3\n", matematicas.Geometria.volumenCilindro(r, h));

    ///////////////////////////////////////// PRUEBA LONGITUD DE LA CIRCUNFERENCIA  ////////////////////////////////////////////////
    System.out.println("");
    System.out.println("PRUEBA LONGITUD DE LA CIRCUNFERENCIA");
    System.out.println("====================================");
    System.out.println("");

    // Variable radio necesaria para calcular el volumen declarada en la prueba anterior

    System.out.printf("Diga el radio de una circunferencia para calcular su longitud: ");
    r = teclado.nextDouble();

    System.out.printf("La longitud de la circunferencia con longitud %.2f es %.2f m\n", r, matematicas.Geometria.longitudCircunferencia(r));

    ///////////////////////////////////////// PRUEBA ÁREA  ////////////////////////////////////////////////

    System.out.println("");
    System.out.println("PRUEBA ÁREA DE CUADRADO");
    System.out.println("========================");
    int base;
    int altura;

    System.out.print("Introduce la base: ");
    base = teclado.nextInt();
    System.out.print("Introduce la altura: ");
    altura = teclado.nextInt();

    System.out.printf("El área del cuadrado es %.2f", Area.areaCuadrado(base, altura));

    ///////////////////////////////////////// VOLTEAR NÚMERO  LONG////////////////////////////////////////////////

    long num = 0;

    System.out.print("Introduce un número para voltearlo: ");
    num = teclado.nextLong();

    System.out.print("El número volteado es: "+ Varias.voltearNumeros(num));


      ///////////////////////////////////////// VOLTEAR NÚMERO  INT ////////////////////////////////////////////////

    System.out.print("Introduce un número para voltearlo: ");
    num = teclado.nextInt();

    System.out.print("El número volteado es: "+ Varias.voltearNumeros(num));

      ///////////////////////////////////////// Es Capicúa ? ////////////////////////////////////////////////

    System.out.println("Introduce un número: ");
    int numIn = teclado.nextInt();

    if (Varias.esCapicua(numIn)) {
      System.out.println("Es capicúa");
    } else {
      System.out.println("No es capicúo");
    }

    ///////////////////////////////////////// Es Capicúa ? ////////////////////////////////////////////////

    System.out.println("Introduce un número: ");
    int numInt = teclado.nextInt();

    System.out.println("El siguiente número primero de "+numInt+ " es "+ Varias.siguientePrimo(numInt));

    ///////////////////////////////////////// SON AMIGOS ? ////////////////////////////////////////////////

    System.out.print("Introduce un número para averiguar si son amigos: ");
    int x = teclado.nextInt();
    System.out.print("Introduce otro número para averiguar si son amigos: ");
    int y = teclado.nextInt();
    
    if (Varias.numerosAmigos(x, y)) {
      System.out.println("Son amigos");
    } else {
      System.out.println("No son amigos");
    }
    teclado.close();
  }
}
