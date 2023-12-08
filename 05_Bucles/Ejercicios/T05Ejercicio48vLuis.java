import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio48vLuis {
  public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());
    long aux;
    boolean encontrado;
    System.out.print("Dígitos que aparecen en el número: ");
    for (int i = 0; i < 10; i++) {
    // Comprueba si i está en el número
    encontrado = false;
    aux = numero;
    while (aux > 0) {
    if (aux % 10 == i) {
    encontrado = true;
    }
    aux /= 10;
    }
    
    if (encontrado) {
    System.out.print(i + " ");
    }
    }
    System.out.print("\nDígitos que no aparecen: ");
    for (int i = 0; i < 10; i++) {
    // Comprueba si i está en el número
    encontrado = false;
    aux = numero;
    while (aux > 0) {
    if (aux % 10 == i) {
    encontrado = true;
    }
    aux /= 10;
    }
    if (!encontrado) {
    System.out.print(i + " ");
    }
    }
    }
    }
    
//     Scanner teclado = new Scanner(System.in);

//     System.out.print("Introduzca un número entero: ");
//     long numIntroducido = Long.parseLong(teclado.nextLine());

//     long aux;
//     boolean encontrado;

//     System.out.print("Dígitos que aparecen en el número: ");

//     for (int i = 0; i < 10; i++) {
//       //Comprueba si i está en el número introducido

//       encontrado=false;
//       aux = numIntroducido;

//       while (aux > 0) {
        
//         if ( aux %10 == i) {
//           encontrado = true;
//         }

//         aux /=10;

//       }
      
//       if (encontrado) {
//         System.out.print(i + " ");
//       }
//     }

//     //Comprobamos ahora los que NO aparecen

//     System.out.println("");
//     System.out.print("Dígitos que NO aparecen: ");

//     for (int i = 0; i < 10; i++) {
      
//       encontrado = false;
//       aux = numIntroducido;

//       while (aux > 0) {
        
//         if (aux % 10 == i) {
//           encontrado = true;
//         }

//         aux/=10;
//       }

//       if (!encontrado) {
//         System.out.print(i + " ");
//       }
//     }

//     teclado.close();
//   }
// }


