import java.util.Scanner;

/**
 * Escribe un programa que rellene un array de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
 * 
 * @author David Márquez Córdoba
 */
public class T07Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int [] arrayOriginal = new int[500];

    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    //Rellenamos
    for (int i = 0; i < arrayOriginal.length; i++) {
      arrayOriginal[i]= (int)(Math.random()*501);

      if (arrayOriginal[i] < minimo) {
        minimo = arrayOriginal[i];
      }

      if(arrayOriginal[i] > maximo){
        maximo = arrayOriginal[i];
      }
    }

    //Mostramos
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.print(arrayOriginal[i]+" ");
    }
    System.out.println("");
    System.out.println("\nEl número máximo es el "+maximo);
    System.out.println("El número mínimo es el "+minimo);

    //Pedimos por pantalla que queremos que se muestre
    System.out.println("\n¿Qué desea destacar? (1 - mínimo, 2 - máximo): ");
    int decision = teclado.nextInt();
    System.out.println("");
    
    switch (decision) {
      case 1:

        for (int i = 0; i < arrayOriginal.length; i++) {
          
          if (arrayOriginal[i]==minimo) {
            System.out.printf("**%d** ", minimo);
            i++;
          }
          System.out.print(arrayOriginal[i]+" ");
        }
        break;

      case 2:

        for (int i = 0; i < arrayOriginal.length; i++) {
          
          if (arrayOriginal[i]==maximo) {
            System.out.printf("**%d** ", maximo);
            i++;
          }
          System.out.print(arrayOriginal[i]+" ");
        }
          break;
    }
    teclado.close();
  }
}
