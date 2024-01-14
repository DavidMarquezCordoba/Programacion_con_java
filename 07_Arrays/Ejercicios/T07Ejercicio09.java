/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
    números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio09 {
  public static void main(String[] args) {
    
    int [] parImpar = new int [8];

    System.out.print("Introduce 8 números para averiguar si son pares o impares\n");

    for (int i = 0; i < parImpar.length; i++) {
      System.out.print("Número "+(i+1)+": ");
      parImpar[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("--------------");
    //Mostramos por pantalla
    for (int i = 0; i < parImpar.length; i++) {
      System.out.print(parImpar[i]+ "--> ");

      if (parImpar[i] %2 ==0) {
        System.out.print("PAR\n");
      } else {
        System.out.print("impar\n");
      }
      
    }
  }
}
