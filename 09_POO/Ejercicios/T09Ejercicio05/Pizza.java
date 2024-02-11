package T09Ejercicio05;
/**
 * Clase Pizza
 * 
 * @author David Márquez Córdoba
 */

public class Pizza {

  //Atributos de clase
  private static int totalPedidas = 0;
  private static int totalServidas = 0;


  //Atributo
  private String tipoPizza;
  private String size;
  private String estado;

  //Getters/////////////
  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public String getTipoPizza() {
    return tipoPizza;
  }

  public String getSize() {
    return size;
  }

  public String getEstado() {
    return estado;
  }

  //Constructor
  public Pizza(String tipoPizza, String size) {
    this.tipoPizza = tipoPizza;
    this.size = size;
    //Inicializamos cada vez que hagamos una pizza esté "pedida"
    this.estado="PEDIDA";
    //Aumentamos el total de pizzas creadas
    Pizza.totalPedidas++;

  }  

  //Métodos

  public void sirve(){
    if (estado.equals("PEDIDA")) {
      this.estado = "servida";
      //Si está servida, aumentamos el contador
      Pizza.totalServidas++;
    } else {
      System.out.println("Lo siento, la pizza está pedida");
    }
  }


  @Override
  public String toString() {
    return "Pizza [tipoPizza=" + tipoPizza + ", size=" + size + ", estado=" + estado + "]";
  }


}
