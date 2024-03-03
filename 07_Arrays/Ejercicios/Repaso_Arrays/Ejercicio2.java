package Repaso_Arrays;

public class Ejercicio2 {

  // Función para generar una tabla con números aleatorios
  public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {
    int[][] tabla = new int[filas][columnas];

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[0].length; j++) {
        tabla[i][j] = (int)(Math.random()*maxAleatorio+1);
      }
    }

    return tabla;
  }

  // Función para generar una tabla introduciendo números manualmente
  public static int[][] generarTablaManual(int filas, int columnas) {
    
    int [][] tabla = new int[filas][columnas];

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[0].length; j++) {
        System.out.print("Introduzca un número:");
        int num = Integer.parseInt(System.console().readLine());
        tabla[i][j] = num;
      }
    }

    return tabla;
  }

  // Función para mostrar la tabla
  public static void mostrarTabla(int[][] tabla) {
    if (tabla == null) {
      System.out.println("Primero debe generar la tabla.");
      return;
    }
    
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[0].length; j++) {
        System.out.printf("%8d", tabla[i][j]);
      }
      System.out.println("");
    }
  }

  // Función para intercambiar dos filas en la tabla
  public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {
    int [] aux = tabla [fila2];

    tabla[fila2] = tabla [fila1];
    tabla[fila1] = aux;
  }

  // Función para intercambiar dos columnas en la tabla
  public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {
    for (int i = 0; i < tabla.length; i++) {
      int aux = tabla[i][col1];
      tabla[i][col1] = tabla[i][col2];
      tabla[i][col2] = aux;
    }
  }

  // Función para sumar los elementos de una fila
  public static int sumarFila(int[][] tabla, int fila) {
    int suma = 0;

    for (int i = 0; i < tabla[fila].length; i++) {
      suma += tabla [fila][i];
    }
    return suma;
  }

  // Función para sumar los elementos de una columna
  public static int sumarColumna(int[][] tabla, int col) {
    int suma = 0;

    for (int i = 0; i < tabla.length; i++) {
      suma += tabla[i][col];
    }

    return suma;
  }


  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas;
    int columnas;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma;
    int colSuma;
    int maxAleatorio;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          System.out.print("\nIntroduzca el número de filas: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("\nIntroduzca el número de columnas: ");
          columnas = Integer.parseInt(System.console().readLine());
          System.out.print("\n¿Cuál será el número máximo aleatorio?: ");
          maxAleatorio = Integer.parseInt(System.console().readLine());
          tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
          break;
        case 2:
          System.out.print("\nIntroduzca el número de filas: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("\nIntroduzca el número de columnas: ");
          columnas = Integer.parseInt(System.console().readLine());
          tabla = generarTablaManual(filas, columnas);
          break;
        case 3:
          mostrarTabla(tabla);
          break;
        case 4:
          System.out.print("Introduzca la fila que quiere cambiar: ");
          fila1 = Integer.parseInt(System.console().readLine());
          System.out.print("Introduzca la fila a sustituir: ");
          fila2 = Integer.parseInt(System.console().readLine());

          intercambiarFilas(tabla, fila1, fila2);
          break;
        case 5:
          System.out.print("Introduzca la primera columna que quiere intercambiar: ");
          col1 = Integer.parseInt(System.console().readLine());
          System.out.print("Introduzca la segunda columna que quiere intercambiar: ");
          col2 = Integer.parseInt(System.console().readLine());
          intercambiarColumnas(tabla, col1, col2);
          break;
        case 6:
          System.out.print("Introduzca la fila que quiere sumar: ");
          filaSuma = Integer.parseInt(System.console().readLine());
          int sumaFila = sumarFila(tabla, filaSuma);
          System.out.println("El resultado de sumar la fila " + filaSuma + " es " + sumaFila);
          break;
        case 7:
          System.out.print("Introduzca la fila que quiere sumar: ");
          colSuma = Integer.parseInt(System.console().readLine());
          int sumaCol = sumarColumna(tabla, colSuma);
          System.out.println("El resultado de sumar la columna " + colSuma + " es " + sumaCol);
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
