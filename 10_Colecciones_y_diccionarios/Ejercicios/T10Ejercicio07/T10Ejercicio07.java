package T10Ejercicio07;

import java.util.ArrayList;

/**
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 
 * @author David Márquez Córdoba
 */
public class T10Ejercicio07 {
  public static void main(String[] args) {
    
    String auxCantidad;
    String auxPosicion;

    boolean continuar;

    //Creamos el arraylist
    ArrayList<Moneda> banco = new ArrayList<Moneda>();

    //Creamos la primera moneda
    Moneda primeraMoneda = new Moneda();

    //Añadimos la primera moneda, que nos servirá para comparar
    banco.add(primeraMoneda);

    //Imprimimos
    System.out.println(primeraMoneda);

    //Iteramos 5 veces
    for (int i = 0; i < 5; i++) {

      //Reiniciamos valor, para que saque monedas hasta que se cumpla alguna de las dos condiciones
      continuar= false;

      do {
        //Creamos segunda moneda
        Moneda segundaMoneda = new Moneda();

        //Almacenamos cada uno de los valores para compararlos mediante equals
        auxCantidad = segundaMoneda.getCantidad();
        auxPosicion = segundaMoneda.getPosicion();

        //Comparamos si se cumplen alguna de las dos condiciones
        if (primeraMoneda.getCantidad().equals(auxCantidad) || primeraMoneda.getPosicion().equals(auxPosicion)) {
          //Si se cumple alguna, añadimos al banco la nueva moneda
          banco.add(segundaMoneda);
          //Damos valos true para que termine el bucle do while
          continuar = true;
          //Imprimimos
          System.out.println(segundaMoneda);
          //Ahora, la primera moneda pasará a ser la segunda, para que se compare con la siguiente.
          primeraMoneda = segundaMoneda;
        }

      } while (!continuar);
    }

    System.out.println("\n***FIN***\n");
  }
}
