/*
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
de un color diferente.
 * 
 * @author David Márquez Córdoba
 */

public class T01Ejercicio05 {
  public static void main(String[] args) {
    
    
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "+-----+", "+------+", "+------+", "+------+", "+-------+");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "|Lunes|", "|Martes|", "|Miérc.|", "|Jueves|", "|Viernes|");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "+-----+", "+------+", "+------+", "+------+", "+-------+");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "|     |", "|\033[31m PROG \033[0m|", " |\033[34m PROG\033[0m |", " |\033[35m PROG\033[0m |", " |\033[36m  PROG\033[0m |");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "|     |", "|      |", "|      |", "|      |", "|       |");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "|LIBRE|", "|15:15 |", "|19:30 |", "| 19:30|", "| 15:15 |");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "|     |", "|  a   |", "|  a   |", "|   a  |",  "|   a   |");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "|     |", "|17:15 |", "|21:30 |", "| 21:30|", "| 17:15 |");
    System.out.printf("%-9s %-9s %-9s %-9s %-9s \n", "+-----+", "+------+", "+------+", "+------+", "+-------+");
  }
}
