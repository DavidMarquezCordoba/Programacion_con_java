import java.util.Scanner;

/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
 * 
 * @author David Márquez Córdoba
 */

public class T03Ejercicio04 {
  public static void main(String[] args) {
    
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    double division;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Escriba el primer número: ");
    num1 = teclado.nextInt();

    System.out.printf("Escriba el segundo número: ");
    num2 = teclado.nextInt();

    teclado.close();

    //Lógica
    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = (double)num1 / (double)num2;

    //Salida por pantalla

    System.out.printf("%d + %d = %d\n", num1, num2, suma);
    System.out.printf("%d - %d = %d\n", num1, num2, resta);
    System.out.printf("%d * %d = %d\n", num1, num2, multiplicacion);
    System.out.printf("%d / %d = %.2f\n", num1, num2, division);

  }
}


//DUDAS
//Hay alguna forma de que la división saque número enteros si es entero el resultado y double si es decimal?