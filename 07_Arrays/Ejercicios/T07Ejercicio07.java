/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio07 {
  public static void main(String[] args) {
    
    int [] num = new int [100];

    System.out.println("\n100 NÚMERO ALEATORIOS ENTRE 0-20");
    System.out.println("================================\n");
    for (int i = 0; i < num.length; i++) {
      num [i] = (int)(Math.random()*21);
    }

    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i]+" ");
    }

    System.out.println("\n");

    System.out.println("Introduzca 2 valores");
    System.out.println("====================");
    System.out.print("Valor 1: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Valor 2: ");
    int valor2 = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < num.length; i++) {

      
      if (num[i] == valor1) {
        num[i] = valor2;
        System.out.print("\""+num[i]+"\" ");
        i++;
      }
      System.out.print(num[i]+" ");

    }
  }
}
