package T09Ejercicio02;

public class Coche extends Vehiculo{


  //Atributos 
  private int kilometrajeCoche;

  //Guetter
  public int getKilometrajeCoche() {
    return kilometrajeCoche;
  }  

  //Constructor
  public Coche(int kilometrajeCoche) {
    super();
    this.kilometrajeCoche = kilometrajeCoche;
  }

  //Métodos de Coche

  public void andaCoche(){
    System.out.println("\n**Brrrr, brrummmmm**\n");
  }

  public void quemaRuedaCoche(){
    System.out.println("\n**Ñiiiiiiii, ñiiiiiii**\n");
  }


}
