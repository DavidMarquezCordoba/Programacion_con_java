import java.util.Scanner;

/**
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio47 {
  public static void main(String[] args) {
    
    int anchura = 6;
    int altura = 0;

    int emesPorCadaParte = 0;

    Scanner teclado = new Scanner(System.in);

    //Pedimos por teclado los datos
    System.out.println("");
    System.out.printf("Por favor, introduzca la altura (número impar mayor o igual a 5):");
    altura = teclado.nextInt();
    System.out.println("");

    //Comprobamos que sea impar y mayor que 3
    if (!(altura%2==0) && (altura>3)) {

      //Pintamos la primera capa superior del 8
      for (int i = 0; i < anchura; i++) {
        System.out.printf("M");
      }

      System.out.println("");

      //Calculamos cuantas "M" habrá en cada parte del 8
      emesPorCadaParte = (altura -3) / 2;

      //Vamos pintando los laterales y los espacios por dentro
      for (int i = 0; i < emesPorCadaParte; i++) {

        //Pintamos 1º las M
        System.out.printf("M");

        //Pintamos los espacios
        for (int j = 0; j < 4; j++) {
          System.out.printf(" ");
        }

        //Pintamos el último M
        System.out.printf("M\n");
      }

      //Pintamos la parte del medio, que coincide con la capa superior y la inferior
      for (int i = 0; i < anchura; i++) {
        System.out.printf("M");
      }
      
      //Salto de línea
      System.out.println("");

      //Volvemos a pintar los M laterales
      for (int i = 0; i < emesPorCadaParte; i++) {
        System.out.printf("M");
        for (int j = 0; j < 4; j++) {
          System.out.printf(" ");
        }
        System.out.printf("M\n");
      }

      //Pintamos capa inferior o base
      for (int i = 0; i < anchura; i++) {
        System.out.printf("M");
      }
      
      System.out.println("");

      
    } else {

      //Mostramos el mensaje de error, en caso que no se haya introducido los datos correectamente
      System.out.println("La altura introducida no es correcta");
      System.out.println("");
    }
    
    teclado.close();
  }
}
