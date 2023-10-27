/*
 * Como funciona sentencia IF
 * 
 * @author David Márquez Córdoba
 */
import java.util.*;

public class ComparacionCadena {

  public static void main(String[] args) {

    //Método 1 con .equals()

    String miFruta1 = "naranja";
    String miFruta2;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Diga el nombre de una fruta: ");
    miFruta2 = teclado.nextLine();

    teclado.close();

    if (miFruta1.equals(miFruta2)) {
      System.out.println("Es la misma fruta");
    } else{
      System.out.println("No es la misma fruta");
    }



    //Método 2 -NO FUNCIONA- 

    //Explicación:

    // String miFruta1 = "naranja";
    // String miFruta2;

    // Scanner teclado = new Scanner(System.in);

    // System.out.println("Diga el nombre de una fruta: ");
    // miFruta2 = teclado.nextLine();

    // teclado.close();

    // if (miFruta1 == miFruta2) {
    //   System.out.println("Es la misma fruta");
    // } else{
    //   System.out.println("No es la misma fruta");
    // }



  }
}