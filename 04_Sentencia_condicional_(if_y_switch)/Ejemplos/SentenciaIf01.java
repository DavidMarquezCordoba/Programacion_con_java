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
    

    //Método 1 

    System.out.println("Método 1");
    System.out.println("--------");

    String capitalEspana = "Madrid";
    String respuestaUsuario;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("¿Cuál es la capital de España?: ");
    respuestaUsuario = teclado.nextLine();
    System.out.println("");

    teclado.close();

    //Comparación de cadenas de texto con el método .equals
    if (respuestaUsuario.equals(capitalEspana)) {
      System.out.println("Correcto, sabes mucho.");
      System.out.println("");
    } else {
      System.out.println("Inténtelo de nuevo :-(");
      System.out.println("");
    }


  //Método 2
    // System.out.println("Método 2");
    // System.out.println("--------");

    // // System.console().readLine(); es el equivalente a Scanner, pero sin crear la instancia Scanner
    // System.out.printf("¿Cuál es la capital de España?: ");
    // String respuesta = System.console().readLine();

    // if (respuesta.equals("Madrid")) {
    //     System.out.println("Correcto, sabes mucho.");
    //     System.out.println("");
    // } else {
    //     System.out.println("Inténtelo de nuevo :-(");
    //     System.out.println("");
    // }


  }
}


//DUDAS:
//Por qué funcionan por separado pero no juntas?