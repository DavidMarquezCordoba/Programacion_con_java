package AOT09Ejercicio02;
/**
 * Cambia el programa anterior de tal forma que los datos de los gatos se
introduzcan directamente en el código de la forma gatito[2].setColor("marrón") o
bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja",
"macho"). Muestra a continuación los datos de todos los gatos utilizando un bucle.
 * 
 * @author David Márquez Córdoba
 */
public class AppGato {
  public static void main(String[] args) {
    
    Gato [] gatito = new Gato[4];

    for (int i = 0; i < gatito.length; i++) {
      gatito[i] = new Gato();
    }


    for (int i = 0; i < gatito.length; i++) {
      System.out.println("\nGato"+ (i+1));
      System.out.println("------");
      System.out.print("Nombre: ");
      String nombre = System.console().readLine();
      gatito[i].setNombre(nombre);

      System.out.print("Raza: ");
      String raza = System.console().readLine();
      gatito[i].setRaza(raza);

      System.out.print("Color: ");
      String color = System.console().readLine();
      gatito[i].setColor(color);

    }

    System.out.println("");
    for (int i = 0; i < gatito.length; i++) {
      System.out.println("\nGato "+ (i+1));
      System.out.println(gatito[i]);
    }
  }
}
