/**
 * Explicación de los distintos tipos de variables
 * 
 * @author David Márquez Córdoba
 */

public class ejemplo {

  public static void main(String[] args) {
    
    //Tipo byte -> num entero de 8 bits
    byte niNumByte = 100;
    System.out.println(niNumByte);

    //Tipo short
    short niNumShort = 5000;
    System.out.println(niNumShort);

    //Tipo Long
    long niNumLong = 15000000L;
    System.out.println(niNumLong);

    //Tipo Float
    float miNumFloat = 32.12f;
    System.out.println(miNumFloat);

    //Tipo Boolean
    boolean esJavaDivertido = true;
    boolean hoyLlueve = false;
    System.out.println(esJavaDivertido);
    System.out.println(hoyLlueve);

    //Concatenación
    int edad = 35;
    System.out.println("Tengo: " + edad + " años.");

    double x = 7;
    double y = 25.353;

    System.out.println("El valor de x es: "+x+ " y el valor de y es: "+y);

    //Char
    char letra1 = 99; //Se puede poner la letra entre comillas simples o el número ASCII
    char letra2 = 'b';
    

    System.out.println(letra1);
    System.out.println(letra1 + "" + letra2);


    //Tipo String
    String miNombre = "David";
    char unaLetra= 'a';

    System.out.println(miNombre +" - "+ unaLetra);

    //Casteo

    int num1 = 2;
    int num2 = 9;

    
    System.out.println("El num1 es: "+num1);
    System.out.println("El num2 es: "+num2);
    System.out.println("El casteo de la variable num2: "+ (double)num2);
  }
}