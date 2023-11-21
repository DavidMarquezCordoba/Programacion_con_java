import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author David Márquez Córdoba
 */
public class T05Ejercicio20 {
  public static void main(String[] args) {

    String caracter;
    int altura;
    int nivel= 1; //Esta variable controla que nivel estoy pintando, siendo 1 la cúspide.

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce el caracter de relleno: ");
    caracter = teclado.nextLine();

    System.out.printf("Introduce la altura deseada: ");
    altura = teclado.nextInt();

    int espaciosPorDelante = altura -1;
    int espaciosPorDentro = 0;
    int basePiramide = altura * 2;

    //Controlamos que mientras el nivel sea inferior a la altura introducida por teclado, continuamos pintando
    while (nivel<altura) {

      //Pintamos espacios por delante
      for (int i = 0; i < espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      //Pintamos el caracter correspondiente
      System.out.print(caracter);

      //Pintamos huecos por dentro
      for (int i = 0; i < espaciosPorDentro; i++) {
        System.out.print(" ");
      }

      //pintamos el segundo caracter (excepto el primer nivel)
      if (nivel >1) {
        System.out.print(caracter);
      }

      System.out.println("");
      //Aumentamos y reducimos valores para seguir dibujando
      nivel++;                //Aumentamos niveles o pisos de la pirámide
      espaciosPorDelante--;   //Reducimos 1 espacio en cada nivel
      espaciosPorDentro+=2;   //En cada nivel o piso van aumentando 2 espacios en blanco más

    }

    //Pintamos la base
    for (int i = 0; i < basePiramide; i++) {
      System.out.print(caracter);
    }
    
    // System.out.println(""); //Saltamos al siguiente renglón

    teclado.close();
  }
}
