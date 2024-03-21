package T10Ejercicio16;

import java.util.HashMap;

/**
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer
la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
principio, el programa solo conoce las capitales de España, Portugal y Francia.
Estos datos deberán estar almacenados en un diccionario. Los datos sobre
capitales que vaya aprendiendo el programa se deben almacenar en el mismo
diccionario. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * @author David Márquez Córdoba
 */

public class T10Ejercicio16 {
  public static void main(String[] args) {
    
    HashMap<String, String> mapPaises = new HashMap<String, String>();

    mapPaises.put("España", "Madrid");
    mapPaises.put("Portugal", "Lisboa");
    mapPaises.put("Francia", "París");

    String pais;
    String capital;

    boolean salir = false;

    do {
      System.out.print("\nEscribe el nombre de un país y te diré su capital: ");
      pais = System.console().readLine();
  
      if (pais.equalsIgnoreCase("salir")) {
        salir = true;
      } else {
        if (mapPaises.containsKey(pais)) {
          System.out.print("\nLa capital de " + pais+ " es " + mapPaises.get(pais)+"\n\n");
        } else {
          System.out.print("\nNo conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
          capital = System.console().readLine();
    
          mapPaises.put(pais, capital);
          System.out.println("\nGracias por enseñarme nuevas capitales");
        }        
      }
    } while (!salir);
  }
}
