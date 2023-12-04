import java.util.Scanner;

/**
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio63 {
  public static void main(String[] args) {
    
    int alturaPiramide1 = 0;
    int alturaPiramide2 = 0;
    String asteriscos = "*";

    boolean empiezaSegundaPiramide = false;
    int nivelP1 = 1;
    int pintaAsteriscos1 = 1;
    int pintaAsteriscos2 = 1;
    int espaciosPorDelante1 = 1;
    int espaciosPorDelante2 = 1;
    int nivelP2 = 0;
    int diferencia1 = 0;
    int diferencia2 = 0;
    int nivel = 1;
    int nivel2 = 1;
    int contadorSaltoLinea = 0;

    

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca la altura de la primera pirámide: ");
    alturaPiramide1 = teclado.nextInt();

    espaciosPorDelante1 = alturaPiramide1;
    nivelP1 = alturaPiramide1;
    int base1 = (alturaPiramide1*2)-1;

    System.out.print("Introduzca la altura de la segunda pirámide: ");
    alturaPiramide2 = teclado.nextInt();

    espaciosPorDelante2 = alturaPiramide2;
    nivelP2 = alturaPiramide2;

    int base2 = (alturaPiramide2*2)-1;

    

    //Indica que pirámide imprimirá primero si la primera o la segunda
    if (alturaPiramide1 > alturaPiramide2) {

      // diferencia1 = alturaPiramide1 - alturaPiramide2;

      while (nivel < alturaPiramide1) {

        //Espacios por delante
        for (int j = 0; j < espaciosPorDelante1 - 1; j++) {
          System.out.print(" ");
        }    
        
        //Asteriscos
        for (int j = 0; j < pintaAsteriscos1; j++) {
          System.out.print(asteriscos);
        }
        
        //Espacios por detrás
        for (int j = 0; j < espaciosPorDelante1 - 1; j++) {
          System.out.print(" ");
        } 


        nivel++;
        nivelP1--;
        contadorSaltoLinea++;

        if (nivelP1 == nivelP2) {
          empiezaSegundaPiramide = true;
        }

        if (nivel2 < alturaPiramide2) {
          if (empiezaSegundaPiramide) {

              //Espacios por delante
              for (int j = 0; j < espaciosPorDelante2 - 1; j++) {
                System.out.print(" ");
              }    
              
              //Asteriscos
              for (int j = 0; j < pintaAsteriscos2; j++) {
                System.out.print(asteriscos);
              }
              
              espaciosPorDelante2--;
              pintaAsteriscos2+=2;
              nivel2++;
          }
          
        }

          pintaAsteriscos1+=2;
          espaciosPorDelante1--;          

            System.out.println("");

          
      }

      //Pintamos la base 1
      for (int i = 0; i < base1; i++) {
        System.out.print(asteriscos);
      }

      System.out.print(" ");

      //Pintamos la base 2
      for (int i = 0; i < base2; i++) {
        System.out.print(asteriscos);
      }

    }

    
    teclado.close();
  }
}



// Introduzca la altura de la primera pirámide: 7
// Introduzca la altura de la segunda pirámide: 3
//       *
//      ***
//     *****
//    *******
//   *********     *
//  ***********   ***
// ************* *****
