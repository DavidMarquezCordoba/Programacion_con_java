
// // /*
// //  * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
// // programa debe pedir la altura. Se debe comprobar que la altura sea un nÃºmero
// // impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error. 
// //  * 
// //  * @autor Barbara Colomer
// //  */

// import java.util.Scanner;

// public class T05Ejercicio38R35 {
//   public static void main(String[] args) {

//     int altura = 0;
//     //Yo solo he dejado una sola variable mitad, ya que siempre es la misma
//     int mitad = 0;
//     //Igual con las estrellas, solo le he dejado una
//     int estrellas = 0;
//     //He creado una variable nivel que controlará los espacios centrales
//     int nivel = 1;

//     Scanner s = new Scanner(System.in);

//     System.out.println("Por favor introduzca la altura para el reloj de arena");

//     do {

//       altura = s.nextInt();

//       if ((altura < 3) || (altura % 2 == 0)) {

//         System.out.println("Debe introducir un numero impar mayor a tres");
//       }
//     } while ((altura < 3) || (altura % 2 == 0));

//     s.close();

//     mitad = (altura / 2);

//     estrellas = altura;

//     //Imprime la mitad superior

//     for (int i = 0; i < mitad; i++) {

//       for (int j = 0; j < i; j++) {
//         System.out.print(" ");
//       }

//       for (int j = 0; j < estrellas; j++) {
//         System.out.print("*");

//       }
//       estrellas-=2;
//       nivel++;
//       System.out.println();
//     }


//     // Imprime asterisco central
//     for (int i = 1; i < nivel; i++) {
//       System.out.print(" ");
//     }

//     System.out.println("*");

//     //Imprime mitad inferior

//     //Compenso con las dos estrellas que he quitado antes, así pintará la base
//     estrellas+=2;

//     //Inicializo i en 1 porque empieza descontando, y para compensar, la i <= mitad le añado el =
//     for (int i = 1; i <= mitad; i++) {
      
//       for (int j = 0; j < mitad-i; j++) {
//         System.out.print(" ");
//       }

//       for (int j = 0; j < estrellas; j++) {
//         System.out.print("*");
//       }

//       estrellas+=2;
//       System.out.println("");
//     }
//   }

// }

/*
 
Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error. 
 
@autor Barbara Colomer
*/

import java.util.Scanner;

public class T05Ejercicio38R35 {
  public static void main(String[] args) {

    int altura = 0;
    int mitadA = 0;
    int estrellasA = 0;
    int mitadB = 0;
    int estrellasB = 0;

    Scanner s = new Scanner(System.in);

    System.out.println("Por favor introduzca la altura para el reloj de arena");

    do {
      altura = s.nextInt();
      if ((altura < 3) || (altura % 2 == 0)) {
        System.out.println("Debe introducir un numero impar mayor a tres");
      }
    } while ((altura < 3) || (altura % 2 == 0));
    s.close();

    mitadA = (altura / 2) + 1;
    estrellasA = altura;
    mitadB = (altura)/ 2;
    estrellasB = mitadB;

    for (int i = 0; i < mitadA; i++) {
      
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < estrellasA; j++) {
        System.out.print("*");

      }
      estrellasA = estrellasA - 2;
      System.out.println();
    }

    for (int i = 1; i <= mitadB; i++) {

      for (int j = 0; j < mitadB - i; j++) {
        System.out.print(" ");
      }

      System.out.print("*");

      if (altura == 3) {
        System.out.print("*");
      }

      for (int j = 0; j < estrellasB; j++) {
        System.out.print("*");
      }

      
      estrellasB = estrellasB + 2;
      System.out.println();

    }

  }

}