/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 pi r2h
 * 
 * @author David Márquez Córdoba
 */

import java.util.*;


public class T03Ejercicio09 {
  public static void main(String[] args) {
    double radio;
    double altura;
    final double PI = Math.PI;
    double radioAlCubo;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("+-------------------------------------------+");
    System.out.println("|        CALCULAR VOLUMEN DE UN CONO        |");
    System.out.println("+-------------------------------------------+");
    System.out.println("");
    System.out.printf("Escriba el radio de su cono (m): ");
    
    radio = teclado.nextDouble();
    
    
    System.out.println("");
    System.out.printf("Escriba la altura de su cono (m): ");

    altura = teclado.nextDouble();

    teclado.close();

    //LOGICA

    radioAlCubo = Math.pow(radio, 2);
    double volumen = (PI*radioAlCubo*altura)/3;

    System.out.println("");
    System.out.printf("Resultado es %.2f m3", volumen);
    System.out.println("");
    System.out.println("");
  }
}
