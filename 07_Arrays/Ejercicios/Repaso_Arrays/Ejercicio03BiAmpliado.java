package Repaso_Arrays;

import java.util.Scanner;

public class Ejercicio03BiAmpliado {

  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    //Declaramos array
    int [][] tabla = new int[0][0];
    
    int [] aux;
    int auxCol;

    int fila1Cambiar;
    int fila2Cambiar;

    int col1Cambiar;
    int col2Cambiar;

    int filaMedia;
    int colMedia;

    int posFilaMax = 0;
    int posColMax = 0;
    int posFilaMin = 0;
    int posColMin = 0;

    int columnas;
    int filas;

    int sumaFila;
    int sumaColumna;
    int sumaTotal = 0;

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    int encuentraValor;
    boolean estaElValor = false;

    int opcion;
    boolean salir = false;

    do {
      System.out.println("\nIntroduce una opción");
      System.out.println("1. Crear tabla");
      System.out.println("2. Encontrar los números más altos y bajos de la tabla");
      System.out.println("3. Intercambiar 2 filas");
      System.out.println("4. Intercambiar 2 columnas");
      System.out.println("5. Encontrar un valor en la tabla");
      System.out.println("6. Hacer la media de una fila");
      System.out.println("7. Hacer la media de una columna");
      System.out.println("8. Salir");
      System.out.println("9. Mostrar tabla");
      System.out.println("Opción: ");
      opcion = teclado.nextInt();
  
      switch (opcion) {
        case 1:
          /**
           * Creación de tabla, se pide cuantas filas y columnas
           */
          System.out.print("¿Cuántas filas quiere en la tabla?: ");
          filas = teclado.nextInt();
  
          System.out.print("¿Cuántas columnas quiere en la tabla?: ");
          columnas = teclado.nextInt();
  
          
          tabla = new int[filas][columnas]; 
          
          for (int i = 0; i < tabla.length; i++) {
            
            for (int j = 0; j < tabla[0].length; j++) {
              tabla[i][j]= (int)(Math.random()*91);
              
            }
          }
          break;
  
        case 2:
          /**
           * El número más bajo
           */
          for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
              if (tabla[i][j] > max) {
                max = tabla[i][j];
                posFilaMax = i+1;
                posColMax = j+1;
              }
              if (tabla[i][j] < min) {
                min = tabla[i][j];
                posFilaMin = i+1;
                posColMin = j +1;
              }
            }
          }
  
          
          System.out.println("\n");
          System.out.println("El número más alto encontrado en la tabla es el " + max);
          System.out.println("Está en la Fila " + posFilaMax + " y en la columna " + posColMax);
          System.out.println("");
          System.out.println("El número más bajo encontrado en la tabla es el " + min);
          System.out.println("Está en la Fila " + posFilaMin + " y en la columna " + posColMin);        
          break;  
  
        case 3:
          /**
           * Intercambiar filas
           */
          System.out.print("¿Que fila quiere cambiar?: ");
          fila1Cambiar = teclado.nextInt();

          System.out.print("¿Por cuál?: ");
          fila2Cambiar = teclado.nextInt();

          System.out.println("");
  
          aux = tabla[fila2Cambiar-1];
  
          tabla[fila2Cambiar-1] = tabla[fila1Cambiar-1];
          tabla[fila1Cambiar-1] = aux;

          sumaTotal = 0;

