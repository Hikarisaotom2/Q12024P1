package clase_05_02_2024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_05_02_2024 {

    public static void main(String[] args) {
       /*
        Un programa donde ingresaremos
    el estado de aprobación (aprobado
    o reprobado) de 10 estudiantes y
    contaremos cuantos aprobaron y
    cuanto reprobaron. Si aprobaron
    mas de 8 estudiantes entonces le
    daremos un bono al instructor.
            */
       
       Scanner entrada = new Scanner(System.in);
       int aprobados=0;
       int reprobados=0;
       int estudiantes =0;
       
        while (estudiantes<10) {
            System.out.println("Ingrese el estado de aprobacion para el estudiante: 1- aprobado, 2- reprobado");
            int estado = entrada.nextInt();
            switch (estado) {
                case 1 ->{
                    aprobados++;
                    estudiantes++;
                }
                case 2->{
                    reprobados++;
                    estudiantes++;
                }
                default ->{
                    System.out.println("Estado no valido, inentelo de nuevo.");
                }
            }//fin del switch             
        }//fin del while 
        System.out.println("Estudiante aprobados: "+aprobados);
        System.out.println("Estudiantes reprobados: "+reprobados);
        if(aprobados>8){
            System.out.println("Bono para el instructor");
        }else{
            System.out.println("No hay bono :( ");
        }//fin del if .
        
        
        
        
        /*CICLO FOR*/
        //<, >, >=, <=, ==
       for(int i=0;i<2;i++){
           System.out.println("Hola mundo");
               
       }//fin del for 
        
        
        
    }//fin del main.
}//fin de la clase. 
