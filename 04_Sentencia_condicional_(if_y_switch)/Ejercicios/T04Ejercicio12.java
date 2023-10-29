/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio12 {
  public static void main(String[] args) {
    
    boolean respuesta1;
    boolean respuesta2;
    boolean respuesta3;
    boolean respuesta4;
    boolean respuesta5;
    boolean respuesta6;
    boolean respuesta7;
    boolean respuesta8;
    boolean respuesta9;
    boolean respuesta10;

    int bote = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("+-----------------------------------------------------------+");
    System.out.println("|        BIENVENIDOS/AS/ES AL QUIZ DE ALAN TURING           |");
    System.out.println("+-----------------------------------------------------------+");

    System.out.println("Responde correctamente a las preguntas. A ver cuánto sabes");
    System.out.println("");

    System.out.println("Valoración");
    System.out.println("----------");
    System.out.println("Respuesta Correcta: 1 pto");
    System.out.println("Respuesta Incorrecta: 0 pto");
    System.out.println("Total: 10 preguntas");
    System.out.println("Responde con TRUE / FALSE para V o F");
    System.out.println("");

    System.out.println("Suerte. La necesitarás :) ");
    System.out.println("");


    System.out.println("      ************* C O M E N Z A M O S *************");
    System.out.println("");


    System.out.printf("1. Las variables de tipo Verdadero-Falso se declaran con \" %s \" (T/F): ", "boolean");
    respuesta1 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta1) {

      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote = 0+1;
      System.out.println("");

    } else {
      System.out.println("Respuesta incorrecta. Las variables de V/F siempre son booleanas");
      System.out.println("");
    }

    System.out.printf("2. Actualmente se usa el estándar HTML 5 (T/F): ");
    respuesta2 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta2) {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");

    } else {
      System.out.println("Respuesta incorrecta. El estándar actual es Html5");
      System.out.println("");
    }

    System.out.printf("3. Java es un lenguaje de nivel supremo (T/F): ");
    respuesta3 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta3) {
      System.out.println("Respuesta incorrecta. Java es un lenguaje de ALTO nivel");
      System.out.println("");
    } else {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    }

    System.out.printf("4. Un bytecode es un error al compilar que debe ser revisado (T/F): ");
    respuesta4 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta4) {
      System.out.println("Respuesta incorrecta. Bytecode es un fichero .class, es  un lenguaje intermediario");
      System.out.println("entre el lenguaje que entienda el ordenador y el humano. Y no, no es un error. ");
      System.out.println("Es un fichero necesario para poder compilar nuestro código fuente.");
      System.out.println("");
    } else {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    }

    System.out.printf("5. Las instancias de un objeto se pueden llamar como el programador quiera (T/F): ");
    respuesta5 = teclado.nextBoolean();

    if (respuesta5) {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    } else {
      System.out.println("Respuesta incorrecta. El programador puede elegir el nombre que considere oportuno");
      System.out.println("");
    }

    System.out.printf("6. Para poner un párrafo en negrita en HTML se usa <bold> (T/F): ");
    respuesta6 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta6) {
      System.out.println("Respuesta incorrecta. Se usa la etiqueta <strong>");
      System.out.println("");
    } else {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    }

    System.out.printf("7. Es obligatorio cerrar la instancia Scanner al finalizar el programa (T/F): ");
    respuesta7 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta7) {
      System.out.println("Respuesta incorrecta. Es recomendable, pero no obligatorio");
      System.out.println("");
    } else {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    }

    System.out.printf("8. En programación && significa \"O\" y || significa \"Y\" (T/F): ");
    respuesta8 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta8) {
      System.out.println("Respuesta incorrecta. Es justo al revés");
      System.out.println("");
    } else {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    }

    System.out.printf("9. ¿Es imprescindible la llave de apertura y cierre \"{}\" en sentencias IF cuando solo tiene una línea de comandos? (T/F): ");
    respuesta9 = teclado.nextBoolean();
    System.out.println("");

    if (respuesta9) {
      System.out.println("Respuesta incorrecta. No es necesario cuando solo es una sola línea, aunque es recomendable.");
      System.out.println("");
      System.out.println("");
    } else {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    }

    System.out.printf("10. En java se utiliza el método equals() para comparar si el valor de 2 Strings son iguales (T/F): ");
    respuesta10 = teclado.nextBoolean();

    if (respuesta10) {
      System.out.println("Respuesta Correcta! Has ganado 1 pto");
      bote += 1;
      System.out.println("");
    } else {
      System.out.println("Respuesta incorrecta. Es necesario usar el método equals()");
      System.out.println("");
    }

    teclado.close();

    //CONCLUSIONES

    if (bote>=5) {
      System.out.println("Enhorabuena! vas por buen camino");
      System.out.printf("Has sacado %d puntos \n", bote);
      System.out.println("");
    } else {
      System.out.println("Debes estudiar más");
      System.out.printf("Has sacado %d puntos \n", bote);
      System.out.println("");
    }
  }
}
