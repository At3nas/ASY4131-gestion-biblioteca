package librosfera.modelo;

public class Genero {

    // ATRIBUTOS //
    private String nombreGenero;
    private Integer idGenero;

    // CONSTRUCTOR //
    public Genero(String nombreGenero, Integer idGenero) {
        this.nombreGenero = nombreGenero;
        this.idGenero = idGenero;
    }

    // GETTER //
    public String getNombre_genero() {
        return nombreGenero;
    }

    public Integer getId_genero() {
        return idGenero;
    }

    // SETTER //
    public void setNombre_genero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public void setId_genero(Integer idGenero) {
        this.idGenero = idGenero;
    }

}
