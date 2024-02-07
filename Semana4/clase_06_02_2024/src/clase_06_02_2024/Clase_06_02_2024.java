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
        palabra.charAt(0);
        palabra.charAt(2);   
        H -> 72 
        o -> 97;
        */
        
        System.out.println("Ingrese una palabra ");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        int tamano = palabra.length();
        int ultimaPos = tamano-1;
        String palabraReversa= "";
        for (int i = ultimaPos; i>=0; i--) {
           // System.out.println("Valor de i: "+i+"Letra en la pos i: "+palabra.charAt(i ));
            //System.out.println("");
            //System.out.print(palabra.charAt(i ));
            //palabraReversa = palabraReversa+palabra.charAt(i);
            palabraReversa+=palabra.charAt(i);
            
        }
        System.out.println("La palabra al reves es: "+palabraReversa);

                
        System.out.println("Codigos Ascii de las letras ");
        int ejemplo ='@';
        System.out.println("el ejemplo es "+ejemplo);
        
        for (int i = 0; i <=ultimaPos ; i++) {
            //Casteo
            int codigo = palabra.charAt(i);
            
            System.out.println(palabra.charAt(i)+"->"+ codigo);
        }
        
    }
    
}
