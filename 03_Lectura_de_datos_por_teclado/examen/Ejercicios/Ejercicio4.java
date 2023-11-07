import java.util.Scanner;

/**
 * Calculadora de tiempo
 * 
 * @author David Márquez Córdoba
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    

    int cantidadDias;
    int anos = 3;
    int meses = 0;
    int dias = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("\033[1m CALCULADORA DE TIEMPO \033[0m \n");
    System.out.println("=====================");
    System.out.printf("Introduce una cantidad de días: ");
    cantidadDias = teclado.nextInt();

    //Logica

    anos = dias/365;

    System.out.printf("%d días son  \033[41m %.0f años \033[0m, \033[43m %d meses \033[0m, \033[42m %d dias", cantidadDias, anos, meses, dias);


    teclado.close();
  }
}
