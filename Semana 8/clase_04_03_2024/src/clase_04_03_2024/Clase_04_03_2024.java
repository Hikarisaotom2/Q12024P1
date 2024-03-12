
package clase_04_03_2024;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_04_03_2024 {

    public static int contador=0;
    
    public static void main(String[] args) {
        // TipoDeDato nombrevariable = valorInicial;
//        System.out.println("Creando Objeto");
//        Persona miPrimeraPersona = new Persona("Claudia","Cortes",35,"F");
//        Persona persona2 = new Persona("Pedro","Garcia",17,"M");
//        System.out.println(miPrimeraPersona);
//        System.out.println(persona2);
//        System.out.println("Objeto creado");


    /*
        mini RNP
        CRUD
        LISTO 0) Crear la lista de personas 
        LISTO 1) Agregar personas al sistema( Solamente podemos agregar 10 personas al dia)
        LIST0 2) Listar personas
        LISTO 3) Actualizar información de las personas
        4) Modificar estado de vida
        LISTO 5) Buscar personas por id
    */    

    
        Persona[] lista = crearListaInicial(10);
        Scanner entrada = new Scanner(System.in);
        while (true) {
              lista= agregarPersona(lista);
              listarPersonas(lista);
              System.out.println("MODIFICAR LOS ELEMENTOS DE LA LISTA");
              lista=modificarPersona(lista);
              
              System.out.println("Ingrese el numero de identidad");
              String id = entrada.next();
              System.out.println("BUSCANDO VALOR");
              boolean seEncontro = buscarPersona(lista,id);
              if(seEncontro){
                  System.out.println("Si se encoentro a una persona con ese numero de identidad");
              }else{
                  System.out.println("No se encontro a nadie con ese numero de identidad");
              }
              
        }
    }// fin del main 
    
    public static boolean buscarPersona(Persona [] listaPersonas,String idBuscar ){
            boolean seEncontro = false;
            for (int i = 0; i < listaPersonas.length; i++) {
                /*
                    Tengo que buscar utilizando el numero de identidad.
                    tengo que ver si una persona en la lista tiene este numero de identidad o no
                    Si una persona tiene el mismo numero de identidad que estoy buscando, encontre que la persona si esta en el sistema
                    tengo que seguir buscando en el resto de peronas de la lista 
                    si llego al final de la lista y nunca encontre a nadie con el mismo numero de identidad que estaba buscando,
                    significa que la persona no esta en el sistema :( 

                */
                // Persona de la lista en la pos I, cual es su numero de identidad?
                
               if(listaPersonas[i] != null){
                    String numeroIdentidadPersona = listaPersonas[i].getNumeroIdentidad();
                if(numeroIdentidadPersona.equals(idBuscar)){// Si son iguales, encontramos a la persona con el numero de identidad.
                      seEncontro=true;
                      break;
                }
               }else{
                   System.out.println("El elemento en la pos "+i+" esta nulo");
               }
        }// fin del for 
        /*Una vez fuera del for, sabemos que se encontro o no se encontro la persona con el numero de identidad*/
        return seEncontro;
    }
    
    public static Persona[] modificarPersona(Persona [] listaPersonas){
        Scanner entrada = new Scanner(System.in);
            listarPersonas(listaPersonas);
            System.out.println("Que pos desea modificar: ");
            int pos = entrada.nextInt(); //Validar que la pos ingresada sea valida
            entrada.nextLine();
             System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();
            System.out.println("Ingrese su sexo biologico");
            entrada.nextLine();
            String sexoBio = entrada.nextLine();
             //Modificando los atributos del objeto que hay en la posicion de la variable pos, dentro de la lista
            listaPersonas[pos].setApellido(apellido);
            listaPersonas[pos].setEdad(edad);
            listaPersonas[pos].setNombre(nombre);
            listaPersonas[pos].setSexoBio(sexoBio);
            
            System.out.println("VALORES ACTUALIZADOS EXITOSAMENTE ");
            listarPersonas(listaPersonas);
            return listaPersonas;
    }
    public static void listarPersonas(Persona[] listaPersonas){
        System.out.println("_________________________LISTA DE PERSONAS ACTUALES_________________________");
        for (int i = 0; i <listaPersonas.length; i++) {
            System.out.println(i+") "+listaPersonas[i]);
        }
        System.out.println("_________________________FIN DE LA LISTA_________________________");

    }
    public static Persona[] agregarPersona( Persona[] listaPersonas){
        /*
        1)leer los datos 
        2) crear una persona
        3) agregar la persona a la lista de personas 
        4)actualizar la lista
        5)Regresar la lista actualizada*/
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su sexo biologico");
        entrada.nextLine();
        String sexoBio = entrada.nextLine();
        
        if(contador>=10){
            System.out.println("No se pueden agregar mas personas por el dia de hoy");
        }else{
            //Crear objeto persona 
            Persona nuevaPersona = new Persona(nombre,apellido,edad,sexoBio,""+contador);
            listaPersonas[contador] = nuevaPersona;
            contador++;
        }
        //Despues del if, la lista de personas esta actualizada. 
        return listaPersonas;
    }
    public  static Persona [] crearListaInicial(int tamano){
        //TipoDeDato [] nombreArreglo = new TipoDeDato [tamano];
        Persona [] listaPersonas = new Persona [tamano];
        return listaPersonas;
    }
    
    
}
