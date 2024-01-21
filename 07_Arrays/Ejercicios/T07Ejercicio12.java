import java.util.Scanner;

/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7:
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int [] arrayOriginal = new int[10];
    int [] copiaArray = new int [10];

    int numIntroducido;
    int inicial;
    int fin;

    //Almacenamos
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.print("Introduzca un número: ");
      numIntroducido = teclado.nextInt();
      arrayOriginal[i]= numIntroducido;
    }

    //Mostramos Array Original
    System.out.println("");
    System.out.print("Índice ");
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.printf("%7d", i);
    }

    System.out.println("");
    System.out.print("Valor  ");

    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.printf("%7d",arrayOriginal[i]);;
    }

    //Pedimos por pantalla inicial y final y comprobamos que estén en el rango solicitado del array
    System.out.println("\n");
    do {
      do {
        System.out.print("Indique la posición inicial: ");
        inicial = teclado.nextInt();
      } while ((inicial <0)&&(inicial>9));
  
      do {
        System.out.print("Indique la posición final: ");
        fin = teclado.nextInt();
      } while ((fin < 0 ) && (fin > 9));

      if (inicial > fin) {
        System.out.println("El número inicial no debe ser mayor al final. Vuelva a intentarlo");
      } else if (inicial == fin){
        System.out.println("Inicial y final no deben tener las mismas posiciones. Vuelva a intentarlo");
      }
    } while ((inicial > fin)||(inicial == fin));

    System.out.print("\nÍndice ");
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.printf("%7d", i);
    }

    System.out.println("");
    System.out.print("Valor  ");

    

    //Copiamos el array en otro vacío
    for (int i = 0; i < arrayOriginal.length; i++) {
      copiaArray[i] = arrayOriginal[i];
    }

    //Asignamos el valor de la posición inicial a la posición final
    copiaArray[fin] = arrayOriginal[inicial];

    ////////DUDAS
    //Pintamos desde fin + 1 (posición fin ya lo asignamos antes) hasta el final del array
    for (int i = fin + 1; i < arrayOriginal.length; i++) {
      //Empezamos con un desfase + 1 que corregimos con el arrayOriginal para asignar el valor que había en la posición "fin" al principio
      copiaArray[i] = arrayOriginal[i - 1];
    }

    //Asignamos en la posición 0 el valor de la última posición del arrayOriginal
    copiaArray[0] = arrayOriginal[arrayOriginal.length-1] ;     // - 1 porque los arrays empiezan en 0 y el rango es de 0-9 (tenemos [10])

    //Pintamos el fragmento de array desde la posición 1 (ya que la posición 0 la hemos pintado antes) hasta inicial]
    for (int i = 0; i < inicial; i++) {
      //Desfasamos  + 1 porque la posición 0 ya está asignada anteriormente
      copiaArray[i+1] = arrayOriginal[i];     //significa que a la posición 1 de la copia se le asignará el valor de la posición 0 del arrayOriginal
    }

    //Mostramos por pantalla
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.printf("%7d", copiaArray[i]);
    }

    teclado.close();
  }
}
