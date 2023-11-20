/*
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio27 {
  public static void main(String[] args) {
    
    String sabor;
    String tipoChocolate;
    String nata;
    String nombre;
    // String blancoNegro;
    double precioTarta = 0;
    double precioNata = 0 ;
    double precioNombre = 0;
    double total = 0;

    //Booleans
    boolean ticketManzana = false;
    boolean ticketFresa = false;
    boolean ticketChocoBlanco = false;
    boolean ticketChocoNegro = false;
    boolean ticketNata = false;
    boolean ticketNombre = false;

    //Manzana = 18 € Fresa= 16
    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("Elija un sabor (manzana, fresa o chocolate): ");
    sabor = teclado.nextLine();

    if (sabor.equals("manzana") || sabor.equals("fresa")|| sabor.equals("chocolate")) {
      
      if (sabor.equals("manzana")) {
        precioTarta = 18;
        ticketManzana = true;

      } else if (sabor.equals("fresa")){
        precioTarta = 16;
        ticketFresa = true;

      } else if (sabor.equals("chocolate")){

          System.out.printf("¿Qué tipo de chocolate quiere? (negro o blanco): ");
          tipoChocolate = teclado.nextLine();

          if (tipoChocolate.equals("blanco") || tipoChocolate.equals("negro")) {

            if (tipoChocolate.equals("blanco")) {
              precioTarta=15;
              ticketChocoBlanco = true;

            }else if (tipoChocolate.equals("negro")){
              precioTarta=14;
              ticketChocoNegro = true;

            }
          } else {
            System.out.println("Sabor no válido");
          }
      }

    } else {
      System.out.println("Elección de sabor no válida");
    }

    
    System.out.printf("¿Quiere nata? (si o no): ");
    nata = teclado.nextLine();

    if (nata.equals("si")) {
      ticketNata = true;
      precioNata = 2.5;
    }

    System.out.printf("¿Quiere ponerle un nombre? (si o no): ");
    nombre = teclado.nextLine();

    if (nombre.equals("si")) {
      ticketNombre = true;
      precioNombre = 2.75;
    }

    if (ticketChocoNegro) {
      System.out.printf("Tarta de chocolate negro: %.2f €\n", precioTarta);
    } else if (ticketChocoBlanco){
      System.out.printf("Tarta de chocolate blanco: %.2f €\n", precioTarta);
    } else if (ticketManzana){
      System.out.printf("Tarta de manzana: %.2f €\n", precioTarta);
    } else if (ticketFresa){
      System.out.printf("Tarta de fresa: %.2f €\n", precioTarta);
    } 
    
    if (ticketNata){
      System.out.printf("Con nata: %.2f €\n", precioNata);
    } 
    
    if (ticketNombre){
      System.out.printf("Con nombre: %.2f €\n", precioNombre);
    }

    total = precioTarta + precioNata + precioNombre;

    System.out.printf("Total: %.2f €\n", total);

    teclado.close();
  }
}
