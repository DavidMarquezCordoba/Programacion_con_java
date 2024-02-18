package EjemplosArrayList;

import java.util.ArrayList;

/**
 * ArrayList 06 -> Uso de .set
 * 
 *  .set -> machaca el valor antiguo por el nuevo, 
 * pasándole por parámetro la posición y el nuevo valor
 * 
 * @author David Márquez Córdoba
 */
public class ArrayList06 {
  public static void main(String[] args) {

    //Definimos
    ArrayList<String> a = new ArrayList<String>();

    //Añadimos valores
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("\nContenido del vector: ");

    System.out.println(a);

    //machacamos la posición 2 con el valor -> azul por "turquesa" 
    a.set(2, "turquesa");

    System.out.println("\nContenido del vector después de machacar la posición 2: ");

    System.out.println(a);
  }
}
