
package librosfera.modelo;


public class Usuario {
    // ATRIBUTOS //
    private String idUsuario;
    private String nombreUsuario;
    private String claveUsuario;
    private Libreria libreria;
    
    // CONSTRUCTOR //
    public Usuario() {
    }

    public Usuario(String idUsuario, String nombreUsuario, String claveUsuario, Libreria libreria) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.libreria = libreria;
    }
    
    // GETTER //
    
    
    // SETTER //
}
