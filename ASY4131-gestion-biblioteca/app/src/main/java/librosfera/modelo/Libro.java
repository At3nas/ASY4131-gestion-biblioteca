package librosfera.modelo;

import java.time.*;

public class Libro {

    // ATRIBUTOS //
    private String titulo;
    private Autor autor;
    private String sinopsis;
    private Year annioPublicacion;
    private Genero genero;
    private Integer nroPaginas;
    private String isbn;

    // CONSTRUCTOR //
    public Libro(String titulo, Autor autor, String sinopsis, Year annioPublicacion, Genero genero, Integer nroPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.annioPublicacion = annioPublicacion;
        this.genero = genero;
        this.nroPaginas = nroPaginas;
        this.isbn = isbn;
    }

    // GETTER //
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Year getAnnioPublicacion() {
        return annioPublicacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public Integer getNroPaginas() {
        return nroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    // SETTER //
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setAnnioPublicacion(Year annioPublicacion) {
        this.annioPublicacion = annioPublicacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setNroPaginas(Integer nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // MÉTODOS //
}
