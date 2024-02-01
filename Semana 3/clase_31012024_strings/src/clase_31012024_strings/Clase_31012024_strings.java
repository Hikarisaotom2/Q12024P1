package clase_31012024_strings;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_31012024_strings {

    public static void main(String[] args) {
        // TipoDeDato nombreVariable = valorInicial;
        // " Para los strings 
        // ' para los chars
        String nombre = "Claudia Cortés";
        char caracter = 'a';
        Scanner entrada = new Scanner(System.in);
        boolean continuar=true;
        while (continuar) {
            System.out.println("Bienvenido al programa de practica");
            System.out.println("1) next() vs nextLine()");
            System.out.println("2) equals vs equalsIgnoreCase");
            System.out.println("3) Concatenacion de strings");
            System.out.println("4) Length de una cadena ");
            System.out.println("5) Mayusculas y minusculas");
            System.out.println("6) CharAt");
            System.out.println("Salir");
            int op = entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1 -> {
                    System.out.println("Next vs nextLine");
                    //       next()->H@l0.; mundo;
                    //       nextLine()-> H@l0.; mundo; salto de linea
                    System.out.println("Ingrese un texto: ");
                    String texto = entrada.next();
                    System.out.println("El texto ingresado fue: " + texto);

                    System.out.println("Ingrese una oracion: ");
                    String oracion = entrada.nextLine();
                    System.out.println("El texto ingresado fue: " + oracion);

                //        System.out.println("Ingrese un numero para ver como el scanner se buggea: ");
                //        int x = entrada.nextInt();
                //        System.out.println("el valor de x: "+x);
                //        System.out.println("Ingrese un texto, si es que el scanner lo deja");
                //        String cadenaTriste = entrada.nextLine();
                //        System.out.println("El valor en cadena triste:"+cadenaTriste);
                }
                case 2 -> {
                    System.out.println("equals vs equalsIgnoreCase");
                    System.out.println("Ingrese la primera palabra: ");
                    String palabra1 = entrada.nextLine();
                    System.out.println("Ingrese la segunda palabra");
                    String palabra2 = entrada.nextLine();

                    //palabra1-> Hola
                    //palabra2-> hola
                    // palabra1.equals(palabra2) -> FALSE
                    //palabra1.equalIgnoreCase(palabra2) ->TRUE
                    if (palabra1.equals(palabra2)) {
                        System.out.println("Son iguales segun el equals");
                    }else{
                        System.out.println("Son diferentes segun el equals");
                    }

                    if (palabra1.equalsIgnoreCase(palabra2)) {
                        System.out.println("Son iguales segun el equalsIgnoreCase");
                    }else{
                          System.out.println("Son diferentes segun el equalsIgnoreCase");
                    }
                }
                
                case 3->{
                    System.out.println("Concatenacion");
                    String palabra1 = "Mi nombre es";
                    String palabra2 = "Claudia Cortés";
                    String acumulador = palabra1+" "+palabra2;
                    System.out.println("El resultado de la concatenacion fue: "+acumulador);
                }
                
                case 4->{
                    System.out.println("Length de un string");
                    //Claudia -> 7 
                    // Hola -> 4 
                    // 47!@#lop -> 8 
                    //Hola mundo ->10 
                    System.out.println("Ingrese una cadena");
                    String cadena = entrada.nextLine();
                    int tamano = cadena.length();
                    System.out.println("El tamano es: "+tamano);
                }
                case 5->{
                    System.out.println("Mayusculas y menisculas");
                    System.out.println("Ingrese una cadena: ");
                    String cadena = entrada.nextLine();
                    //Todo a mayusculas.
                    String nuevaCadena= cadena.toUpperCase();
                    System.out.println("La cadena original sigue siendo la misma, ejemplo: "+cadena);
                    System.out.println("Asi se veria la cadena en mayusculas "+nuevaCadena);
                    //Todo a minusculas
                    String nuevaCadenaMinuscula= cadena.toLowerCase();
//                    cadena = cadena.toLowerCase();
                      System.out.println("La cadena original sigue siendo la misma, ejemplo: "+cadena);
                    System.out.println("Asi se veria la cadena en minusculas "+nuevaCadenaMinuscula);
                }
                
                case 6 ->{
                    System.out.println("Chart At");
                    System.out.println("Ingrese una cadena: ");
                    String cadena = entrada.nextLine();
                    //Pez 
                    // 0..2
                    //0,1,2
                    int ultimaPos = cadena.length()-1;
                    System.out.println("Lo que hay en la pos 0 es "+ cadena.charAt(0));
                    System.out.println("Lo que hay en la pos "+ultimaPos+" es "+ cadena.charAt(ultimaPos));
                    
                }
                default ->{
                  continuar= false;
                }   
            }
        }
    }

}
