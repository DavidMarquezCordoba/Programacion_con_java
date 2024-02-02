/**
 * Main pra probar la herencia de persona en estudiante
 * 
 * @author David Márquez Córdoba
 */

public class AppPersonaEstudiante {

  public static void main(String[] args) {
    
    Persona p = new Persona("Pepe Rodriguez", 30, "123455689B");
    Estudiante e = new Estudiante("Lucía Fernandez", 18, "1239383F");
    Profesor pf = new Profesor("Sergio", 34, "92929383S", "Informatica", 10000.3);

    //Forma 1
    // p.mostrarDatos();
    // e.mostrarDatos();

    System.out.println(p.toString());
    System.out.println(p);

    System.out.println(e.toString());
    System.out.println(e);

    System.out.println(pf.toString());
    System.out.println(pf);
  }
}
