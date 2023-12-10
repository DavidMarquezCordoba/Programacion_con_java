import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que pida un número por teclado y que luego lo “disloque”
de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio68 {
  public static void main(String[] args) {
    
    long numIntroducido = 0;
    String sDigito = "";
    int ultimoDigito = 0;
    long numVolteado = 0;
    String sNumDiscolocado = "";

    Scanner teclado = new Scanner(System.in);

    try {
      System.out.print("Por favor, introduzca un número: ");
      numIntroducido = teclado.nextLong();
      long copiaNumIntroducido = numIntroducido;
  
      while (numIntroducido>0) {
        
        ultimoDigito = (int) numIntroducido %10;
  
        if (ultimoDigito%2==0) {
          ultimoDigito+=1;
        } else if(ultimoDigito % 2 !=0){
          ultimoDigito-=1;
        }
  
        numVolteado = numVolteado*10 + ultimoDigito;
  
        numIntroducido/=10;
      }
  
      while (numVolteado>0) {
        
        ultimoDigito = (int) numVolteado%10;
  
        numIntroducido = numIntroducido*10 + ultimoDigito;
  
        numVolteado/=10;
  
        sDigito = Integer.toString(ultimoDigito);
        sNumDiscolocado+=sDigito; 
      }
  
      System.out.println("Discolocando el "+ copiaNumIntroducido+ " sale el "+ sNumDiscolocado);
  
      teclado.close();
    } catch (InputMismatchException e) {
        System.out.println("");
        System.out.println("ERROR - Solo pueden introducirse números.");
        System.out.println("Clase de error - "+ e.getClass());
        System.out.println("Mensaje de error - "+e.getMessage());
    } finally {
        System.out.println("");
        System.out.println("Hasta luego");
        System.out.println("");
    }
  }
}
