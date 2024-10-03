/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosfera.modelo;

/**
 *
 * @author Cetecom
 */
public class Genero {

    // ATRIBUTOS //
    private String nombre_genero;
    private Integer id_genero;

    // CONSTRUCTOR //
    public Genero(String nombre_genero, Integer id_genero) {
        this.nombre_genero = nombre_genero;
        this.id_genero = id_genero;
    }

    // GETTER //
    public String getNombre_genero() {
        return nombre_genero;
    }

    public Integer getId_genero() {
        return id_genero;
    }

    // SETTER //
    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

    public void setId_genero(Integer id_genero) {
        this.id_genero = id_genero;
    }

}
