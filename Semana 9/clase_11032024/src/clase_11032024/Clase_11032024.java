
package clase_11032024;
import java.util.ArrayList;
/**
 *
 * @author Clau
 */
public class Clase_11032024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] listaNombres = new String[5];
        listaNombres[0]="Hola";
        //Crear un arraylist
        ArrayList <String> arrayListNombres = new ArrayList<String>();
        //Tamaño de un arraylist 
        int tamano =  arrayListNombres.size();
        System.out.println("El tamaño inicial es: "+tamano);
        //Agregar elementos a un arraylist
        arrayListNombres.add("Eduardo");
        arrayListNombres.add("Carlos");
        arrayListNombres.add("Diego");
        tamano =  arrayListNombres.size();
         System.out.println("El tamaño despues del add  es: "+tamano);
         
//         // Recorer un ArrayList.
         for (int i = 0; i < arrayListNombres.size(); i++) {
            // listaNombres[i]
            String elemento = arrayListNombres.get(i);// arraeglo[i]
             System.out.println("El elemento en la pos "+i+ " es "+elemento);
        }
         System.out.println(arrayListNombres);
         
         //agregar en una pos especificia
         //arrayListNombres.add(4, "Claudia Cortes");
         arrayListNombres.add(1, "Gabriel");
          System.out.println("Arraylist depsues de añadir en la pos 1 "+arrayListNombres);
         //Remove / delete 
         
         arrayListNombres.remove(1);
          System.out.println("ArrayList despues del remove "+arrayListNombres);
/*
          0 juan
          1 gabriel
          2 miguel
          3  diego
          */
          arrayListNombres.clear();
          System.out.println("Tamano despues del clear: "+ arrayListNombres.size());
          
         
         
    }
    
}
