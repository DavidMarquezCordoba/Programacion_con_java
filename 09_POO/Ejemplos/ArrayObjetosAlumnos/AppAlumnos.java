package ArrayObjetosAlumnos;

public class AppAlumnos {
  public static void main(String[] args) {

    //Declaración de variables
    int opcionMenu;
    int opcionModificar;
    int opcionEliminar;
    int opcionListado;
    int fichaEspecifica;
    
    //Creamos un array (o lista de alumnos) de 100 alumnos
    Alumno [] listaAlumnos = new Alumno[5];

    //Inicializamos el listado de alumnos
    for (int i = 0; i < listaAlumnos.length; i++) {
      listaAlumnos[i] = new Alumno();
    }
    
    try {
      do {
        System.out.println("\nLISTADO OFICIAL ALUMNOS ALAN TURING");
        System.out.println("====================================\n");
    
        System.out.println("¿Qué desea hacer?\n");
        System.out.println("1. Ver el listado de alumnos existentes");
        System.out.println("2. Añadir nuevo alumno");
        System.out.println("3. Actualizar datos de un alumno ya existente");
        System.out.println("4. Eliminar un alumno");
        System.out.println("5. Salir\n");
    
        System.out.print("Elija una opción: ");
        opcionMenu = Integer.parseInt(System.console().readLine());
  
  
        switch (opcionMenu) {
  
          //LISTADO DE ALUMNOS ////////////////
          case 1:
            do {
              System.out.println("\nLISTADO OFICIAL ALUMNOS ALAN TURING");
              System.out.println("====================================\n");
              System.out.println("¿Qué desea hacer?");
              System.out.println("1. Ver el listado completo");
              System.out.println("2. Ver ficha específica");
              System.out.println("3. Atrás\n");
    
              System.out.print("Elija una opción: ");
              opcionListado = Integer.parseInt(System.console().readLine());
  
              switch (opcionListado) {
  
                //LISTADO GENERAL ***
                case 1:
                  for (int i = 0; i < listaAlumnos.length; i++) {
                    System.out.print("\nFicha #" + (i+1));
                    System.out.println(listaAlumnos[i]);
                  }
                  break;                
                  
                //LISTADO ESPECÍFICO ***
                case 2:
                  System.out.print("\n¿Qué ficha desea ver?: ");
                  fichaEspecifica = Integer.parseInt(System.console().readLine());
  
                  System.out.print("\nFicha #"+(fichaEspecifica));
                  System.out.println(listaAlumnos[fichaEspecifica-1]);
                  break;
  
                default:
                  System.out.println("\nOpción no válida");
                  break;
              }
            } while (!(opcionListado==3));
            break;
  
          //AÑADIR NUEVO ALUMNO ////////////////
          case 2:
  
            for (int i = 0; i < listaAlumnos.length; i++) {
              if (listaAlumnos[i].getCodigoAlumno().equals("LIBRE")) {
  
                listaAlumnos[i].nuevaFicha();
                listaAlumnos[i] = new Alumno(listaAlumnos[i].getCodigoAlumno(), listaAlumnos[i].getNombre(),listaAlumnos[i].getCurso(),listaAlumnos[i].getNotaMedia());
                System.out.println("\nAÑADIDO CORRECTAMENTE");
                break;
              }
            }
            
            break;  
          
          //MODIFICAR ALUMNOS///////////  
          case 3:
            System.out.println("\nMODIFICAR FICHA EXISTENTE");
            System.out.println("==========================\n");
            System.out.print("\n¿Qué ficha desea modificar?: ");
            opcionModificar = Integer.parseInt(System.console().readLine());
  
            if ((opcionModificar >=1)&&(opcionModificar<=100)) {
              
              listaAlumnos[opcionModificar-1].modificar();
  
              listaAlumnos[opcionModificar-1] = new Alumno(listaAlumnos[opcionModificar-1].getCodigoAlumno(),listaAlumnos[opcionModificar-1].getNombre(),listaAlumnos[opcionModificar-1].getCurso() ,listaAlumnos[opcionModificar-1].getNotaMedia() );
  
              System.out.println("\nMODIFICADO CORRECTAMENTE");
  
            } else {
              System.out.println("\nNo existe esa ficha");
            }
            break;
  
          //ELIMINAR ALUMNO //////////////////////////
          case 4:
            System.out.println("\nELIMINAR FICHA ALUMNO");
            System.out.println("======================\n");
            System.out.print("¿Qué ficha desea eliminar?: ");
  
            opcionEliminar = Integer.parseInt(System.console().readLine());
  
            listaAlumnos[opcionEliminar-1].eliminar();

            break;             
            
          default:
            if (opcionMenu >5) {
              System.out.println("\nOpción no válida. Vuelva a intentarlo");
            }
            break;
  
        }
      } while (!(opcionMenu==5));

      System.out.println("\nSaliendo..");
      System.out.println("");

    } catch (NumberFormatException e) {
        System.out.println("");
        System.out.println("ERROR - Solo pueden introducirse números."); 
        System.out.println("Clase de error - "+ e.getClass());
        System.out.println("Mensaje de error - "+e.getMessage());
      } finally {
        System.out.println("Hasta luego");
        System.out.println("");
      }
    
  }
}
