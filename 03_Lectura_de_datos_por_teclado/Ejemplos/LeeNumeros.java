/**
 * Explica tu código aquí
 * 
 * @author Sergio Sánchez
 */

public class LeeNumeros {
  public static void main(String[] args) {
    
    String numString1;
    String numString2;

    int num1;
    int num2;

    System.out.println("");
    System.out.printf("Diga un número: \n");
    numString1 = System.console().readLine();

    num1 = Integer.parseInt(numString1); //Parseamos a entero
    
    System.out.printf("Diga otro número: \n");
    numString2 = System.console().readLine();

    num2 = Integer.parseInt(numString2);

    int suma = num1 + num2;

    System.out.println("");
    System.out.printf("La suma de %d y %d es %d.", num1,num2, suma);

    //Parsear float

    System.out.print("Introduce un número real: ");
    String linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);
    System.out.println("El número parseado es: "+numReal);
  }
}
