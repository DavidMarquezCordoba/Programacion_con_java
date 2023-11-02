/*
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio25 {
  public static void main(String[] args) {
    
    double altura;
    double anchura;
    double tamanhoBandera = 0;
    double precioBandera = 0;
    String bordado;
    double precioBordado = 0;
    double total = 0;

    final double GASTOS_ENVIO = 3.25;
    // final double BORDADO = 2.50;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("Introduzca la altura de la bandera en cm: ");
    altura = teclado.nextDouble();

    if (altura > 0) {
      System.out.println("");
      System.out.printf("Ahora introduzca la anchura: ");
      anchura = teclado.nextDouble();

      if (anchura >0) {
        System.out.println("");
        System.out.print("¿Quiere bordado? (s/n): ");
        bordado = teclado.next();

        if (bordado.equals("s") || bordado.equals("n")){
          System.out.println("Gracias, vamos a desglosar su compra: ");
          System.out.println("");
          
          tamanhoBandera = altura * anchura;
          precioBandera= tamanhoBandera * 0.01;

          System.out.printf("Bandera de %.2f cm2: %7.2f\n", tamanhoBandera, precioBandera);

          if (bordado.equals("s")) {
            precioBordado = 2.50;
            System.out.printf("Con escudo:            %7.2f\n", precioBordado);
          } else{
            System.out.printf("Sin escudo:            %7.2f\n", precioBordado);
          }
          
          System.out.printf("Gastos de envío:       %7.2f\n", GASTOS_ENVIO);
          total = precioBandera + precioBordado + GASTOS_ENVIO;
          System.out.printf("Total:                 %7.2f Euros\n", total);
          System.out.println("");
        } else {
          System.out.println("Opción no válida");
        }

      } else {
        System.out.println("Introduce una anchura válida");
      }
    } else {
      System.out.println("Introduce una altura válida");
    }
    teclado.close();
  }
}
