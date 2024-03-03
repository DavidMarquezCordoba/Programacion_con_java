package Repaso_Arrays;
/**
 * -D-I-V-I-N-A-R-E-M- es una inteligencia artificial que te permite interactuar con ella a través de un juego.
 *-D-I-V-I-N-A-R-E-M- pensará un número dentro de un intervalo y tú tendrás que acertar dicho número.
 *Para que -D-I-V-I-N-A-R-E-M- pueda pensar ese número tendrás que decirle un intervalo mínimo y un intervalo máximo 
 *en el que -D-I-V-I-N-A-R-E-M- se moverá para pensar el número (ambos números incluidos).
 *
 *-D-I-V-I-N-A-R-E-M- es muy cabezón y dentro de ese intervalo él establecerá el intervalo que a él le parezca.
 * 
 * @author David Márquez Córdoba
 */
public class Divinarem {
  public static void main(String[] args) {
    
    //Variables
    int valorMinUsuario;
    int valorMaxUsuario;

    int valorMinIA;
    int valorMaxIA;

    boolean valido = true;
    boolean acierta = false;
    boolean repetir = false;

    int intentosMaximos;
    int aux;

    int numParaAdivinar;
    int numElegidoPorIA;

    int opcionMenu;

    /**
     * Lógica de entrada de datos, estableciendo el primer rango
     */
    do {
      //Reinicio del valor de salida
      repetir = false;

      System.out.println("\n-D-I-V-I-N-A-R-E-M-");
      System.out.println("Divinarem pensará un número entre los valores que tu decidas");
      System.out.print("Introduzca el mínimo valor del intervalo: ");
      valorMinUsuario = Integer.parseInt(System.console().readLine());
  
      do {
        System.out.print("Introduzca el máximo valor del intervalo: ");
        valorMaxUsuario = Integer.parseInt(System.console().readLine());
  
        valido = true;
  
        if (valorMaxUsuario<valorMinUsuario) {
          System.out.println("El número debe ser MAYOR al número mínimo establecido");
          valido = false;
        } else if (valorMaxUsuario==valorMinUsuario) {
          System.out.println("El valor introducido no puede ser igual al mínimo establecido");
          valido = false;
        } else if (valorMinUsuario+1 == valorMaxUsuario) {
          System.out.println("Debe haber al menos 1 número entre medias del mínimo y el máximo");
          valido = false;
        }
  
      } while ((valorMaxUsuario<=valorMinUsuario) && valido);
  
  
      /**
       * Estableciendo el segundo rango, rango aleatorio, con el Mínimo y el máximo establecido
       */
      
      do {
        valido = true;
  
        //Multiplicamos por la diferencia entre el valor max y min del usuario y sumamos el mínimo como valor inicial de la IA
        valorMinIA = (int)(Math.random()*(valorMaxUsuario - valorMinUsuario + 1) + valorMinUsuario); 
        //Igual que antes, salvo que ahora el mínimo será el de la IA (ya está acotado)
        valorMaxIA = (int)(Math.random()*(valorMaxUsuario - valorMinIA + 1) + valorMinIA);
  
        if (valorMinIA+1==valorMaxIA) {
          valido = false;
        }
  
      } while ((valorMinIA >= valorMaxIA) && valido);
  
      /**
       * La IA piensa un número entre el rango que ella ha establecido
       */
  
      numElegidoPorIA = (int)(Math.random()*(valorMaxIA - valorMinIA + 1) + valorMinIA);
  
      /**
       * Calculamos número de intentos dependiendo del rango establecido
       */
      intentosMaximos = (int)(Math.log(valorMaxIA-valorMinIA+1) / Math.log(2));
      aux = intentosMaximos;
      
  
      System.out.println("\n-D-I-V-I-N-A-R-E-M-");
      System.out.println("Estoy pensando en un número entre " + valorMinIA + " y " + valorMaxIA);
      System.out.println("Tienes " + intentosMaximos + " intentos.\n");
  
      /**
       * Vamos solicitando números hasta que lo acierte o se agoten las oportunidades
       */
  
      aux--;  //Quitamos un intento la primera vez que se le pregunta.
  
      for (int i = 0; i < intentosMaximos; i++) {
        System.out.print("\nEscribe el número: ");
        numParaAdivinar = Integer.parseInt(System.console().readLine());
  
        if (numParaAdivinar==numElegidoPorIA) {
          System.out.println("Enhorabuena!!!! has acertado.");
          System.out.println("Efectivamente, el número era el : "+ numElegidoPorIA);
          acierta = true;
          break;
        } else if (numParaAdivinar > numElegidoPorIA) {
          System.out.println("Te has pasado");
          System.out.println("Le quedan: " + (aux--) + " intentos.");
        } else if (numParaAdivinar < numElegidoPorIA) {
          System.out.println("Te has quedado corto");
          System.out.println("Le quedan: " + (aux--) + " intentos.");
        } 
      }
  
      if (!acierta) {
        System.out.println("\nHas superado el número de intentos");
        System.out.println("El número que había pensado era: "+ numElegidoPorIA);
      }
  
      System.out.println("\nElige una opción:");
      System.out.println("1. Volver a jugar.");
      System.out.println("2. Salir del juego.");
      System.out.print("Opción: ");
      opcionMenu = Integer.parseInt(System.console().readLine());
  
      switch (opcionMenu) {
        case 1:
          repetir = true;
          break;
  
        case 2:
          System.out.println("Gracias por jugar a -D-I-V-I-N-A-R-E-M-");
          break; 
            
        default:
          System.out.println("Opción no válida");
          break;
      }
    } while (repetir);
  }
}
