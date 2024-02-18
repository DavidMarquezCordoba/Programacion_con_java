package EjemplosArrayList;

import java.util.ArrayList;

/**
 * ArrayList 01
 * 
 * @author David Márquez Córdoba
 */

public class ArrayList01 {

  public static void main(String[] args) {
    
    //Se crea un ArrayList con la siguiente sintaxis
    ArrayList <String> a = new ArrayList<String>();

    //Llamamos al método .size para averiguar el tamaño que tenemos actualmente en el ArrayList
    System.out.println("Nº Elementos: " + a.size());    //De momento será 0

    //Con el método .add añadiremos a la última posición los siguientes valores.
    a.add("Rojo");
    a.add("Azul");
    a.add("Amarillo");

    //Volvemos a llamar al método y ahora nos mostrará que el Array tiene un tamaño de 3
    System.out.println("Nº Elementos: " + a.size());

    //Añadimos uno más
    a.add("blanco");

    //Y Como vemos aumenta
    System.out.println("Nº de elementos: " + a.size());
    
    System.out.println("");
    System.out.println("Si usamos el .get del array y escribimos la posición, nos devolverá el valor de dicha posición");
    System.out.println("El elemento que hay en la posición 0 es " + a.get(0));
    System.out.println("El elemento que hay en la posición 3 es " + a.get(3));
  }
}
