/*
 * Sentencia If
 * El usuario debe responder a la pregunta
que le hace el ordenador.
 * 
 * @author David Márquez Córdoba
 */


import java.util.Scanner;

public class SentenciaIf01 {
  public static void main(String[] args) {
    
    String capitalEspana = "Madrid";
    String respuestaUsuario;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("¿Cuál es la capital de España?: ");
    respuestaUsuario = teclado.nextLine();
    System.out.println("");

    teclado.close();

    if (respuestaUsuario.equals(capitalEspana)) {
      System.out.println("Correcto, sabes mucho.");
      System.out.println("");
    } else {
      System.out.println("Inténtelo de nuevo :-(");
      System.out.println("");
    }
  }
}
