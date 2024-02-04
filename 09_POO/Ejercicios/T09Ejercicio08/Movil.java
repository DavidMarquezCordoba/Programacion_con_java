package T09Ejercicio08;

/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
decimales, puedes utilizar DecimalFormat.
 * 
 * @author David Márquez Córdoba
 */
public class Movil extends Terminal{

  //Hereda tiempo conversacion y numero

  //Atributo
  private String tarifa;
  private double totalGastado;


  //constructores
  public Movil(String numero, String tarifa){
    //Llamo al constructor public Terminal();
    super(numero);
    this.tarifa = tarifa;
    this.totalGastado = 0;
  }

  @Override
  public void llama(Terminal t, int tiempoConversacion){
    super.llama(t, tiempoConversacion);
    double minutos = (double)tiempoConversacion / 60;

    switch (this.tarifa) {
      case "rata":
        totalGastado += minutos * 0.06;
        break;
      case "mono":
        totalGastado += minutos * 0.12;
        break;
      case "bisonte":
        totalGastado += minutos * 0.30;
        break;
      default:
        break;
    }
  }

  @Override
  public String toString() {
    return super.toString() + String.format(" - tarificados %.2f euros", totalGastado);
  }
}
