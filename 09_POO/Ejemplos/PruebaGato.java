public class PruebaGato {
  public static void main(String[] args) {
    
    //Nombre clase + nombre objeto = new + Clase();

    // String nombre, String color, String raza, String sexo, int edad, double peso
    // Gato garfield = new Gato("Garfield", "gris", "milleches", "macho", 3, 7.2);
    // System.out.println(garfield.nombre);


    // Gato kitty = new Gato("Kitty", "negro", "Egipcio", "hembra", 2, 4.2);

    // Gato missy = new Gato("Missy", "blanco", "Romano", "hembra", 7, 3.2);

    // Gato botas = new Gato("Botas", "negro", "Siamés", "macho", 9, 4.2);


    // garfield.come("Pescado");
    // garfield.maulla();
    // garfield.ronronea();

    // //Vamos a pelear
    // garfield.peleaCon(botas); // Macho y Macho
    // garfield.peleaCon(kitty); // macho y hembra
    // kitty.peleaCon(botas); // hembra y macho
    // kitty.peleaCon(missy); // hembra y hembra

    //Vamos a crear gatos con un array
    System.out.println("¿Cuántos gatos quieres crear?");
    int num = Integer.parseInt(System.console().readLine());  
    Gato [] gaticos = new Gato[num];  
    String [] nombres = {"Garfield", "Botas", "Willy", "Pancho", "Misifu"};
    String [] colores ={"Marrón", "negro", "Pardo"};



    for (int i = 0; i < num; i++) {
      
      int nombreAleatorio = (int)(Math.random()*5);
      int coloresAleatorios = (int)(Math.random()*3);

      System.out.println("¿Qué raza desea?");
      String raza = (System.console().readLine());  
      //Llamamos al constructor
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[coloresAleatorios], raza, "Macho", 0, 0);
      System.out.println();
    }

    //Mostrar por pantalla
    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre + " "+gaticos[i].color + " "+gaticos[i].raza);
      System.out.println("");
    }

  }
}
