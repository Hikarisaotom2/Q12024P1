/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication76;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class JavaApplication76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      ImprimirMensajes();
//      System.out.println("Hola, este sout esta fuera del main");
//      ImprimirMensajes();
//        Scanner entrada = new Scanner(System.in); 
//        System.out.println("Ingrese el número de cuenta");
//        int numero = entrada.nextInt();
//        System.out.println("Ingrese la cantidad");
//        double dinero = entrada.nextDouble();
//        System.out.println("Ingrese la identidad");
//        entrada.nextLine();
//        String identidad = entrada.nextLine();
//        SimularDeposito(identidad,numero,dinero);
//        SimularDeposito("0801180000567",1234567,500.20);
//        SimularDeposito(identidad,1234567,dinero);

        int numeroValidado= LeerNumeroValidado();
         int numeroValidado2= LeerNumeroValidado();
         System.out.println("el resultado es "+ (numeroValidado+numeroValidado2));

    }// Main 

    /*Métodos*/
    //Void 
    public static void ImprimirMensajes() {
        /*Primer metodo*/
        System.out.println("Menu ");
        System.out.println("Opcion 1 ");
        System.out.println("Opcion 2 ");
        System.out.println("Opcion 3 ");
    }

    /*
    String Identidad, int Numero de cuenta , double Dinero 
     */
    public static void SimularDeposito(String identidad, int numero, double dinero) {
        System.out.println(identidad + "Depositó " + dinero + ":  al numero de cuenta " + numero);
    }

    //Crear un método ue lea y valide que un numero(Entero) sea mayor a 0. 
    public static int LeerNumeroValidado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        while (numero <= 0) {
            System.out.println("Valor invalido, ingrese un numero mayor a 0: ");
            numero = entrada.nextInt();
        }
        /* En este punto, se que si estamos fuera del ciclo,
            signfiica que es por que el numero esta validado.*/
        // En la variable numero, se encuentra el numero validado. 
        // return /*valor*/;
        return numero;
    }

}//fin de la Clase
