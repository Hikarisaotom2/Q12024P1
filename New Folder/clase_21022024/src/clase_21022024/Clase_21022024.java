/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_21022024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_21022024 {

    public static void main(String[] args) {
        /*
        Restricciones de los arreglos 
        1) Todos los elementos deben ser del mismo tipo de dato 
        2) Tienen un tamaño fijo 
        3) Aunque esten vacios, las posiciones estan ahi. 
         */
//        int[] listaDeNumero = new int[5];
//        int[] listaInicial = {4, 90, 20, 70, 3};
//        listaDeNumero[0] = 200;// Modificar los valores 
//        listaDeNumero[1] = 250;
//        listaDeNumero[2] = 230;
//
//        for (int i = 0; i < listaDeNumero.length; i++) {
//            int valor = listaDeNumero[i];
//            System.out.println("Elemento  " + i + " del arreglo " + valor);
//        }
//
//        for (int i = 0; i < listaInicial.length; i++) {
//            int valor = listaInicial[i];
//            System.out.println("Elemento  " + i + " del arreglo " + valor);
//        }

        /*
    Mini Biblioteca:
    CRUD 
    C -> CREATE LISTO 
    R -> READ  LISTO
    U-> UPDATE
    D -> DELETE LISTO 
    
    1) Crear o agregar nuevos libros nuevos libros 
    2) Listar libros disponibles. 
    3) Modificar nombre del libro 
    4) Eliminar un libro 

         */
        
        menu();
    }// fin del main 

    public static void menu(){
        /*
        1) como crear un arreglo 
        2) como modificar o llenar un arreglo
        3) como ver los elementos en cada posicion del arreglo
        4) como saber el tamano de un arreglo
        
        */
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        int tamano = 10;
        String [] biblioteca= crearBiblioteca(tamano);
        while (bandera) {
            System.out.println("1) Crear o agregar nuevos libros nuevos libros ");
            System.out.println("2) Listar libros disponibles. ");
            System.out.println("3) Modificar nombre del libro ");
            System.out.println("4) Eliminar un libro ");
            System.out.println("5) Buscar Libro");
            System.out.println("6) Agregar directamente los libros");
            System.out.println("5) Salir ");
            int op = entrada.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("CREAR O AGREGAR ");
                     biblioteca=agregarElementosALista(biblioteca);
                     System.out.println("______________-----> LIBRO AGREGADO EXITOSAMENTE___________________________");
                     System.out.println("");
                }
                case 2 -> {
                    System.out.println("LISTAR");
                    listarElementosBiblioteca(biblioteca);
                }
                case 3 -> {
                    System.out.println("MODIFICAR");
                    biblioteca= modificarLibros(biblioteca);
                     System.out.println("______________ -----> LIBRO ACTUALIZADO EXITOSAMENTE___________________________");
                     System.out.println("");
                   
                }
                case 4 -> {
                    System.out.println("ELIMINAR");
                    biblioteca = eliminarLibro(biblioteca);
                    System.out.println("______________ -----> LIBRO ELIMINADO EXITOSAMENTE___________________________");
                    System.out.println("");
                }
                case 5 -> {
                        System.out.println("SALIR");
                        bandera= false;
                }
            }
        }// fin del switch 
    }
    
    public static String [] modificarLibros(String [] biblioteca){
         /*
             1) cual es la posicion del valor que quieren modificar LISTO
             2) Cual es el nuevo valor que desea ingresar en esa posicion LISTO
             3) actualizar la lista LISTA
             4) Regresar la lista actualizada 
        */
         Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese la posicion del elemento que desea Modificar: ");
        int pos = entrada.nextInt();
        System.out.println("Ingrese el nuevo valor que desea: ");
        entrada.nextLine();
        String nuevoValor = entrada.nextLine();
        biblioteca[pos] = nuevoValor;
        //despues de esta linea, la lista ya esta actualizada.
        return biblioteca;
        
    }
    public static  String [] eliminarLibro(String [] biblioteca){
        /*
        1) preguntar por el elemento que deseamos """"""""eliminar"""""""  LISTA 
        2) """"ëliminar"""""" el elemento", actualizar lista  LISTA  
        3) regresar la lista actualizada
        */
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese la posicion del elemento que desea eliminar: ");
        int pos = entrada.nextInt();
        /*
        Para practicar: validar que la posicion sea valida 
            Validar la pos. 
            0... ultmaPosValida del arreglo
        */
        
        biblioteca[pos]=" ";
        //DESPUES DE ESTA LINEA YA TENEMOS LA LISTA ACTUALIZADA 
         return biblioteca;
    }
    public static String [] agregarElementosALista(String [] biblioteca){
          /*
                    1) determinar el elemento a aagregar  LISTA 
                    2) actualice la lista LISTA
                    3) retornar la lista actualizada*/
          
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la posicion que desea agregar");
        int pos = entrada.nextInt();
        /*
        Para practicar: validar que la posicion sea valida 
            Validar la pos. 
            0... ultmaPosValida del arreglo
        */
        System.out.println("Ingrese el nombre del libro a agregar: ");
        entrada.nextLine();
        String valor = entrada.nextLine();
        biblioteca[pos] = valor;
        return biblioteca;          
    }
    public static String [] crearBiblioteca(int tamano){
        String [] biblioteca = new String[tamano];
        //despues de esta linea, ya creamos la biblioteca
        return biblioteca;
    }
    public static void listarElementosBiblioteca( String [] biblioteca){
        //cadena.length()
        for (int i = 0; i < biblioteca.length; i++) {
           String valor=  biblioteca[i];
            System.out.println(i+") "+valor);
        }
        System.out.println("_________________________________________________________________________");
        System.out.println("");
    }
}// fin de la clase 

