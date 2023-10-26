/**
 * Coloreado de texto
 *
 * Muestra varias palabras en el color que corresponde.
 *
 * @author David Márquez Córdoba
 */

// import colors.ConsoleColors;

public class Colores {
  public static void main(String[] args) {
      System.out.print("\033[33m mandarina");
      System.out.print("\033[32m hierba");
      System.out.print("\033[31m tomate");
      System.out.print("\033[43;37m sábanas \033[0m");
      System.out.print("\033[36m cielo");
      System.out.print("\033[35m nazareno");
      System.out.print("\033[34m mar");

      System.out.println("\033[0m"); //Reseteo color, ya que se queda por defecto el último 

      //Nuevos colores
      System.out.print("\033[43m mandarina");
      System.out.print("\033[42m hierba");
      System.out.print("\033[41m tomate");
      System.out.print("\033[47m sábanas");
      System.out.print("\033[46m cielo");
      System.out.print("\033[45m nazareno");
      System.out.print("\033[44m mar");

      System.out.println("\033[0m"); //Reseteo color, ya que se queda por defecto el último 

      //Nuevos colores
      System.out.print("\033[1;63m mandarina");
      System.out.print("\033[1;42m hierba");
      System.out.print("\033[1;41m tomate");
      System.out.print("\033[1;47m sábanas");
      System.out.print("\033[1;46m cielo");
      System.out.print("\033[1;45m nazareno");
      System.out.print("\033[1;44m mar");

      System.out.println("\033[0m"); //Reseteo color, ya que se queda por defecto el último 
  } 
}