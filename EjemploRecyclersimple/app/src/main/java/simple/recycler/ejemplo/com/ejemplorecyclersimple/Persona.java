package simple.recycler.ejemplo.com.ejemplorecyclersimple;

/**
 * Created by jose on 08/05/17.
 */

public class Persona {
    String nombre;
    String apellido;

    public  Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
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

}
