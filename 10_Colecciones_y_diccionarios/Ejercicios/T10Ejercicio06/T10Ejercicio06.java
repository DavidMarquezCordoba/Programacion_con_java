package T10Ejercicio06;

import java.util.HashMap;

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
    
    String usuario;
    String password;
    int intentos = 0;
    boolean accede = false;

    HashMap<String, String> bbdd = new HashMap<String, String>();

    bbdd.put("david", "admin");

    do {
      System.out.print("Introduce el usuario: ");
      usuario = System.console().readLine();
      System.out.print("Introduce la contraseña: ");
      password = System.console().readLine();

      if (bbdd.containsKey(usuario)) {
        if (bbdd.get(usuario).equals(password)) {
          accede = true;
          System.out.println("\nAcceso permitido. Bienvenido David");
        } else {
          System.out.println("\nContraseña incorrecta\n");
          intentos++;
        }
      } else {
        System.out.println("\nUsuario no válido");
        intentos++;
      }
    } while ((intentos < 3) && !accede);

    if (intentos == 3) {
      System.out.println("\nHas sobrepasado los intentos\n");
    }
  }
}
