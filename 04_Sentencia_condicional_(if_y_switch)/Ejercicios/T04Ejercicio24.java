/*
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:

      • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
      de proyecto), los días que ha estado de viaje visitando clientes durante el
      mes y su estado civil (1 - Soltero, 2 - Casado).
      
      • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
      si se trata de un prog. junior, un prog. senior o un jefe de proyecto
      respectivamente.
      
      • Por cada día de viaje visitando clientes se pagan 30 euros extra en
      concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
      un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio24 {
  public static void main(String[] args) {
    
    int cargo;
    double sueldoBase = 0;
    double sueldoBruto = 0;
    double retencion = 0;
    String sRetencion = "";
    double sueldoNeto = 0;

    int dieta = 30;
    int diasDeViaje;
    double totalGanadoEnDiasDeViaje;

    int estadoCivil;

    Scanner teclado = new Scanner(System.in);

    System.out.println("+----------------------+");
    System.out.println("|1. Programador junior |");
    System.out.println("|2. Programador senior |");
    System.out.println("|3. Jefe de proyecto   |");
    System.out.println("+----------------------+");
    System.out.print("Introduzca el cargo del empleado (1-3): ");
    cargo =teclado.nextInt();
    System.out.println("");
    System.out.println("");
    
    if (cargo == 1 || cargo == 2 || cargo ==3) {
      System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
      diasDeViaje = teclado.nextInt();
      System.out.println("");
      System.out.println("");
      
      if (diasDeViaje>=0) {
        System.out.print("Introduzca su estado civil (1 - Soltero, 2- Casado): ");
        estadoCivil = teclado.nextInt();
        System.out.println("");
        System.out.println("");

        ////////////////////////////////
        totalGanadoEnDiasDeViaje = diasDeViaje * dieta;

        switch (cargo) {

          //Junior
          case 1:

            sueldoBase = 950;
            sueldoBruto = sueldoBase + totalGanadoEnDiasDeViaje;

            switch (estadoCivil) {
              //Soltero
              case 1:
                sRetencion = "25%";
                retencion = sueldoBruto * 0.25;
                sueldoNeto = sueldoBruto - retencion;
                break;
              //Casado
              case 2:
                sRetencion ="20%";
                retencion = sueldoBruto * 0.20;
                sueldoNeto = sueldoBruto - retencion;                
                break;            
            }

            break;
        
          //Senior
          case 2:

            sueldoBase = 1200;
            sueldoBruto = sueldoBase + totalGanadoEnDiasDeViaje;

            switch (estadoCivil) {
              //Soltero
              case 1:
                sRetencion = "25%";
                retencion = sueldoBruto * 0.25;
                sueldoNeto = sueldoBruto - retencion;
                break;
              //Casado
              case 2:
                sRetencion ="20%";
                retencion = sueldoBruto * 0.20;
                sueldoNeto = sueldoBruto - retencion;                
                break;            
            }         
            break;

          //Jefe Proyecto
          case 3:

            sueldoBase = 1600;
            sueldoBruto = sueldoBase + totalGanadoEnDiasDeViaje;

            switch (estadoCivil) {
              //Soltero
              case 1:
                sRetencion = "25%";
                retencion = sueldoBruto * 0.25;
                sueldoNeto = sueldoBruto - retencion;
                break;
              //Casado
              case 2:
                sRetencion ="20%";
                retencion = sueldoBruto * 0.20;
                sueldoNeto = sueldoBruto - retencion;                
                break;            
            }      
            break;
        }

        //Salida por pantalla

        System.out.println("+--------------------------------+");
        System.out.printf("| Sueldo base          %-2.2f   |\n", sueldoBase);
        System.out.printf("| Dietas (%d viajes)     %-2.2f   |\n", diasDeViaje, totalGanadoEnDiasDeViaje);
        System.out.printf("|--------------------------------|\n");
        System.out.printf("| Sueldo bruto         %-2.2f   |\n", sueldoBruto);
        System.out.printf("| Retención IRPF(%s)   %-8.2f |\n", sRetencion, retencion);
        System.out.printf("|--------------------------------|\n");
        System.out.printf("| Sueldo neto          %-2.2f   |\n", sueldoNeto);
        System.out.println("+--------------------------------+");

        ///////////////////////////////
      } else {
        System.out.println("Introduce días válidos");
      }
    } else {
      System.out.println("Introduzca un cargo válido");
    }
    

  
  
  


  }
}
