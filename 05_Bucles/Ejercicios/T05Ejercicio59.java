import java.util.Scanner;

/**
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio59 {
  public static void main(String[] args) {
    
    int alturaArbol;
    int copiaAlturaArbol;

    //Controla el nivel del medio (El triángulo del árbol)
    int nivel1 = 2;
    //Controla el nivel desde dónde empiezan a sumar +2 espacios
    int nivel2 = 3;
    
    int espaciosInterior = 0;
    int numeroEspacios = 1;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Por favor, introduzca la altura del árbol: ");
    alturaArbol = teclado.nextInt();
    copiaAlturaArbol = alturaArbol;

    for (int i = 0; i < alturaArbol; i++) {

      //Espacios por delante
      for (int j = 0; j < (alturaArbol-3)-i; j++) {
        System.out.print(" ");
      }

      System.out.print("^");
      System.out.println("");

      //Espacios por delante
      for (int j = 0; j < (alturaArbol-3)-i; j++) {
        System.out.print(" ");
      }

      nivel1++;

      //Comprobamos si está en el medio, si lo está, pinta caracter
      //Quitamos 1 para que no tenga en cuenta la estrellita y el primer ^
      if (nivel1<(alturaArbol-1)) {
        System.out.print("^");

        //Pintamos espacios interiores

        //Solo pintará un espacio la primera vez
        if (numeroEspacios == 1) {
          System.out.print(" ");
        } else {
          
          //A partir de la 2ª iteración añadirá 2 espacios más
          for (int j = 2; j < numeroEspacios+2; j++) {
            System.out.print(" ");
          }
          
        }
        numeroEspacios+=2;
        System.out.print("^");
      }

      if (nivel1==alturaArbol-1) {
        for (int j = 0; j < numeroEspacios+2; j++) {
          System.out.print("^");
        }
      }

      System.out.println("");

      



      }
      System.out.println("");   
      
        


    teclado.close();
  }
}

// altura = 10

//        *
//        ^
//       ^ ^
//      ^   ^
//     ^     ^
//    ^       ^
//   ^         ^
//  ^           ^
// ^^^^^^^^^^^^^^^
//        Y

    // for (int i = 0; i < alturaArbol; i++) {

    //   //Espacios por delante
    //   for (int j = 0; j < (alturaArbol-3)-i; j++) {
    //     System.out.print(" ");
    //   }

    //   nivel1++;

    //   //Comprobamos si está en el medio, si lo está, pinta caracter
    //   if (nivel1<(alturaArbol)) {
    //     System.out.print("^");

    //     //Pintamos espacios interiores
    //     if (numeroEspacios == 1) {
    //       System.out.print(" ");
    //     } else {
          
    //       for (int j = 0; j < numeroEspacios+2; j++) {
    //         System.out.print(" ");
    //       }

          
    //     }
    //     numeroEspacios++;
    //     System.out.print("^");
    //   }

    //   System.out.println("");

      



    //   }
    //   System.out.println("");   
      
    
    

