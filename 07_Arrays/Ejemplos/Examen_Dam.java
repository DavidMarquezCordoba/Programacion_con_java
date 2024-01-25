/**
 * Simula el juego del “Tres o más” para dos jugadores. Necesitamos 5 dados de 6 caras. El objetivo
del juego es sacar tres dados iguales o más en una tirada. 3 dados iguales puntúan con 3 puntos, 4
dados iguales con 6 puntos y 5 dados iguales con 12 puntos. Si nos salen dos dados iguales no
puntuamos pero ganamos el derecho de volver a tirar.
Quién gana: Se establecen 10 rondas y se van anotando las puntuaciones. Quien más puntos tenga al
final gana.

 * 
 * @author David Márquez Córdoba
 */

public class Examen_Dam {
  public static void main(String[] args) {
    
    int [][] tirada = new int [5][6];

    //10 rondas
    int rondas;

    //Bote de cada uno
    int bote1;
    int bote2;

    int tiradas;

    for (int dados = 0; dados < tirada.length; dados++) {
      for (int caras = 0; caras < tirada[0].length; caras++) {
        tirada[dados][caras]=caras+1;
      }
    }

    //Mostramos
    // for (int i = 0; i < tirada.length; i++) {
    //   for (int j = 0; j < tirada[0].length; j++) {
    //     System.out.println(tirada[i][j]);
    //   }
    //   System.out.println();
    // }


    System.out.println("\nTRES O MÁS");
    System.out.println("***********");

    for (int i = 0; i < tirada.length; i++) {
      for (int j = 0; j < tirada[0].length; j++) {
        tiradas = (int)(Math.random()*6 + 1);
      }
    }
  }
}
