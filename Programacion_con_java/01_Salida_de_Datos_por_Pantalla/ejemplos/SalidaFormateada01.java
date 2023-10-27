/**
 * Salida Formateada usando enteros, decimales y decimales con precisión
 * 
 * @author David Márquez Córdoba
 */
public class SalidaFormateada01 {

  public static void main(String[] args) {

    //Salidas formateadas con Printf

    System.out.printf("El número %d no tiene decimales. \n", 21);
    System.out.printf("El número %f sale con decimales. \n", 21.0);
    System.out.printf("El número %.4f sale exactamente con %d decimales. \n", 21.0, 4);
    System.out.printf("Letra: %c. \n", 83);

    //ORDEN
    System.out.println("----------------------------------------------------------------------------------");
    System.out.printf("Mostramos el segundo número: %2$d y ahora mostramos el primero número: %1$d \n", 54, 21);
    
    //FLAGS
    System.out.println("----------------------------------------------------------------------------------");
    System.out.printf("%8d\n", 100);
    System.out.printf("%08d\n", 100);
    System.out.printf("%+d\n", 100);
  }
}