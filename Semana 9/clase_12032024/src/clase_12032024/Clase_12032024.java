package clase_12032024;

import java.util.ArrayList;

/**
 *
 * @author Clau
 */
public class Clase_12032024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        CRUD
       LISTO  1) Metodo que crea un arraylist 
        LISTO 2) Metodo que imprimir in arraylist 
        LISTO 3) Metodo que busca si un elemento esta en un arraylist 
        LISTO 4) E,iminar un elemento del arraylist 
        LISTO 5) Agregar elementos al ArrayList 
                1) por idnice 2) agregar normalmente 
        */
    }
    public static ArrayList <Producto> crearArrayList(){
        // ArrayList <TIPODATO> nombre = new ArrayList<TIPODEDATO>();
        ArrayList <Producto> productos = new ArrayList<Producto>();
        return productos;
    }
    
    
    public static ArrayList<Producto> agregarElementoPorPos(int pos,Producto item, ArrayList<Producto> inventario ){
        inventario.add(pos,item);
        return inventario;
    }
    
    
    public static ArrayList<Producto>  agregarElementoAlFinal(Producto item, ArrayList<Producto> inventario){
        inventario.add(item);
        return inventario;
    }
    
    
    public static void imprimirLista(ArrayList<Producto> inventario){
       
        for (Producto miProducto : inventario) {
            System.out.println(miProducto);
            //i++;
            // miProducto=inventario.get(i);
        }
        
        
//        for (int i = 0; i <inventario.size(); i++) {
//            Producto miProducto = inventario.get(i);
//            System.out.println(miProducto);
//        }
    }
    
    
    public static ArrayList<Producto> eliminarPos(int pos,ArrayList<Producto> inventario ){
        inventario.remove(pos);
        return inventario;
    }
    
    public static boolean buscarPorNombre (String nombre,ArrayList<Producto> inventario  ){
        // id = 5;
        // nombre = purina 
        boolean encontro = false;
        for (int i = 0; i < inventario.size(); i++) {
            String nombreProducto = inventario.get(i).getNombre();
            if(nombreProducto.equalsIgnoreCase(nombre)){
                encontro = true;
                break;
            }
        }
          return encontro;
    }
    
}
