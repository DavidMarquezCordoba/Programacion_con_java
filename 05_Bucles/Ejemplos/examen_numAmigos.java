import java.util.Scanner;

/**
//Realiza un programa que solicite dos números. 
//Una vez introducidos debe mostrar los divisores propios de cada número, incluyendo el 1 pero no al propio número. 
//Además, debe también mostrar la suma de dichos divisores para determinar al final si ambos son números amigos, 
//es decir, si la suma de dichos divisores es igual que el otro número introducido.

//Ejemplo de salida del programa:

//Introduzca un número: 220

//Introduzca otro número: 284

//Los divisores propios de 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110

//	La suma de los divisores de 220 es = 284

//Los divisores propios de 284 son: 1, 2, 4, 71, 142

//	La suma de los divisores de 284 es = 220

//	220 y 284 son números amigos
 * 
 * @author David Márquez Córdoba
 */

public class examen_numAmigos {
  public static void main(String[] args) {
    
    int num1;
    int num2;
    int suma1 = 0;
    int suma2 = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    num1 = teclado.nextInt();

    System.out.print("Introduzca otro número: ");
    num2 = teclado.nextInt();

    System.out.println("");
    System.out.println("Los divisores propios de "+num1+ " son: ");
    System.out.println("");

    // Primer número

    for (int i = 1; i < num1; i++) {
      
      if (num1%i==0) {
        System.out.print(i);
        suma1+=i;
      }
    }

    System.out.println("");
    System.out.println("");

    //Segundo número
    System.out.println("Los divisores propios de "+num2+ " son: ");
    System.out.println("");

    for (int j = 1; j < num2; j++) {
      
      if (num2%j==0) {
        System.out.print(j+" ");
        suma2+=j;
      }
    }

    System.out.println("");
    System.out.println("");
    System.out.println("********** RESULTADO **********");
    System.out.println("");

    //Resultado

    if (suma1 == suma2) {
      System.out.println(num1+ " y "+ num2 + " son números amigos.");
    } else{
      System.out.println(num1+ " y "+ num2 + " NO son números amigos.");
    }

    teclado.close();
  }
}
