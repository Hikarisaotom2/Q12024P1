
package clase_14_02_2024_repaso;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_14_02_2024_Repaso {

    public static void main(String[] args) {
       /*
        1) Utilizar metodos.
        2) Validar cuando se crea que es necesario 
        3) Buenas practicas de programación. 
        */
     
       menu();
    }
    
    public static void menu(){
       boolean bandera = true;
       Scanner entrada = new Scanner(System.in);
        while (bandera) {
            System.out.println("Menú");
            System.out.println("1. Palabras ");
            System.out.println("2. Salir.");
            int opcionValidada = LeerOpcionDelMenu();
            switch (opcionValidada) {
                case 1->{
                    System.out.println("Ejercicio de las palabras. ");
                    System.out.println("Ingrese una cadena: ");
                    String cadena= entrada.nextLine();
                    String cadenaComprimida= comprimirCadena(cadena);
                    System.out.println("El resultado de comprimir la cadena es: "+cadenaComprimida);
               //    comprimirCadena("aaabbbccddd");
                }
                case 2->{
                    System.out.println("Saliendo del menú, gracias. ");
                    bandera = false;
                } 
            }
          
        }
    }
    
    //1. que nos pasen una cadena 
    public static String comprimirCadena(String cadena){
        /*
        1ra pos: 0
        ultima pos: length-1
        */
         /*
            Cree un algoritmo que comprima una cadena reemplazando las repeticiones de caracteres
           con el caracter y el número de repeticiones. Debe crear un método.
           Ejemplos
           Ingrese cadena: aabbbdd -> Siempre van a tener esta estructura
           Cadena comprimida: a2b3d2
    */
         int contadorLetra =0;
         String acumuladorPalabraFinal ="";
         char letraAContar =cadena.charAt(0);
         
        for (int i = 0; i <= cadena.length()-1; i++) {
            char letra  = cadena.charAt(i);
            if(letra == letraAContar){
                contadorLetra++;
//                System.out.println(letraAContar+ " "+ contadorLetra);
            }else{
                acumuladorPalabraFinal = acumuladorPalabraFinal+letraAContar+contadorLetra;
                letraAContar = letra;
                contadorLetra = 1;
                //System.out.println("Valor actual de acumuladorPalabraFinal "+ acumuladorPalabraFinal);
//                 System.out.println(letraAContar+ " "+ contadorLetra);
            }
        }
        acumuladorPalabraFinal = acumuladorPalabraFinal+letraAContar+contadorLetra;
       //  System.out.println("Valor actual de acumuladorPalabraFinal "+ acumuladorPalabraFinal);
         //Aqui ya tenemos el resultado de comprimir la cadena. 
         return acumuladorPalabraFinal;
    }
    public static  int LeerOpcionDelMenu(){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese su opción: ");
         int opcion = entrada.nextInt();
            while ( opcion<1 || opcion>2) {
                System.out.println("Valor invalido, ingrese una opcion del menú: ");
                opcion = entrada.nextInt();
            }
            //al estar aqui se que el valor esta validado. 
            return opcion;
    }
    
}
