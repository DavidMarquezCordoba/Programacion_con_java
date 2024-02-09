package EjemploAtribuosYMetodosDeClase;
/**
 * Main del ejemplo de la clase Coche con los atributos y métodos staticos
 * 
 * @author David Márquez Córdoba
 */

public class AppCoche {
  public static void main(String[] args) {
    
    Coche coche1 = new Coche("Toyota", "Corolla");
    Coche coche2 = new Coche("Ford", "Sierra");
    Coche coche3 = new Coche("Seat", "Ibiza");

    coche1.recorre(120);
    coche2.recorre(80);
    coche3.recorre(150);

    System.out.println("\nVamos a ver cuántos km a recorrido cada uno:");
    System.out.println("\nEl "+ coche1.getMarca() + " "+ coche1.getModelo()+ " ha recorrido "+ coche1.getKilometraje()+" kms");
    System.out.println("El "+ coche2.getMarca() + " "+  coche2.getModelo()+ " ha recorrido "+ coche2.getKilometraje()+ " kms");
    System.out.println("El "+ coche3.getMarca()  + " "+  coche3.getModelo()+ " ha recorrido "+ coche3.getKilometraje()+ " kms");
    System.out.println("\nEn total, han recorrido entre los coches: "+ Coche.getKilometrajeTotal()+ " kms");
  }
}
