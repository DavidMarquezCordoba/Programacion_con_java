public class SalidaFormateada02 {
  public static void main(String[] args) {
    //FLAGS
    System.out.println("----------------------------------------------------------------------------------");
    System.out.printf("%8d\n", 100);
    System.out.printf("%08d\n", 100);
    System.out.printf("%+d\n", 100);
    System.out.printf("%-8d\n", 100);

    //Precisión
    System.out.printf("%.4f\n", 25.8765);
    

  }

}