          //Mostramos resultados de tabla y suma de cada fila
          for (int i = 0; i < tabla.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < tabla[0].length; j++) {
              System.out.printf("|%3d ", tabla[i][j]);
              sumaFila += tabla[i][j];
              
            }
            System.out.print("|");
            System.out.printf("%3d ", sumaFila);
            System.out.println("");
          }
          
          for (int i = 0; i < tabla.length; i++) {
            System.out.print("+----");
          }
          System.out.println("+");
  
          //Suma de columna
          for (int j = 0; j < tabla[0].length; j++) {
            sumaColumna = 0;
            
            for (int i = 0; i < tabla.length; i++) {
              sumaColumna+=tabla[i][j];
              
            }
            System.out.printf("%4d", sumaColumna);
            sumaTotal+=sumaColumna;
            System.out.print(" ");
          }
  
          System.out.printf("%4d", sumaTotal);
          break;
  
        case 4:
          /**
           * Intercambiar columnas
           */
          System.out.print("¿Que columna quiere cambiar?: ");
          col1Cambiar = teclado.nextInt();

          System.out.print("¿Por cuál?: ");
          col2Cambiar = teclado.nextInt();

          
          for (int i = 0; i < tabla.length; i++) {
            //-1 para que el usuario no piense que la fila/columna empieza en 0
            auxCol = tabla [i][col2Cambiar-1];
            tabla[i][col2Cambiar-1] = tabla [i][col1Cambiar-1];
            tabla [i][col1Cambiar-1] = auxCol;
          }

          break;  
  
        case 5:
          
          /**
           * Encotnrar valor en la tabla
           */
          System.out.print("¿Qué valor desea buscar?: ");
          encuentraValor = teclado.nextInt();

          estaElValor = false; //Reinicio de valor

          for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
              if (tabla[i][j] == encuentraValor) {
                estaElValor = true;
                //Reutilizo las variables que se usaron para saber en que fila y que columna está el máximo y el mínimo, para no crear otra
                posFilaMax = i+1;
                posColMax = j+1;
              }
            }
          }

          if (estaElValor) {
            System.out.println("El valor " + encuentraValor + " está en la fila " +(posFilaMax) + " y columna " + (posColMax));
          } else {
            System.out.println("El valor solicitado no se encuentra en la tabla de valores.");
          }  

          break;
  
        case 6:
        /**
         * Hacer la media de una fila
         */
          System.out.print("\n¿Que fila desea hacer la media?: ");
          filaMedia = teclado.nextInt();

          int mediaDeLaFila = 0;

          
          for (int j = 0; j < tabla[0].length; j++) {
            mediaDeLaFila += tabla[filaMedia-1][j];
          }

          System.out.println("La media de la fila " + (filaMedia) + " es " + (mediaDeLaFila/tabla[0].length));

          break;
  
        case 7:
          /**
           * Hacer la media de una columna
           */
          System.out.print("\n¿A que columna desea hacer la media?: ");
          colMedia = teclado.nextInt();

          int mediaDeLaColumna = 0;

          for (int i = 0; i < tabla.length; i++) {
            mediaDeLaColumna+= tabla[i][colMedia-1];
          }

          System.out.println("La media de la fila " + (colMedia) + " es " + (mediaDeLaColumna/tabla.length));
          break;  
          
        case 8:
        /**
         * Salir del programa
         */
          System.out.println("Saliendo..");
          salir = true;
          break;  

        case 9:
        /**
         * Mostrar la tabla creada
         */
          System.out.println("\nMostrando tabla..");
          System.out.println("");

          sumaTotal = 0;
          //Mostramos resultados de tabla y suma de cada fila
          for (int i = 0; i < tabla.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < tabla[0].length; j++) {
              System.out.printf("|%3d ", tabla[i][j]);
              sumaFila += tabla[i][j];
              
            }
            System.out.print("|");
            System.out.printf("%3d ", sumaFila);
            System.out.println("");
          }
  
          for (int i = 0; i < tabla.length; i++) {
            System.out.print("+----");
          }
          System.out.println("+");
  
          //Suma de columna
          for (int j = 0; j < tabla[0].length; j++) {
            sumaColumna = 0;
            
            for (int i = 0; i < tabla.length; i++) {
              sumaColumna+=tabla[i][j];
              
            }
            System.out.printf("%4d", sumaColumna);
            sumaTotal+=sumaColumna;
            System.out.print(" ");
          }
  
          System.out.printf("%4d", sumaTotal);
          System.out.println("");
            
          break;          
        default:
          break;
      }  
    } while (!salir);

    
    teclado.close();
  }
}

