/**
 * Muestra por pantalla todos los números primos entre 2 y 10, ambos incluidos.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio22 {
  public static void main(String[] args) {
    
    boolean esPrimo;;
    // Vamos filtrando 

    // 1º Ajustamos rango permitido (de 2 a 10)
    // i => número
    // j => módulo de..
    for (int i = 2; i <= 100; i++) {

      esPrimo = true;

      //Aclaración:
      //Comprobamos si el núm es primo entre un rango específico
      //  - Comprobamos cada número del 2 al 100 para descartar que su resto sea 0, 
      //ya que si es 0 significa que es DIVISIBLE y solo debe ser divisible entre 1 y el mismo.
      for (int j = 2; j < i; j++) {
        
        if (i%j==0) {
          esPrimo=false;
        }
      }

      //Mientras que no se encuentre un número que NO sea primo se va imprimiendo
      if (esPrimo) {
        System.out.println(i);
      }
    }
  }
}

