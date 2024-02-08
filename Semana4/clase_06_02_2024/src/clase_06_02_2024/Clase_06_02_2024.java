package clase_06_02_2024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_06_02_2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que recibe una palabra e
        imprima la misma pero al revés:
        ejemplo:
        Ingresamos la palabra “Hola”
        Resultado: a l o H 
        palabra = H O L A 
                  0 1 2 3 <- tamano-1
        palabra.charAt(0); -> H
        palabra.charAt(2);   -> 
        palabra.charAt(8); ->OutOfBounds 0...3
        H -> 72 
        o -> 97;
        */
        
        System.out.println("Ingrese una palabra ");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        int tamano = palabra.length();
        int ultimaPos = tamano-1;
        String palabraReversa= "";  //Acumulador de strings 
       
        for (int i = ultimaPos; i>=0; i--) {
           // System.out.println("Valor de i: "+i+"Letra en la pos i: "+palabra.charAt(i ));
            //System.out.println("");
            //System.out.print(palabra.charAt(i ));
            //palabraReversa = palabraReversa+palabra.charAt(i);
            palabraReversa+=palabra.charAt(i);
            
        }
        System.out.println("La palabra al reves es: "+palabraReversa);

                
        System.out.println("Codigos Ascii de las letras ");
        int ejemplo ='/';
        int codigoAscii = (int)'/';
        int codigoAscii2 = Integer.parseInt("12345"); //Convertir el string 12345 al numero entero 12,354
        System.out.println("La primera forma para convertir es  "+ejemplo);
        System.out.println("La segunda forma para convertir es "+ codigoAscii);
        System.out.println("La tercera forma de convertir  es "+ codigoAscii2);
        for (int i = 0; i <=ultimaPos ; i++) {
            //Casteo
            //Caracter -> codio ascii (numero entero)
            int codigo = palabra.charAt(i);
            int asciiCode = (int) palabra.charAt(i);
            System.out.println(palabra.charAt(i)+"->"+ codigo);
            System.out.println(palabra.charAt(i)+"->"+ asciiCode);
        }
        
        for (int i = 250; i < 270; i++) {
            //Numero entero (codigo ascii) -> caracter 
            char caracter = (char)i;
            System.out.println(i+ " es el caracter " +caracter);
        }
 
    }
    
}
