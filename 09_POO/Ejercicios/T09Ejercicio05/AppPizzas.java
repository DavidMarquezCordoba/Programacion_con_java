package T09Ejercicio05;
/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
siguiente código del programa principal debe dar la salida que se muestra:
 * 
 * @author David Márquez Córdoba
 */

public class AppPizzas {
  public static void main(String[] args) {

    Pizza p1 = new Pizza("Carbonara", "Grande");
    Pizza p2 = new Pizza("4 Quesos", "pequeña");

    p2.sirve();

    Pizza p3 = new Pizza("Margarita", "mediana");

    System.out.println("");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println("");
    
    p2.sirve();
    
    System.out.println("pedidas: " + Pizza.getTotalPedidas());
    System.out.println("servidas: " + Pizza.getTotalServidas());
  }
}
