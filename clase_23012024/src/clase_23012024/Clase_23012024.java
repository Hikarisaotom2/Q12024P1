package clase_23012024;

import java.util.Scanner;

/**
 * @author Clau
 */
public class Clase_23012024 {
    public static void main(String[] args) {
        //Scanner 
        Scanner entrada  = new Scanner(System.in);
        int nota1 = 0;
        int nota2=0;
        int nota3=0;
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextInt();
         System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextInt();
         System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextInt();
        double sumaNotas = nota1+nota2+nota3;
        double promedio = sumaNotas/3;
        System.out.println("La suma de las notas es "+sumaNotas );
        System.out.println("El promedio de las notas es "+promedio);
   
    }
}
