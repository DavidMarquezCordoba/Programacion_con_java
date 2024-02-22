import java.util.HashMap;

public class Hashmap02 {

  public static void main(String[] args) {
    
    HashMap<Integer, String> m = new HashMap<>();

    int clave;

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");
    
    System.out.println("Uso de otros métodos");
    System.out.println("Uso de keySet "+ m.keySet());
    System.out.println("Uso de values "+ m.values());
    System.out.print("Introduce la clave: ");
    clave = Integer.parseInt(System.console().readLine());
    System.out.print("SU VALOR ES : " + m.get(clave));
  }
}
