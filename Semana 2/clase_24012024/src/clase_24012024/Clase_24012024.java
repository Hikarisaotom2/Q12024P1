package clase_24012024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_24012024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Leer datos del usuario, si el usuario es mayor de edad, le mostraremos un mensaje.
        Si el usuario es menor de edad, le diremos que es menor de edad. 
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido/a al programa");
        System.out.println("1) Edad ");
        System.out.println("2) Contraseña");
        System.out.println("Ingrese la opción del menú a la que quiere ingresar: ");
        int op = entrada.nextInt();
        if (op == 1) {//Verdadero
            System.out.println("Ingrese su edad ");
            int edad = entrada.nextInt();
            System.out.println("La edad es " + edad);
            //IF
            if (edad >= 18) { //Mayor de edad
                System.out.println("Usted es mayor de edad.");
            }//fin del if

            if (edad < 17) { //Menor de edad
                System.out.println("Usted es menor de edad ");
            }//Fin del if
        } else {//false 
            //IF-ELSE
            /*
        valide si una contraseña numerica que sera ingresada por el usuario es la misma contrasena del sistema 
             */
            int contrasenaSistema = 123456;
            System.out.println("Ingrese su contrasena: ");
            int contrasena = entrada.nextInt();

            if (contrasena == contrasenaSistema) {//Verdadero
                System.out.println("Muy bien, la contrasena es correcta ");
            } else {//False 
                System.out.println("Contrasena incorrecta, intentelo de nuevo ");
            }//fin del if else 

        }//fin del if else 

        /*
        valores menores a 50: Deficiente : nota < 50
        50-59 mal 
        60-69 bien 
        70-79 muy bien 
        80-89 excelente 
        90-100 Sobre 
         */
        System.out.println("Ingrese la nota: ");
        int nota = entrada.nextInt();
        if (nota < 50) {// Verdadero 
            //-infinito, 49
            System.out.println("Deficiente");
        } else {//False
            //Si estoy aqui, es por que nota tiene un valor mayor a 50...
            if (nota >= 50 && nota <= 59) {//Verdadero...
                //50....59
                System.out.println("Mal :( ");
            } else {
                //Si estoy aqui, es por que la nota tiene un valor mayor a 59
                if (nota >= 60 && nota <= 69) {
                    System.out.println("Bien");
                } else {
                    //Si estoy aqui, es por que la nota tiene un valor mayor a 69
                    if (nota >= 70 && nota <= 79) {
                        System.out.println("Muy bien :)");
                    } else {
                        //Si estoy aqui, es por que la nota tiene un valor mayor a 79
                        if (nota >= 80 && nota <= 89) {
                            System.out.println("Excelente");
                        } else {
                            //Si estoy aqui, es por que la nota tiene un valor mayor a 89
                            if (nota >= 90 && nota <= 100) {
                                System.out.println("Sob");
                            } else {
                                System.out.println("No es una nota valida");
                            }
                        }
                    }
                }
            }

        }

    }//fin del main 

}//fin de la clase 
