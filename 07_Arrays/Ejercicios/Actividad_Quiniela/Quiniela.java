package Actividad_Quiniela;

/**
 * Juego de la Quiniela
 * 
 * Escribe un programa que muestre tres apuestas aleatorias de la quiniela 
 * en tres columnas para los 14 partidos y el Pleno al 15. 
 * A diferencia del resto de partidos, donde pronosticas el equipo ganador 
 * a través del clásico 1X2, en el Pleno al 15 se indica el número de goles 
 * que marcará cada equipo. Es decir, se mostrará 0, 1, 2 o M (más de 2 goles). (1,5 puntos)
 * 
 * 
 * De manera simultánea, para cada partido (cada fila) se generará 
 * de forma aleatoria un resultado (1, X o 2, y el pleno al 15), que deberás mostrar. (1 punto).
 * 
 * 
 * Muestra el número de aciertos de cada apuesta (columna) (0.5 puntos), y si el número de 
 * aciertos es mayor o igual a 10, muestra un mensaje de que ha sido preimado. (0.5 puntos).
 * 
 * @author David Márquez Córdoba
 */

public class Quiniela {

  public static void main(String[] args) {
    
    //Apuesta aleatoria
    System.out.println("\nApuestas aleatorias");
    System.out.println("=====================\n");

    //Declaramos quiniela
    int [][] quiniela = new int[14][3];
    int [][] resultado = new int[14][1];

    int plenoQuinceLocal;

    int plenoQuinceVisitante;
    String resultadoLocal = " ";
    String resultadoVisitante = " ";
    int boteAciertos = 0;

    ///Variables con el resultado final
    int plenoQuinceLocalResultado;
    int plenoQuinceVisitanteResultado;
    String resultadoLocalFinal = " ";
    String resultadoVisitanteFinal = " ";


    //Inicializamos cada posición con un resultado (0-1-2)
    for (int i = 0; i < quiniela.length; i++) {
      for (int j = 0; j < quiniela[0].length; j++) {
        quiniela[i][j] = (int)(Math.random()*3);
      }
    }

    //Creamos el resultado final//////////////////
    for (int i = 0; i < resultado.length; i++) {
      for (int j = 0; j < resultado[0].length; j++) {
        resultado[i][j] = (int)(Math.random()*3);
      }
    }
    /////////////////////////////////////////////

    //Tomo como 1 = 1 ; X = 0 ; 2 = 2;

    //Mostramos
    for (int i = 0; i < quiniela.length; i++) {

      System.out.printf("%2d.", (i+1));
      System.out.printf("%2s", "|");
      
      for (int j = 0; j < quiniela[0].length; j++) {
        
        if (quiniela[i][j] == 1) {

          System.out.printf("%-3d%s", quiniela[i][j],"|");

        } else if (quiniela[i][j] == 2){

          System.out.printf("  %d%s",quiniela[i][j], "|");

        } else if (quiniela[i][j] == 0){

          System.out.printf(" %s %s","x", "|");
        }
      }
      System.out.println("");
    }

    System.out.printf("----------------+");

    //Nuevos aleatorios para el pleno al quince para el Local y para el visitante
    plenoQuinceLocal = (int)(Math.random()*4);
    plenoQuinceVisitante = (int)(Math.random()*4);

    if (plenoQuinceLocal==0) {
      resultadoLocal = "0";
    } else if (plenoQuinceLocal == 1){
      resultadoLocal = "1";
    } else if (plenoQuinceLocal == 2) {
      resultadoLocal = "2";
    } else if (plenoQuinceLocal == 3) {
      resultadoLocal = "M";
    }

    if (plenoQuinceVisitante == 0) {
      resultadoVisitante = "0";
    } else if (plenoQuinceVisitante == 1){
      resultadoVisitante = "1";
    } else if (plenoQuinceVisitante == 2) {
      resultadoVisitante = "2";
    } else if (plenoQuinceVisitante == 3) {
      resultadoVisitante = "M";
    }
    System.out.printf("\n15. | Local %s - Visitante %s ", resultadoLocal, resultadoVisitante);

    System.out.println("\n\nRESULTADO");
    System.out.println("==========\n");

    for (int i = 0; i < resultado.length; i++) {

      System.out.printf("%2d.", (i+1));
      System.out.printf("%2s", "|");
      
      for (int j = 0; j < resultado[0].length; j++) {
        
        if (resultado[i][j] == 1) {

          System.out.printf("%-3d%s", resultado[i][j],"|");

        } else if (resultado[i][j] == 2){

          System.out.printf("  %d%s",resultado[i][j], "|");

        } else if (resultado[i][j] == 0){

          System.out.printf(" %s %s","x", "|");
        }
      }
      System.out.println("");
    }
    //Nuevos aleatorios para el pleno al quince para el Local y para el visitante
    plenoQuinceLocalResultado = (int)(Math.random()*4);
    plenoQuinceVisitanteResultado = (int)(Math.random()*4);

    if (plenoQuinceLocalResultado==0) {
      resultadoLocalFinal = "0";
    } else if (plenoQuinceLocalResultado == 1){
      resultadoLocalFinal = "1";
    } else if (plenoQuinceLocalResultado == 2) {
      resultadoLocalFinal = "2";
    } else if (plenoQuinceLocalResultado == 3) {
      resultadoLocalFinal = "M";
    }

    if (plenoQuinceVisitanteResultado == 0) {
      resultadoVisitanteFinal = "0";
    } else if (plenoQuinceVisitanteResultado == 1){
      resultadoVisitanteFinal = "1";
    } else if (plenoQuinceVisitanteResultado == 2) {
      resultadoVisitanteFinal = "2";
    } else if (plenoQuinceVisitanteResultado == 3) {
      resultadoVisitanteFinal = "M";
    }
    System.out.print("---------");
    System.out.printf("\n15. | Local %s - Visitante %s \n\n", resultadoLocalFinal, resultadoVisitanteFinal);

    //Recorremos cada apuesta comparándolo con el array resultado para acumular aciertos
    // Empezaremos recorriendo cada columna(apuesta)
    for (int apuesta = 0; apuesta < quiniela[0].length; apuesta++) {
      for (int i = 0; i < quiniela.length; i++) {
          if (quiniela[i][apuesta] == resultado[i][0]) {
              boteAciertos++;
          }
      }

      System.out.println("Aciertos apuesta " + (apuesta + 1) + ": " + boteAciertos);

      if (boteAciertos==14) {
        if (resultadoLocal.equals(resultadoLocalFinal) && resultadoVisitante.equals(resultadoVisitanteFinal)) {
          System.out.println("\t *********ENHORABUENA, HA GANADO EL PREMIO+PLENO!!!!**********");
        }
      }
      if (boteAciertos>=10) {
        System.out.println("\t ENHORABUENA, HA GANADO EL PREMIO!!!! (sin el pleno)");
        break;
      }
      boteAciertos = 0; // Reiniciamos el contador de aciertos para la siguiente apuesta
    }
  }
}
