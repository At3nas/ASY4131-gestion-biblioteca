package librosfera.modelo;

public class Autor {

    // ATRIBUTOS //
    private Integer idAutor;
    private String nombreAutor;
    private String pais;
    private ListaGeneros generos;
    private String bio;

    // CONSTRUCTOR //
    public Autor(Integer idAutor, String nombreAutor, String pais, ListaGeneros generos, String bio) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.pais = pais;
        this.generos = generos;
        this.bio = bio;
    }

    // GETTER //
    public Integer getId_autor() {
        return idAutor;
    }

    public String getNombre_autor() {
        return nombreAutor;
    }

    public String getPais() {
        return pais;
    }

    public ListaGeneros getGeneros() {
        return generos;
    }

    public String getBio() {
        return bio;
    }

    // SETTER //
    public void setId_autor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public void setNombre_autor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGeneros(ListaGeneros generos) {
        this.generos = generos;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    // MÉTODOS //
}
