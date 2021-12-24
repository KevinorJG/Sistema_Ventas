package Internal;

/**
 *
 * @author kevin
 */
public class Asesor {
    
    //atributos
    protected String id;
    protected String nombre;
    
    //constructores
    public Asesor(){
        
    }

    public Asesor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
