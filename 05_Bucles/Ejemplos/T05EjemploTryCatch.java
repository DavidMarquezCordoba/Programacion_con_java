import java.util.Scanner;

public class T05EjemploTryCatch {
  public static void main(String[] args) {
    double numero1;
    double numero2;
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Introduzca el primer número: ");
      numero1 = sc.nextInt();
      System.out.println("Introduzca el primer número: ");
      numero2 = sc.nextInt();
      sc.close();
      System.out.println("La media es = " + (numero1 + numero2) / 2);
    } catch (NumberFormatException nfe) { // saldria fallo si no introduces un número
      System.out.println("No se puede introducir caracteres.");

    } catch (Exception e) {
      System.out.println("Eror de mensaje." + e.getMessage());
      System.out.println("Clase de excepción." + e.getClass());
    } finally {
      System.out.println("Gracias por usar este programa .");
    }
  }
}