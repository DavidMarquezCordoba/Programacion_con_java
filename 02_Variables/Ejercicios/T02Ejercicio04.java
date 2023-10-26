public class T02Ejercicio04 {
  public static void main(String[] args) {
    double euros = 6.50;
    final double VALOR = 166.386;

    int pesetas = (int) (euros * VALOR);

    System.out.println(euros + " € son "+ pesetas + " pesetas.");

    //Salida formateada

    System.out.printf("%.2f € son "+pesetas+" pesetas.", euros);
  }
}
