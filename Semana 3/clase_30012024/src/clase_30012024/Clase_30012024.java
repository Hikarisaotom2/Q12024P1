package clase_30012024;

import java.util.Scanner;

public class Clase_30012024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        do {
//            Scanner entrada = new Scanner(System.in);
//            System.out.println("Bienvenido al programa: ");
//            System.out.println("1) Ejercicio 1 ");
//            System.out.println("2) Ejercicio 2 ");
//            System.out.println("3) Salir");
//            int op = entrada.nextInt();
//            if (op == 1) {
//                System.out.println("Primer ejercicio");
//            } else if (op == 2) {
//                System.out.println("Segundo ejercicio");
//            } else if (op == 3) {
//                System.out.println("Saliendo del programa...");
//                break;
//            }
//        } while (true);
//        boolean bandera = true;
//        while (bandera) {
//             Scanner entrada = new Scanner(System.in);
//            System.out.println("Bienvenido al programa: ");
//            System.out.println("1) Ejercicio 1 ");
//            System.out.println("2) Ejercicio 2 ");
//            System.out.println("3) Salir");
//            int op = entrada.nextInt();
//            if (op==1) {
//                System.out.println("Ejercicio 1");
//            }else if(op==2){
//                System.out.println("Ejercicio 2");
//            }else if(op==3){
//                System.out.println("Saliendo del programa");
//                bandera = false;
//            }else{
//                System.out.println("Opcion no valida");
//            }
//        }

//        int op = 0;
//        while (op!=3) {
//             Scanner entrada = new Scanner(System.in);
//            System.out.println("Bienvenido al programa: ");
//            System.out.println("1) Ejercicio 1 ");
//            System.out.println("2) Ejercicio 2 ");
//            System.out.println("3) Salir");
//            op = entrada.nextInt();
//            if (op==1) {
//                System.out.println("Ejercicio 1");
//            }else if(op==2){
//                System.out.println("Ejercicio 2");
//            }else if(op==3){
//                System.out.println("Saliendo del programa");
//            }else{
//                System.out.println("Opcion no valida");
//            }
//        }
        /*
        Cree un programa que haga divisiones, pero debe validar los numeros o datos ingresados por el usuario. 
         */
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese un valor para el numerador: ");
//        double  numerador = entrada.nextDouble();
//        double  denominador = 0;
//        while(denominador==0){
//            System.out.println("Ingrese un valor para el denominador: ");
//            System.out.println("El denominador debe ser diferente de 0");
//            denominador = entrada.nextDouble();
//        }
//         double resp = numerador / denominador;
//        System.out.println("El resultado es: "+resp);
//        
//        if(denominador==0){
//            System.out.println("El denominador no puede ser 0 ");
//        }else{
//             double resp = numerador / denominador;
//        System.out.println("El resultado es: "+resp);
//        }


//      switch (valor) {
//            case 1: {
//                System.out.println("Ejercicio 1");
//                break;
//            }
//            case 2: {
//                System.out.println("Ejercicio 2");
//                break;
//            }
//            case 3: {
//                System.out.println("Saliendo del programa...");
//                break;
//            }
//            default :{
//                System.out.println("Opcion no valida");
//            }
//        }
      
        System.out.println("Ingrese un valor ");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        //1,2,3
        switch (valor) {
            case 1-> {
                System.out.println("Ejercicio 1");
            }
            case 2 ->  {
                System.out.println("Ejercicio 2");
            }
            case 3 ->  {
                System.out.println("Saliendo del programa...");
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
        
        
    }//main

}//clase 
