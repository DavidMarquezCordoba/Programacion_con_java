/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio49 {
    public static void main(String[] args) {
    
      Scanner teclado = new Scanner(System.in);

      int numIntroducido;
      int suma = 0;
      int contador = 0;
      int mayor = Integer.MIN_VALUE;
      int menor = Integer.MAX_VALUE;
      double media = 0;
      boolean esPrimo = false;

      System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");

      do {
        numIntroducido = teclado.nextInt();

        // Comprueba si el número es primo
        esPrimo = true;

        for (int i = 2; i < numIntroducido; i++) {
          // Parte desde 2, porque sabemos que si el primo y dividimos entre 1 ya saldrá 0, por lo que tendremos que descartar todos
          // los números entre el 1 y el número introducido sin incluirlos.
          if (numIntroducido % i == 0) {
            esPrimo = false;
            break; // Si no es primo, no es necesario continuar comprobando
          }
        }

        // Si no es primo, se contabiliza
        if (!esPrimo) {
            suma += numIntroducido;
            contador++;

            mayor = numIntroducido > mayor ? numIntroducido : mayor;
            menor = numIntroducido < menor ? numIntroducido : menor;

            media = (double) suma / contador;
        }

      } while (!esPrimo);

      System.out.println("Ha introducido " + contador + " números no primos.");
      System.out.println("El número máximo ha sido el " + mayor);
      System.out.println("El número mínimo ha sido el " + menor);
      System.out.println("La media ha sido " + media);

      teclado.close();
    }
}

    // Scanner teclado = new Scanner(System.in);
    // int numIntroducido;
    // int suma = 0;
    // int contador = 0;
    // int mayor = Integer.MIN_VALUE;
    // int menor = Integer.MAX_VALUE;
    // double media = 0;
    // boolean esPrimo = true; 

    // System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");

    // do {
    //   numIntroducido = teclado.nextInt();

    //   //Comprueba si el número es primo
    //   for (int i = 2; i < numIntroducido; i++) {

    //     // Parte desde 2, porque sabemos que si el primo y dividimos entre 1 ya saldrá 0, por lo que tendremos que descartar todos
    //     // los números entre el 1 y el número introducido sin incluirlos.
    //     if (numIntroducido % i == 0) {
    //       esPrimo = false;
          
    //     }
        
    //     //Si no es primo, se contabiliza
    //     if ((!esPrimo)) {
          
    //       suma+=numIntroducido;
    //       contador++;

    //       mayor = numIntroducido > mayor ? numIntroducido : mayor;
    //       menor = numIntroducido < menor ? numIntroducido : menor;
    //     }

    //     media = suma / contador;
    //   }
    // } while (!(esPrimo));

    // System.out.println("Ha introducido "+contador+ " números no primos.");
    // System.out.println("El número máximo ha sido el "+ mayor);
    // System.out.println("El número mínimo ha sido el "+ menor);
    // System.out.println("La media ha sido "+ media);

    // teclado.close();


    // java.util.Scanner;

/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author David Márquez Córdoba
 */

// public class T05Ejercicio49 {
//   public static void main(String[] args) {
    
//     Scanner teclado = new Scanner(System.in);

//     int numIntroducido;
//     int suma = 0;
//     int contador = 0;
//     int contadorMenor = 0;
//     int mayor = 0;
//     int auxMax = 0;
//     int menor;
//     int auxMenor = 0;
//     double media = 0;
//     int aux;
//     boolean esPrimo = true; 
//     boolean salir = false;

//     System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");

//     do {
//       numIntroducido = teclado.nextInt();

//       //Comprueba si el número es primo
//       for (int i = 2; i < numIntroducido; i++) {

//         // Parte desde 2, porque sabemos que si el primo y dividimos entre 1 ya saldrá 0, por lo que tendremos que descartar todos
//         // los números entre el 1 y el número introducido sin incluirlos.
//         if (numIntroducido % i == 0) {
//           esPrimo = false;
          
//         }
        
//         //Si no es primo, continuamos
//         if ((!esPrimo)&& numIntroducido >0) {
//           //Si el número introducido es mayor que 0 se suma y se cuenta para la media
//           if (numIntroducido>0) {
//             suma+=numIntroducido;
//             contador++;
//           }
//           if (numIntroducido > mayor) {
//             mayor = numIntroducido;
//           }

//           if (contador>=2) {
//             if (numIntroducido < mayor) {
//               menor = numIntroducido;
//             }
//           }
//         }
//       }
//     } while (!(esPrimo));

//     System.out.print("El máximo es " + mayor);
//     if (contador>=2) {
//       menor = 0;
//       System.out.println("El menor es " + menor);
//     }
//     teclado.close();
//   }
// }"