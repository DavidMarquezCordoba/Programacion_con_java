package T09Ejercicio13;
/**
 * Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número
de cuenta de 10 dígitos. Para simplificar, el número de cuenta se genera de
forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con
un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. También es posible hacer
una transferencia entre una cuenta y otra. Se permite el saldo negativo. En
el siguiente capítulo se propone un ejercicio como mejora de éste, en el que se
pide llevar un registro de los movimientos realizados.
 * 
 * @author David Márquez Córdoba
 */

public class T09Ejercicio13 {
  public static void main(String[] args) {
    T09Ejercicio13_CuentaCorriente cuenta1 = new T09Ejercicio13_CuentaCorriente();
    T09Ejercicio13_CuentaCorriente cuenta2 = new T09Ejercicio13_CuentaCorriente(1500);
    T09Ejercicio13_CuentaCorriente cuenta3 = new T09Ejercicio13_CuentaCorriente(6000);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
    cuenta1.ingreso(2000);
    cuenta2.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    cuenta2.transferencia(cuenta3, 100);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
  }
}
