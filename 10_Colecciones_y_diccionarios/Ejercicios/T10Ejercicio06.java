package Ejercicios;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Implementa el control de acceso al área restringida de un programa. Se debe
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
de usuario con sus correspondientes contraseñas deben estar almacenados en
una estructura de la clase HashMap.
 * 
 * @author David Márquez Córdoba
 */
public class T10Ejercicio06 {
  public static void main(String[] args) {
    
    //Creamos el Hashmap
    HashMap <String, String> bbdd = new HashMap<>();

    Scanner teclado = new Scanner(System.in);

    //Atributos
    String usuario;
    String pass;

    boolean accede = false;

    //Inicializamos
    bbdd.put("admin", "123456");
    bbdd.put("fulanito", "1234");
    bbdd.put("menganito", "54321");


    do {
      System.out.print("Introduce una contraseña: ");
      usuario = teclado.nextLine();
      System.out.print("Introduce la contraseña: ");
      pass = teclado.nextLine();

      
    } while (!accede);
    
    teclado.close();
  }
}
