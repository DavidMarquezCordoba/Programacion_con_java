/*
 * Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio29 {
  public static void main(String[] args) {
    
    String desayuno = "";
    String desayunoConPitufo = "";
    double precioDesayuno = 0;
    double precioDesayunoConPitufo = 0;
    // double precioAceite = 0;
    // double precioTortilla = 0;

    String bebida = "";
    double precioBebida=0;

    double total = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    desayuno = teclado.nextLine();

    switch (desayuno) {

      case "palmera":
        precioDesayuno=1.40;
        break;

      case "donut":
        precioDesayuno=1;
        break;
      
        case "pitufo":
        System.out.printf("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
        desayunoConPitufo = teclado.nextLine();

        switch (desayunoConPitufo) {
          
          case "aceite":
            precioDesayunoConPitufo=1.20;
            break;

          case "tortilla":
            precioDesayunoConPitufo= 1.60;
            break;

          default:
            System.out.println("Opción de pitufo no válida");
            break;
        }
        break;

      default:
        System.out.println("Opción no válida");
        break;
    }

    System.out.printf("¿Qué ha tomado de beber? (zumo o café): ");
    bebida = teclado.nextLine();

    switch (bebida) {
      
      case "zumo":
        precioBebida = 1.50;
        break;

      case "cafe":
        precioBebida = 1.20;
        break;
    
      default:
        System.out.println("Bebida no válida");
        break;
    }

    if (desayuno.equals("palmera")) {
      System.out.printf("Palmera: %.2f\n", precioDesayuno);
    } else if (desayuno.equals("donut")){
      System.out.printf("Donut: %.2f\n", precioDesayuno);
    } else if (desayuno.equals("pitufo")){
      if (desayunoConPitufo.equals("aceite")) {
        System.out.printf("Pitufo con aceite: %.2f\n", precioDesayunoConPitufo);
      } else if (desayunoConPitufo.equals("tortilla")){
        System.out.printf("Pitufo con tortilla: %.2f\n", precioDesayunoConPitufo);
      }
    }

    if (bebida.equals("zumo")) {
      System.out.printf("Zumo: %.2f\n", precioBebida);
    } else if (bebida.equals("cafe")){
      System.out.printf("Café: %.2f\n", precioBebida);
    }

    total = precioDesayuno+precioDesayunoConPitufo+precioBebida;

    System.out.printf("Total desayuno: %.2f €", total);

    teclado.close();
  }
}
