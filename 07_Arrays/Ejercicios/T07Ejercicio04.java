/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio04 {
  public static void main(String[] args) {
    
    int [] numero = new int[20];
    double [] cuadrado = new double [20];
    double [] cubo = new double [20];



    System.out.println("NÚMERO       CUADRADO        CUBO");
    System.out.println("=================================");
    //Cargamos valores en número[]
    for (int i = 0; i < numero.length; i++) {
      numero [i] = (int) (Math.random()*101);
      System.out.printf("%3d", numero[i]);
      
      //Cargamos valores en cuadrado[] referenciándonos en el número
      for (int j = 0; j < 1; j++) {
        cuadrado[j] = Math.pow(numero[i], 2);
        //Reservamos 15 espacios y alineamos a la derecha, casteamos para quedarnos con el número entero
        System.out.printf("%15d", (int)(cuadrado[j]));

        //Cargamos valores en cubo[] referenciándonos en el número 
        for (int k = 0; k < 1; k++) {
          cubo[k] = Math.pow(numero[i], 3);
          //Reservamos 15 espacios y alineamos a la derecha
          System.out.printf("%15d", (int)cubo[k]);
        }
      }
      System.out.println("");
    }
    System.out.println("");
  }
}
