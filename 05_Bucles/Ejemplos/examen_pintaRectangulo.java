import java.util.Scanner;

/**
 //Realiza un programa que pida la base y la altura de un rectángulo para pintarlo por pantalla utilizando asteriscos (*). 
//Tras solicitar estos dos datos, debe mostrarse el siguiente menú:

//		1. Pinta el rectángulo verticalmente (normal).
//		2. Pinta el rectángulo horizontalmente (invertido).
//		3. Salir.

//		El programa mostrará dichas opciones mientras no se seleccione la opción 3 de salir. 
//		Es decir cada vez que realiza una acción tiene que volver a pintar el menú y permanecer a la espera de elegir otra opción. 
//		Si la opción elegida es la 3, el programa debe terminar.
//				
//			El rectángulo se ha de pintar con asteriscos (*). Cada asterisco identifica a una unidad de la dimensión.
//			Ejemplo base = 3 altura = 7 pintado verticalmente (opción 1):
//
 * 
 * @author David Márquez Córdoba
 */

public class examen_pintaRectangulo {
  public static void main(String[] args) {
    
    char asteriscos ='*';
    int base;
    int altura;
    int opcion;

    Scanner teclado = new Scanner(System.in);
    System.out.println("");
    do {
      System.out.print("Indica la base del triángulo: ");
      base = teclado.nextInt();

      System.out.print("Indica la altura del triángulo: ");
      altura = teclado.nextInt();

      do {
        System.out.println("\n********************** M E N U **********************");
        System.out.println(" Elija una opción: ");
        System.out.println("1. Pinta el rectángulo verticalmente (normal)");
        System.out.println("2. Pinta el rectángulo horizontalmente (invertido)");
        System.out.println("3. Salir");
        System.out.println("*******************************************************\n");
    
        System.out.print("Elija una opción: ");
        opcion = teclado.nextInt();
  
        switch (opcion) {
    
          case 1:
              System.out.println("");
              for (int i = 0; i < base; i++) {
                for (int j = 0; j < altura; j++) {
                  System.out.print(asteriscos);
                }
                System.out.println("");
              }
            break;
    
          case 2:
              System.out.println("");
              for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                  System.out.print(asteriscos);
                }
                System.out.println("");
              }
            break;

          case 3:
              System.out.println("\nGracias. Hasta luego!\n");
            break;
  
          default: 
            System.out.println("\nOpción no válida\n");
            break;
        }
        
      } while ((opcion!=3)&&(opcion!=1)&&(opcion!=2));

    } while (opcion!=3);

    teclado.close();
  }
}
