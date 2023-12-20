/**
 * Ejemplo de uso de Array - 04
 * 
 * @author David Márquez Córdoba
 */

public class Array04 {
  public static void main(String[] args) {
    
    char [] caracter = new char [6];

    caracter[0]='R';
    caracter[1]='%';
    caracter[2]='&';
    caracter[3]='+';
    caracter[4]='A';
    caracter[5]='2';

    System.out.println("El array contiene los siguientes carácteres: ");
    for (int i = 0; i < 6; i++) {
      System.out.print(caracter[i]+ " ");
    }
  }
}
