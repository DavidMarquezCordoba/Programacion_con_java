import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Sergio Sánchez
 */
public class SentenciaIF04 {
  public static void main(String[] args) {
    
    int nota;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Que nota has sacado en el último examen?: ");
    nota = teclado.nextInt();

    if (nota >= 5) {
      System.out.println("Enhorabuena, has aprobado");
    } else {
      System.out.println("Has suspendido");
    }
  }
}
