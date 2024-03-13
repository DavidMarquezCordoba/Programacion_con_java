package T10Ejercicio11;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
del ejercicio anterior. El programa irá pidiendo que el usuario teclee
la traducción al inglés de cada una de las palabras y comprobará si son
correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
y cuántas erróneas.
 * 
 * @author David Márquez Córdoba
 */
public class T10Ejercicio11 {
  public static void main(String[] args) {

    //SERIAS DUDAS//

    HashMap<String, String> diccionario = new HashMap<String, String>();

    int puntos = 0;

    int siguienteNumAleatorio;

    String respuestaUsuario;

    /**
     * Creamos el diccionario ingles-español
     */
    diccionario.put("gato", "cat");
    diccionario.put("perro", "dog");
    diccionario.put("casa", "house");
    diccionario.put("árbol", "tree");
    diccionario.put("coche", "car");
    diccionario.put("libro", "book");
    diccionario.put("silla", "chair");
    diccionario.put("mesa", "table");
    diccionario.put("sol", "sun");
    diccionario.put("luna", "moon");
    diccionario.put("agua", "water");
    diccionario.put("fuego", "fire");
    diccionario.put("comida", "food");
    diccionario.put("amigo", "friend");
    diccionario.put("familia", "family");
    diccionario.put("amor", "love");
    diccionario.put("tiempo", "time");
    diccionario.put("dinero", "money");
    diccionario.put("escuela", "school");
    diccionario.put("ordenador", "computer");
    /**
     * 
     */

    //Se crea un array de claves, mediante keySet para englobarlos a todos y toArray para almacenarlos
    String [] arrayClaves = diccionario.keySet().toArray(new String[0]);
    
    //Generamos una lista que almacenaremos los números que no se repiten & Creamos la primera
    ArrayList<Integer> listaNumerosAleatorios = new ArrayList<Integer>();

    //La primera
    listaNumerosAleatorios.add((int)(Math.random()*20));

    //Recorremos 4 veces más y almacenamos en una posición un número aleatorio
    for (int i = 0; i < 4; i++) {
      do {
        siguienteNumAleatorio = (int)(Math.random()*20);
      } while (listaNumerosAleatorios.contains(siguienteNumAleatorio));
      listaNumerosAleatorios.add(siguienteNumAleatorio);
    }

    System.out.println("\nActualmente tiene "+ puntos + " puntos.");
    System.out.println("Por cada pregunta respondida correctamente, se sumará un punto\n");
    System.out.println("A continuación saldrán preguntas aleatorias y deberá responder que significan en español\n");

    for (int i = 0; i < 5; i++) {
      //Itera posiciones de la lista de numeros aleatorios que ya contiene un número aleatorio e indica la posición de la clave en el arrayClaves
      System.out.print(arrayClaves[listaNumerosAleatorios.get(i)] + ": ");
      respuestaUsuario = System.console().readLine();


      if (respuestaUsuario.equals(diccionario.get(arrayClaves[listaNumerosAleatorios.get(i)]))) {
        puntos++;
        System.out.println("CORRECTO! siguiente pregunta\n");
      } else {
        System.out.println("La respuesta correcta era " + diccionario.get(arrayClaves[listaNumerosAleatorios.get(i)])+"\n");
      }
    }
    System.out.println("____________________________________________________");
    System.out.println("Examen finalizado, usted tiene " + puntos+ " puntos.\n");
  }
}
