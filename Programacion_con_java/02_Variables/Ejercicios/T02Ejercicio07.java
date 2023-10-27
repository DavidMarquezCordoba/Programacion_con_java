/*
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible?
 * 
 * @author David Márquez Córdoba
 */

public class T02Ejercicio07 {
  public static void main(String[] args) {
    char letra1 = 'D';
    char letra2 = 'a';
    char letra3 = 'v';
    char letra4 = 'i';
    char letra5 = 'd';

    String apellido = "Márquez";

    //Si se hiciera como siempre...saldría la suma de cada uno de los valores asignados a cada letra en el código ASCII
    System.out.println(letra1+letra2+letra3+letra4+letra5+" "+ apellido);

    //Tenemos que poner +""+ el espacio para que detecte la letra y no el número de código ASCII
    System.out.println(letra1+""+letra2+""+letra3+""+letra4+""+letra5+ " "+ apellido);
  }
}
