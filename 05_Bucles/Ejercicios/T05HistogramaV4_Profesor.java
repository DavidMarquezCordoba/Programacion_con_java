import java.util.Scanner;

/**
 * Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) 
 * hasta que se introduzca un número negativo. A continuación se mostrará una tabla donde en la primera columna aparecerán
 * los números introducidos y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.

Introduce un número entre 0 y 9 y pulsa INTRO. Introduce un número negativo para salir:
2
4
8
0
1
-1

  --- --- --- --- --- --- --- --- ---
  | 2 | * | * |   |   |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
  | 4 | * | * | * | * |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
  | 8 | * | * | * | * | * | * | * | * |
  --- --- --- --- --- --- --- --- ---
  | 0 |   |   |   |   |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
  | 1 | * |   |   |   |   |   |   |   |
  --- --- --- --- --- --- --- --- ---
 * 
 * @author David Márquez Córdoba
 */

public class T05HistogramaV4_Profesor {
  public static void main(String[] args) {
    
    int cifraIntroducida = 0;       //Almaceno la cifra introducida
    long numeroCompleto = 0;        //El número completo al añadir todos los números introducidos
    long numeroVolteado = 0;
    int digito = 0;
    int digitoMayor = 0;            //Almacenará el mayor dígito
    int cantidadDigitos = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número entre 0 y 9 y pulsa INTRO. Introduce un número negativo para salir: ");
    

    do {
      
      cifraIntroducida = teclado.nextInt();

      //Controlamos la condición para que se almacene solo números entre 0 y 9
      if ((cifraIntroducida>=0)&&(cifraIntroducida<=9)) {       

        numeroCompleto = numeroCompleto*10 + cifraIntroducida;
        cantidadDigitos++;
      }
      
    } while (cifraIntroducida>=0);

    //Daremos una vuelta
    while (numeroCompleto>0) {
      digito = (int) numeroCompleto%10;

      //Controlamos cuál será el número mayor comparándolos cada uno entre ellos
      if (digito > digitoMayor) {
        digitoMayor = digito;
      }

      numeroVolteado = (numeroVolteado*10) + digito;

      numeroCompleto/=10;
    }

    //Empezaremos a pintar la tabla -> digitoMayor +1 serán las columnas y numeroDigitos serán las filas

    //creamos nuevas variables para legibilidad de código
    int numeroColumnas = digitoMayor +1;
    int numeroFilas = cantidadDigitos;

    //Pintamos el techo del recuadro
    for (int i = 0; i < numeroColumnas; i++) {
      System.out.print(" ---");
    }
    

    //Pintamos las filas
    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println("");
      digito = (int) numeroVolteado%10;
      numeroVolteado/=10;
      System.out.print("| " +digito+ " |");

      for (int j = 0; j < digito; j++) {
        System.out.print(" * |");
      }
      //Pintamos el resto de columnas sin asterisco
      for (int j = 1; j < numeroColumnas - digito; j++) {
        System.out.print("   |");
      }

      System.out.println("");
      //Pintamos la base
      for (int j = 0; j < numeroColumnas; j++) {
        System.out.print(" ---");
      }


    }


    teclado.close();
  }
}
