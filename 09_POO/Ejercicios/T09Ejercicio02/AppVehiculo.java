package T09Ejercicio02;
/**
 * Aplicación de vehículos
 * 
 * @author David Márquez Córdoba
 */

public class AppVehiculo {

  public static void main(String[] args) {

    int opcion;

    //Creamos los objetos
    Bicicleta bicicleta = new Bicicleta(15);
    Coche coche = new Coche(1000);

    do {
      System.out.println("\nVehiculos");
      System.out.println("==========\n");
  
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir\n");
      System.out.println("9. ¿Cuántos vehículos se han creado?");
  
      System.out.println("Elige una opción (1-8): ");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          bicicleta.andaBici();
          break;

        case 2:
          bicicleta.caballitoBici();
          break;

        case 3:
          coche.andaCoche();
          break;

        case 4:
          coche.quemaRuedaCoche();
          break;

        case 5:
          System.out.println("\nLa bici ha recorrido: "+ bicicleta.getKilometrajeBici()+" kms");
          //Llamamos al método a través de la subclase porque la hereda
          bicicleta.recorre(bicicleta.getKilometrajeBici());
          break;

        case 6:
          System.out.println("\nEl coche ha recorrido: "+ coche.getKilometrajeCoche()+" kms");

          coche.recorre(coche.getKilometrajeCoche());
          break;

        case 7:
          System.out.println("\nTotal: "+ Vehiculo.getKilometrosTotales());
          break;

        case 8:
          System.out.println("Gracias, hasta pronto");
          break;

        case 9:
          System.out.println("Se han creado "+ Vehiculo.getVehiculosCreados());
          break;
      }

    } while (!(opcion == 8));



  }
}
