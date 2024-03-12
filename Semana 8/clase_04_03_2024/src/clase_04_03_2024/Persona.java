package clase_04_03_2024;

/**
 *
 * @author Clau
 */
public class Persona {
    //Atributos
    /*Son Variables globales*/
    private String nombre;
    private String apellido;
    private int edad;
    private String sexoBio;
    private String numeroIdentidad; // Queremos proteger este atributo
    
    //Métodos 
    /*Constructores*/
    /*Su objetivo es darle un valor incial a los atributos*/
    Persona(String nombre, String apellido, int edad, String sexoBio, String numeroIdentidad){ 
        this.numeroIdentidad=numeroIdentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexoBio = sexoBio;
    }
    /*se crean igual que como lo haciamos con el main*/
    public void saludar() {
        System.out.println("Hola soy un objeto......");
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + ", apellido:" + apellido + ", edad:" + edad + ", sexoBio:" + sexoBio;
    }
    
    //Setter - > Actualizar un valor 
    //Getter -> Mostrar un valor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexoBio() {
        return sexoBio;
    }

    public void setSexoBio(String sexoBio) {
        this.sexoBio = sexoBio;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }
    

    
}//fin de la clase 
