/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_31012024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_31012024 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingrese un anno: ");
            int anno = input.nextInt();
        
            if (anno < 1) {
                System.out.println("Anno invalido :(");
                System.out.println("Intente otra vez");
                System.out.println("");
                continue;
            } else {
                System.out.println("Anno validado :)");
                System.out.print("Ingrese un mes: ");
                byte mes = input.nextByte();
                if (mes < 1 || mes > 12) {
                    System.out.println("Mes invalido :(");
                    System.out.println("Intente otra vez");
                    System.out.println("");
                    continue;
                } else {
                    System.out.println("Mes validado :)");
                    switch (mes) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12: {
                            System.out.println("Este mes, de este anno, tiene 31 dias");
                            break;
                        }
                        case 4:
                        case 6:
                        case 9:
                        case 11: {
                            System.out.println("Este mes, de este anno, tiene 30 dias");
                            break;
                        }
                        case 2: {
                            if (anno % 4 == 0) {
                                System.out.println("Este mes, de este anno, tiene 29 dias");
                                break;
                            } else {
                                System.out.println("Este mes, de este anno, tiene 28 dias");
                                break;
                            }
                        
                        }    
                    }
                }
            }
        }
    }
    
}
