package clase_27.pkg02.pkg2024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_27022024 {
    public static void main(String[] args) {
//        int fila =3;//0..2
//        int columna=3;//0..2
//       int [] [] tablero = new int[fila][columna];
//       
//       int filaNoCuadrada=7;//0...6
//       int columnaNoCuadrada=3;// 0..2
//       String [][] matrizNoCuadrada = new String[filaNoCuadrada][columnaNoCuadrada];
//       
//       
//       //nombreDelArreglo[pos] = nuevoValor
//        System.out.println("Ingresando valor en pos 2,1");
//       tablero[2][1]= 0;
//       
//       //nombreArreglo[pos]
//        System.out.println("Imprimiendo valor en pos 2,1");
//        System.out.println(tablero[2][1]);
//        
//        
//        ///For para imprimir una matriz. 
//        int tamanoFilas = tablero.length;
//        int tamanoColumnas = tablero[0].length;
//        
//        for (int i = 0; i < tamanoFilas; i++) {//Numero de fila.
//            for (int j = 0; j < tamanoColumnas; j++) { //Numero de la columna
//                System.out.print(tablero[i][j]);
//            }
//            System.out.println("");
//        }
//        
        /*
        Crear un mini laberinto. 
        1) LISTO El usuario nos dira el tamaño del laberinto  
        2) LISTO Se asume que el laberinto tendra una estructira de matriz cuadrada. Tamano filas = tamaño columnas 
        3) Nuestro personaje se representará por una X 
        4) El laberinto puede tener obstaculos, que seran representados por un *,
        el jugador no podrá pasar o posicionarse en donde haya un obstaculo .
        5) Al inciar el juego, se deben generar o crear 5 obstaculos utilizando random 
        6) cuando el jugador llegue al final del laberinto, 
        le mostraremos un mensaje de exito y el programa terminara
        7) LISTO Debemo de poder visualizar el estado actual del juego.  
        8) Se le pedira al usuario los valores de las posicines a los cuales quiere moverse. 
        
        */
        /*Creamos el tablero*/
        System.out.println("CREANDO TABLERO");
        String [][] laberinto = crearTablero();
        
        
        /*Agregar al jugador al tablero */
        System.out.println("AGREGANDO EL PERSONAJE");
        laberinto= agregarPersonaje(laberinto);
        
        /*Imprimir el tablero*/
        System.out.println("IMPRIMIENDO TABLERO");
        imprimirTablero(laberinto);
    }
    
    public static void moverJugador(){
        //fila, columna
    }
    public static void leerCordenadas(){
        
    }
    public static String [][] crearTablero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño deseado de las filas/Columnas");
        int tamanoFilasColumnas = entrada.nextInt();
        String [][] tablero = new String[tamanoFilasColumnas][tamanoFilasColumnas];
        //Depues de esta linea ya tenemos creado el tablero. 
        return tablero;
    }
    
    
    public static String [][] agregarPersonaje( String [][] tablero){
        tablero[0][0]="X";
        //Despues de esta linea, ya actualizamos el tablero con el jugador en la pos inciial.
        return tablero;
    }
    
    public static void imprimirTablero( String [][] tablero){
        int tamanoFilas = tablero.length;
        //int tamanoColumnas = tamanoFilas;
        int tamanoColumnas = tablero[0].length;
        for (int i = 0; i <tamanoFilas ; i++) {//CONTARA LAS FILAS
            for (int j = 0; j < tamanoColumnas; j++) {//Contara las columnas
                System.out.print(" "+tablero[i][j]+" ");
            }
            System.out.println("");
        }
    }
 
}
