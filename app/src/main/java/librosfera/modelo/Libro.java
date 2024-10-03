/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosfera.modelo;

/**
 *
 * @author Cetecom
 */
public class Libro {

    // ATRIBUTOS //
    private String titulo;
    private Autor autor;
    private String sinopsis;
    private Year annio_publicacion;
    private Genero genero;

    // CONSTRUCTOR //
    public Libro(String titulo, Autor autor, String sinopsis, Year annio_publicacion, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.annio_publicacion = annio_publicacion;
        this.genero = genero;
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

    public Year getAnnio_publicacion() {
        return annio_publicacion;
    }

    public Genero getGenero() {
        return genero;
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

    public void setAnnio_publicacion(Year annio_publicacion) {
        this.annio_publicacion = annio_publicacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // MÉTODOS //
}
