
package clase_18.pkg03.pkg2024;

/**
 *
 * @author Clau
 */
public class Clase_18032024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 6;
       int respuesta = factorial(n);
        System.out.println("El factorial de "+n+" es "+respuesta);
        
        //2x2x2 = 8
     
    //   int num= 3;
    //   int exp = 3;
    //   int acum = 1;
    //    for (int i = 0; i < exp; i++) {
    //            acum = acum*num;
    //        }
    //    
    //    System.out.println("EL RESULTADO DE "+num +" elevado a la "+exp+" es "+acum);
    int num= 4;
    int exp = 3;
   int resPow =  exponente(num,exp,0);
    System.out.println("EL RESULTADO DE "+num +" elevado a la "+exp+" es "+resPow);
}
    
    /*PASOS PARA EMPEZAR CON LA RECURSION
    1) HAY QUE CREAR UN METODO 
    2) DETERMINAR EL PATRON (divide y venceras)  
    3) DEFINIR Caso base y caso recursivo 
    
    */
    
   
    
    public static int exponente( int num, int exp, int i){
        /*
        el patron seria que tenemos un contador,
        y ese contador va a ir aumentando hasta que 
        sea igual o menos al exp. 
        mientras el contador sea menor al exp, voy a multiplicar 
        */
        if(i>=exp){// caso base
           return 1;
        }else{// caso recursivo 
            i+=1;//i++//i = i+1;
            return num*exponente(num,exp,i);
        }

    }
    public static int factorial( int numero){
     if(numero==1||numero==0){
         return 1 ;
     }else{
         return numero*factorial(numero-1);
     }
  }
/*
    NOTAS SOBRE EL CALLSTACK 
    1) Cada vez que hagamos un llmado a una funcion/ método
    lo guardaremos en el callstack 
    
    2) el callstack funciona como una caja 
    
    3) vamos agregando de abjo hacia arriba 
    
    4) cuando hacemos return (sin problema), 
    sacamos el elemento del callstack
    
    */
    
}
