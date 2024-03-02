package EjercicioPuntuable;

import java.util.ArrayList;
import java.util.HashMap;

public class MainCapitales {

  public static void main(String[] args) {
    
    ArrayList<String> respuestaIncorrecta = new ArrayList<String>();

    HashMap<String, String> paisCiudad = new HashMap<>();

    paisCiudad.put("Albania", "Tirana");
    paisCiudad.put("Alemania", "Berlín");
    paisCiudad.put("Andorra", "Andorra La Vieja");
    paisCiudad.put("Armenia", "Ereván");
    paisCiudad.put("Austria", "Viena");
    paisCiudad.put("Azerbaiyán", "Bakú");
    paisCiudad.put("Bélgica", "Bruselas");
    paisCiudad.put("Bielorrusia", "Minsk");
    paisCiudad.put("Bosnia y Herzegovina", "Sarajevo");
    paisCiudad.put("Bulgaria", "Sofía");



    for (int i = 0; i < 10; i++) {
      int aleatorio = (int)(Math.random()*1);

      System.out.println("¿Cuál es la capital de " + paisCiudad.get(aleatorio)+"?");
      // System.out.println("1. " + paisCiudad.get);
    }
  }
}
