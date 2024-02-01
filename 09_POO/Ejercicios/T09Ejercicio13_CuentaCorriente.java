public class T09Ejercicio13_CuentaCorriente {

  //Atributo
  private String numero = "";
  private double saldo = 0;

  //Constructores
  public T09Ejercicio13_CuentaCorriente (){
    generarAleatorio();
  }

  public T09Ejercicio13_CuentaCorriente(double saldoInicial){
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  private void generarAleatorio(){
    for (int i = 0; i < 10; i++) {
      //Cuando son String, cuando concatenas, se va acumulando esto es del tema 2
      numero += (int)(Math.random()*10);
    }
  }

  public void ingreso (double cantidad){
    this.saldo += cantidad;
  }

  public void cargo (double cantidad){
    this.saldo -= cantidad;
  }

  public void transferencia (T09Ejercicio13_CuentaCorriente destino, double cantidad){
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return this.saldo;
  }

  @Override
  public String toString() {
    return String.format("Número de cuenta: %s \tSaldo: %.2f",  numero, saldo);
  }

  //Ejercicio
  //Controlar que no se generan dos números de cuentas iguales.
}
