
// Escribe un programa en el que se declaren las variables enteras x e y. 
// Asígnales los valores 144 y 999 respectivamente. 
// A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.

public class T02Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;


    System.out.println("El valor de X es: " + x);
    System.out.println("El valor de Y es: " + y);
    System.out.println("---------------------");
    System.out.println("La suma de "+ x + " y " + y + " es: " + (x+y));
    System.out.println("La resta de "+ x + " y " + y + " es: " + (x-y));
    System.out.println("La multiplicación de "+ x + " y " + y + " es: " + (x*y));
    System.out.printf("La división de "+ x + " y " + y + " es: %.2f", (double) x / (double) y);
  }
}
