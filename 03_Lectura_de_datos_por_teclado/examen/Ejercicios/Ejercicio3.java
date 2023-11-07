import java.util.Scanner;

/**
 * V = (1/3)πh(R2 + r2 + Rr)
 * 
 * @author David Márquez Córdoba
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    
    double altura;
    double baseMayor;
    double baseMenor;
    double volumen;
    final double PI = Math.PI;
    

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("\033[1m"+"VOLUMEN DE UN TRONCO DE CONO"+"\033[0m");
    System.out.println("=====================");
    System.out.printf("Introduzca el radio de la base mayor R (cm): ");
    baseMayor = teclado.nextDouble();
    System.out.printf("Introduzca el radio de la base menor r (cm): ");
    baseMenor = teclado.nextDouble();
    System.out.printf("Introduzca la altura h (cm): ");
    altura = teclado.nextDouble();

    //Lógica

    double rMayorCuadrado = Math.pow(baseMayor, 2);
    double rMenorCuadrado = Math.pow(baseMenor, 2);

    volumen = (PI*altura)/3 *(rMayorCuadrado+rMenorCuadrado+ (baseMayor*baseMenor));

    System.out.printf("El volumen del toroide es de \033[0;31m%.4f", volumen);

    
    teclado.close();
  }
}
