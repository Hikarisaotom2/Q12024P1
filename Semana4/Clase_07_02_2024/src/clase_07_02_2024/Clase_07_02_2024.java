package clase_07_02_2024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_07_02_2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        _ _ _ _ _ _ _ _ _ _ _ _
        _______________________
        ***********************
        -----------------------
        .......................

        * * * * 
        * * * * 
        * * * * 
        * * * * 
         */
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese el tamano de la linea:  ");
//        int tamano = entrada.nextInt();
//        for (int i = 0; i <tamano ; i++) {
//            for (int j = 0; j < tamano; j++) {
//                System.out.print("_ ");
//            }
//            System.out.println("");
//        }
//        boolean bandera = true;
//        int repetir = 8;
//        while (repetir>0) {
//            for (int i = 0; i < tamano; i++) {
//                System.out.print("_ ");
//            }
//            System.out.println("");
//            repetir--;
//        }

        /*
    Leer desde la consola un valor, 
    El valor es vocal? 
    Nuevo ejerciico: 
    leer una palabra. 
    el caracter es una vocal? es consonante? es un simbolo? numero? 
    ejemplo: hola!123
    h => consonante 
    o=> vocal 
    l=> consonante 
    !=> simbolo 
    1=> numero 
    2=> numero 
    3=> numero 
         */
        System.out.println("Ingrese una palabra: ");
        String palabra = entrada.nextLine();
        int ultimaPos = palabra.length() - 1;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < ultimaPos; i++) {
            char letra = palabra.charAt(i);
            int codigoAscii = letra;
            if (codigoAscii >= 48 && codigoAscii <= 57) {
                //El valor es un numero 
                System.out.println(letra + "=> " + codigoAscii + "=> Es un numero");
                //}else if ((codigoAscii>=65&&codigoAscii<=90) || (codigoAscii>=97&& codigoAscii<=122)){
            } else if (codigoAscii >= 97 && codigoAscii <= 122) {
                //Es una letra
                switch (codigoAscii) {
                    case 97://a
                    case 101: //e
                    case 105: //i
                    case 111://o
                    case 117: //u
                        System.out.println(letra + "=> " + codigoAscii + "=> Es una vocal");
                        break;
                    default:
                        System.out.println(letra + "=> " + codigoAscii + "=> Es una consonante");
                }
            } else {
                System.out.println(letra + "=> " + codigoAscii + "=> Es un Simbolo");
            }
        }//fin del for 
    }//fin del main 

}
