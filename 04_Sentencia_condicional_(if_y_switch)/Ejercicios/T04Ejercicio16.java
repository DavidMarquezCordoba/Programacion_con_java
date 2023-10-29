/*
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. A continuación
se listan las preguntas del test.
1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el interés que mostraba anteriormente por ti
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
arregla el pelo y se asea con más frecuencia (si es mujer)
5. No te deja que mires la agenda de su teléfono móvil
6. A veces tiene llamadas que dice no querer contestar cuando estás tú
delante
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
8. Muchos días viene tarde después de trabajar porque dice tener mucho
más trabajo
9. Has notado que últimamente se perfuma más
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
A continuación se muestran los mensajes que deberá dar el programa según
la puntuación obtenida.
• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
fiel.
• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
vida o en su mente, aunque seguramente será algo sin importancia. No
bajes la guardia.
• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
viviendo un romance con otra persona. Te aconsejamos que indagues un
poco más y averigües que es lo que está pasando por su cabeza.

 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio16 {
  public static void main(String[] args) {
    
    int bote = 0;

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

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("+------------------------------------------------------------------+");
    System.out.println("|              BIENVENID@S AL CONSULTORIO DEL AMOR                 |");
    System.out.println("|              -----------------------------------                 |");
    System.out.println("+------------------------------------------------------------------+");
    System.out.println("");
    System.out.println("           Responde con sinceridad, estoy para ayudarte             ");
    System.out.println("");
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente (true/false): ");
    respuesta1 = teclado.nextBoolean();
    System.out.print("2. Ha aumentado sus gastos de vestuario (true/false): ");
    respuesta2 = teclado.nextBoolean();
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti (true/false): ");
    respuesta3 = teclado.nextBoolean();
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) (true/false):  ");
    respuesta4 = teclado.nextBoolean();
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil (true/false):  ");
    respuesta5 = teclado.nextBoolean();
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante (true/false):  ");
    respuesta6 = teclado.nextBoolean();
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a (true/false):  ");
    respuesta7 = teclado.nextBoolean();
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo (true/false):  ");
    respuesta8 = teclado.nextBoolean();
    System.out.print("9. Has notado que últimamente se perfuma más (true/false):  ");
    respuesta9 = teclado.nextBoolean();
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo (true/false):  ");
    respuesta10 = teclado.nextBoolean();


    teclado.close();

    if (respuesta1) {
      bote += 3;
    }

    if (respuesta2) {
      bote += 3;
    }

    if (respuesta3) {
      bote += 3;
    }

    if (respuesta4) {
      bote += 3;
    }

    if (respuesta5) {
      bote += 3;
    }

    if (respuesta6) {
      bote += 3;
    }

    if (respuesta7) {
      bote += 3;
    }

    if (respuesta8) {
      bote += 3;
    }

    if (respuesta9) {
      bote += 3;
    }

    if (respuesta10) {
      bote += 3;
    }

System.out.println("");
System.out.println("                          Veredicto");
System.out.println("-----------------------------------------------------------------");
System.out.println("");


if (bote >= 0 && bote <=10) {
  System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
  System.out.println("");
}

if (bote >= 11 && bote <=22) {
  System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,");
  System.out.println("aunque seguramente será algo sin importancia. No bajes la guardia.");
  System.out.println("");
}

if (bote >= 23 && bote <=30) {
  System.out.println("Tu pareja tiene todos los ingredientes para estar");
  System.out.println("viviendo un romance con otra persona. Te aconsejamos que indagues un");
  System.out.println("poco más y averigües que es lo que está pasando por su cabeza.");
  System.out.println("");
}

  }
}
