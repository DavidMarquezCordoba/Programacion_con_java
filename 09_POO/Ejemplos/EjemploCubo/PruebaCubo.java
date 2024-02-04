package EjemploCubo;
/**
 * Explica tu código aquí
 * 
 * @author David Márquez Córdoba
 */

public class PruebaCubo {
  public static void main(String[] args) {

    Cubo cubo = new Cubo (10);
    Cubo cuboDestino = new Cubo (8);

    cubo.setContenido(6);
    cuboDestino.setContenido(1);

    cubo.pinta();
    System.out.println("");
    cuboDestino.pinta();
    System.out.println("");

    cubo.vuelcaEn(cuboDestino);

    cubo.pinta();
    System.out.println("");
    cuboDestino.pinta();
  }
}
