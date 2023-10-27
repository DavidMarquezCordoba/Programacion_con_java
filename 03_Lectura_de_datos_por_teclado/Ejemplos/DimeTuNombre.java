/**
 * Explica tu código aquí
 * 
 * @author Sergio Sánchez
 */


public class DimeTuNombre {
  public static void main(String[] args) {
    
    String nombre;

    System.out.println("");
    System.out.printf("Dime tu nombre: ");
    nombre = System.console().readLine();

    System.out.println("Hola "+ nombre+ " encantado de conocerte.");
    System.out.println("");
  }
}
