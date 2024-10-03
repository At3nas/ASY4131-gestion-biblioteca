/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosfera.modelo;

/**
 *
 * @author Cetecom
 */
public class Autor {

    // ATRIBUTOS //
    private Integer id_autor;
    private String nombre_autor;
    private String pais;
    private ListaGeneros generos;
    private String bio;

    // CONSTRUCTOR //
    public Autor(Integer id_autor, String nombre_autor, String pais, ListaGeneros generos, String bio) {
        this.id_autor = id_autor;
        this.nombre_autor = nombre_autor;
        this.pais = pais;
        this.generos = generos;
        this.bio = bio;
    }

    // GETTER //
    public Integer getId_autor() {
        return id_autor;
    }

    public String getNombre_autor() {
        return nombre_autor;
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
    public void setId_autor(Integer id_autor) {
        this.id_autor = id_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
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
