package librosfera.modelo;

public class Usuario {

    // ATRIBUTOS //
    public String idUsuario;
    public String nombreUsuario;
    public String emailUsuario;
    public String claveUsuario;
    public Libreria libreria;

    // CONSTRUCTOR //
    public Usuario() {
    }

    public Usuario(String idUsuario, String nombreUsuario, String emailUsuario, String claveUsuario, Libreria libreria) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.claveUsuario = claveUsuario;
        this.libreria = libreria;
    }

    // GETTER //
    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public Libreria getLibreria() {
        return libreria;
    }

    // SETTER //
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public void setLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    // MÉTODOS //
}
