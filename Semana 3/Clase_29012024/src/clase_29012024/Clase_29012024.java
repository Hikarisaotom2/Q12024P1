
package clase_29012024;

public class Clase_29012024 {

    public static void main(String[] args) {
//      int contador=5;
//        while (contador<5){ 
//            System.out.println("Hola"); 
//            contador++; //-> contador+=1; -> contador=contador+1;
//        }//Fin del while 
//        System.out.println("Hola fuera del while");
//        
//        int contador = 5;
//        do{
//            System.out.println("Hola mundo");
//            contador++;
//        }while(contador<5);
//        System.out.println("Fuera del do while");
//        int contador=0;
//        while (true) {
//            System.out.println("Esto es un ciclo infinito");
//            if(contador==7){
//                break; 
//            }
//            System.out.println("Hola despues del break");
//        }
        int num=1;
        while (true) {
            System.out.println("Un while con un continue"+ num);
            if(num==5){
                num++;
               continue; 
            }
            num++;
        }
    }
    
}
