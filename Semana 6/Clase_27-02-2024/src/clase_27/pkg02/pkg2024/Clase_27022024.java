package clase_27.pkg02.pkg2024;

import java.util.Random;
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
        3) LISTO Nuestro personaje se representará por una X 
        4) LISTO El laberinto puede tener obstaculos, que seran representados por un *,
        el LISTO jugador no podrá pasar o posicionarse en donde haya un obstaculo .
        5) LISTO Al inciar el juego, se deben generar o crear 5 obstaculos utilizando random 
        6) cuando el jugador llegue al final del laberinto, 
        le mostraremos un mensaje de exito y el programa terminara
        7) LISTO Debemo de poder visualizar el estado actual del juego.  
        8) LISTO Se le pedira al usuario los valores de las posicines a los cuales quiere moverse. 
         */
 /*Creamos el tablero*/
        System.out.println("CREANDO TABLERO");
        String[][] laberinto = crearTablero();
        /*Agregar al jugador al tablero */
        System.out.println("AGREGANDO EL PERSONAJE y LOS OBSTACULOS");
        laberinto = agregarPersonaje(laberinto);
        laberinto = generarObstaculos(laberinto);
        /*Imprimir el tablero*/
        System.out.println("IMPRIMIENDO TABLERO");
        imprimirTablero(laberinto);

        while (true) {
            /*Simular movimiento dentro del tablero*/
            int[] coordenadas = leerCordenadas();
            int fila = coordenadas[0];
            int columna = coordenadas[1];
            laberinto = moverJugador(fila, columna, laberinto);
            imprimirTablero(laberinto);
        }
    }

    public static String[][] generarObstaculos(String[][] tablero) {
        Random rad = new Random();
        int tamanoFilas = tablero.length;
        int tamanoColumnas = tablero[0].length;
        int cantObsculos = 0;
        while (cantObsculos < 5) {
            int filaRandom = rad.nextInt(0, tamanoFilas);
            int columnaRandom = rad.nextInt(0, tamanoColumnas);
            if (tablero[filaRandom][columnaRandom].equalsIgnoreCase("*")
                    || tablero[filaRandom][columnaRandom].equalsIgnoreCase("X")) {
                continue;
            } else {
                tablero[filaRandom][columnaRandom] = "*";
                cantObsculos++;
            }
        }

        return tablero;
    }

    public static String[][] moverJugador(int fila, int columna, String[][] tablero) {
        int filas = tablero.length;
        int columnas = tablero[0].length;
        if (tablero[fila][columna].equalsIgnoreCase("*")) {
            System.out.println("No puedes moverte a esa posicion, es un obstaculo. ");
        } else {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (tablero[i][j].equalsIgnoreCase("X")) {
                        tablero[i][j] = " ";
                    }
                }
            }
            //Actualizar el tablero 
            tablero[fila][columna] = "X";
        }

        return tablero;
    }

    public static int[] leerCordenadas() {

        /*
        Validaciones faltantes:
        1) verificar que las posiciones sean validas 
        2) Limitar la cantidad de columnas / filas a las que nos moveremos 
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fila y la columna de la forma: fila, columna ");
        System.out.println("ejemplo: 100,200 ");
        // "claudia-cortes-patricia-pavon".split("-")
        // [claudia,cortes,patricia,pavon]
        String cadenaNumeros = entrada.nextLine();
        String[] arregloNumerosString = cadenaNumeros.split(",");
        int[] arregloNumeros = new int[arregloNumerosString.length];

        for (int i = 0; i < arregloNumerosString.length; i++) {
            String numeroString = arregloNumerosString[i];
            int numero = Integer.parseInt(numeroString);
            arregloNumeros[i] = numero;
//             System.out.println("Numero string "+numeroString+"= "+numeroString+1 );
//             System.out.println("Numero entero "+numero+"= "+ (numero+1));
        }
        return arregloNumeros;

    }

    public static String[][] crearTablero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño deseado de las filas/Columnas");
        int tamanoFilasColumnas = entrada.nextInt();
        String[][] tablero = new String[tamanoFilasColumnas][tamanoFilasColumnas];
        //Estamos llenando la matriz de espacios 
        for (int i = 0; i < tamanoFilasColumnas; i++) {
            for (int j = 0; j < tamanoFilasColumnas; j++) {
                tablero[i][j] = " ";
            }
        }
        //Depues de esta linea ya tenemos creado el tablero. 
        return tablero;
    }

    public static String[][] agregarPersonaje(String[][] tablero) {
        tablero[0][0] = "X";
        //Despues de esta linea, ya actualizamos el tablero con el jugador en la pos inciial.
        return tablero;
    }

    public static void imprimirTablero(String[][] tablero) {
        int tamanoFilas = tablero.length;
        //int tamanoColumnas = tamanoFilas;
        int tamanoColumnas = tablero[0].length;
        for (int i = 0; i < tamanoFilas; i++) {//CONTARA LAS FILAS
            for (int j = 0; j < tamanoColumnas; j++) {//Contara las columnas
                System.out.print(" [" + tablero[i][j] + "] ");
            }
            System.out.println("");
        }
    }

}
