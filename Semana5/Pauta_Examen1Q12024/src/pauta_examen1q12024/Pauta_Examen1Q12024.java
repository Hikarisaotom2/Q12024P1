package pauta_examen1q12024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Pauta_Examen1Q12024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera = true;
       String historial="";
        while (bandera) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("1- ejercicio 1 version 1 ");
            System.out.println("2- ejercicio 1 version 2");
            System.out.println("3-  Historial");
            System.out.println("4 - Salir");
            int op = entrada.nextInt();
            switch (op) {
                case 1->{
                    historial += "Ejercicio 1 - ";
                     System.out.println("EJERCICIO VERSION 1 ");
                    String cadena = leerCadenaValidada(3);
                    String resp = Ejercicio1(cadena);
                    System.out.println("RESULTADOS: "+resp);
                }
                case 2 ->{
                     historial += "Ejercicio 2 - ";
                      System.out.println("EJERCICIO VERSION 2 ");
                        String cadenaVersion2 = leerCadenaValidada(8);
                        String resp_version2 = Ejercicio1_version2(cadenaVersion2);
                        System.out.println("RESULTADOS: "+resp_version2);
                }
                case 3 ->{
                    System.out.println("HISTORIAL......");
                    System.out.println(historial);
                }
                case 4 ->{
                    System.out.println("Salir...");
                    bandera=false;
                }
                default->{
                    System.out.println("Opcion no valida");
                }
                    
            }// fin del swift 
        }// fin del while 
       
    }// fin del main

    public static String leerCadenaValidada(int tamMaximo) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = entrada.nextLine();
        while (cadena.length() < tamMaximo) {
            System.out.println("Ingrese una cadena de tamaño"+tamMaximo);
            cadena = entrada.nextLine();
        }
        return cadena;
    }// fin del metodo

    public static String Ejercicio1(String cadena) {
        String resp = "";
        if (cadena.length() % 2 != 0) {// Imp[ar 
            String nuevaCadena = leerCadenaValidada(3);
            String concatenacion = cadena + nuevaCadena;
            System.out.println("La primera cadena " + cadena);
            System.out.println("La segunda cadena " + nuevaCadena);
            System.out.println("Cadena concatenada: " + concatenacion);
            System.out.println("El tamaño es " + concatenacion.length());
            resp = concatenacion;
        } else {//par 
            int mitad = cadena.length() / 2;
            String primeraMitad = cadena.substring(0, mitad);
            String segundaMiatad = cadena.substring(mitad);
            String nuevaCadena = "";
            System.out.println("Primera mitad " + primeraMitad);
            System.out.println("Segunda mitad " + segundaMiatad);
            for (int i = 0; i < cadena.length(); i++) {
                if (i <= mitad) {
                    nuevaCadena += cadena.charAt(i) + "-";
                } else if (i > mitad && i < cadena.length() - 1) {
                    nuevaCadena += cadena.charAt(i) + "/";
                } else {
                    nuevaCadena += cadena.charAt(i);
                }
            }// fin del for 
            resp = nuevaCadena;
        }//fin del if
        return resp;
    }//fin del metodo 
    
    
    
    public static String Ejercicio1_version2(String cadena){
        String resp = "";
        if(cadena.length()%2 !=0){ // impar 
            int mitad = cadena.length()/2;
            String primeraMitad = cadena.substring(0,mitad);
            String segundaMitad = cadena.substring(mitad);
            System.out.println("Primera mitad: "+primeraMitad);
            System.out.println("Segunda mitad: "+segundaMitad);
            String nuevaCadena = segundaMitad+primeraMitad;
            System.out.println("El resultado es: "+nuevaCadena);
            resp = nuevaCadena;
        }else{ //par 
              int mitad = cadena.length()/2;
            String primeraMitad = cadena.substring(0,mitad);
            String segundaMitad = cadena.substring(mitad);
            String nuevaCadena = "";
            for (int i = 0; i <mitad; i++) {
                nuevaCadena+=primeraMitad.charAt(i)+"-";
                nuevaCadena+=segundaMitad.charAt(i)+"-";
            }
             resp = nuevaCadena;
        }//fin del if
        return resp;
    }
}// fin de la clase 
