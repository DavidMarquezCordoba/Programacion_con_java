package AOT09Ejercicio01;
/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
todos los gatos utilizando también un bucle.
 * 
 * @author David Márquez Córdoba
 */
public class AppGatos {

  public static void main(String[] args) {
    
    String nombre;
    String color;
    String raza;

    Gato[] g = new Gato[4];

    System.out.println("\nAÑADIR NUEVO GATO");
    System.out.println("==================");

    for (int i = 0; i < g.length; i++) {
      
      System.out.println("\nGato " + (i+1));
      System.out.print("Nombre: ");
      nombre = System.console().readLine();
      System.out.print("Color: ");
      color = System.console().readLine();
      System.out.print("Raza: ");
      raza = System.console().readLine();

      g[i]= new Gato(nombre, color, raza);
    }

    System.out.println("\nTODOS LOS GATOS CREADOS");
    System.out.println("========================");
    ////MOSTRAMOS POR PANTALLA
    for (int i = 0; i < g.length; i++) {

      System.out.println("\nGato " + (i+1));
      System.out.println(g[i]);
    }
  }
}
