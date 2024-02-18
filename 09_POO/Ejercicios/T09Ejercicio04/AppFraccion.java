package T09Ejercicio04;
/**
 * 4. Crea la clase Fracción. Los atributos serán numerador y
 * denominador. Y algunos de los métodos pueden ser invierte,
 * simplifica, multiplica, divide, etc.
 * 
 * @author David Márquez Córdoba
 */
public class AppFraccion {
  public static void main(String[] args) {
    
    Fraccion f1 = new Fraccion(10, 2);

    System.out.println(f1 + " x 5 = " + f1.multiplica(5));
    System.out.println(f1 + " ^-1 = " + f1.invierte(5));
    System.out.println(f1 + " / 2 = " + f1.divide(2));



  }
}
