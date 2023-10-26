import java.util.Scanner;

/*
 * Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
 * 
 * @author David Márquez Córdoba
 */

public class T03Ejercicio01 {
  public static void main(String[] args) {

    //Declaro variables
    int num1;
    int num2;
    

    //Creo instancia de la clase Scanner para meter por pantalla los datos.
    Scanner teclado = new Scanner(System.in);

    //Introducimos el primero número
    System.out.println("Diga un número: ");
    num1= teclado.nextInt();

    //Introducimos el segundo número
    System.out.println("Introduce otro número: ");
    num2 = teclado.nextInt();

    int resultado = num1 * num2;

    System.out.println("********RESULTADO*******");
    System.out.println(num1+ " x "+ num2+" = "+resultado);

    

  }
}
