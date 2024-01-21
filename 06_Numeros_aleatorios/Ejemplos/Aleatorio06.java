/**
 * Recopilatorio de los rangos aleatorios
 * 
 * @author David Márquez Córdoba
 */

public class Aleatorio06 {
  public static void main(String[] args) {
    
    //Genera números aleatorios internamente de 0 a 1
    System.out.println("\nMath.random(), genera números de [0.0, 0.999-]\n");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ Math.random());
    }

    //Genera números aleatorios entre [0 y 9]
    System.out.println("\n(int)(Math.random()*10), genera números de [0, 9]\n");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ (int)(Math.random()*10));
    }

    //Genera un número aleatorio entre [0, 10]
    System.out.println("\n(int)(Math.random()*11), genera números de [0, 10]\n");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ (int)(Math.random()*11));
    }

    //Genera un número aleatorio entre [1,10] //El *10 es entre 0 y 9, si le sumas uno es 1 y 10
    System.out.println("\n(int)(Math.random()*10+1), genera números de [1, 10]\n");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ (int)(Math.random()*10+1));
    }

    //Genera un número aleatorio entre [50,60]
    System.out.println("\n(int)((Math.random()*11)+50), genera números de [50, 60]\n");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ (int)((Math.random()*11)+50));
    }

    //Genera un número aleatorio entre [51,60]
    System.out.println("\n(int)((Math.random()*10+1)+50), genera números de [51, 60]\n");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ (int)((Math.random()*10+1)+50));
    }

    //Genera un número aleatorio entre [51,73]
    System.out.println("\n(int)((Math.random()*23)+51), genera números de [51, 73]\n");
    for (int i = 1; i <= 50; i++) {
      System.out.println(i+". "+ (int)((Math.random()*23)+51));
    }
  }
}
