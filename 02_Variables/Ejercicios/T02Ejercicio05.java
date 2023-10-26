/*
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
 * 
 * @author David Márquez Córdoba
 */

public class T02Ejercicio05 {
  public static void main(String[] args) {
    
    int pesetas = 1000;
    final double VALOR_EN_EUROS = 166.386;

    System.out.println(pesetas + " ptas son actualmente: "+ (double)pesetas / VALOR_EN_EUROS + " €.");

    //Salida Formateada

    System.out.printf(pesetas+ " ptas son actualmente: %.2f €.", (double)pesetas / VALOR_EN_EUROS);
  }
}
