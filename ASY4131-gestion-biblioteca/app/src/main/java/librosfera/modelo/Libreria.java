package librosfera.modelo;

public class Libreria {
    // ATRIBUTOS //
    private String lista_lectura;
    private String historial_lectura;
    private int libros_devueltos;
    private int libros_arrendados;
    private String resenas_escritas;
    
    // CONSTRUCTORES //
    // constructor vacío //
    public Libreria() {
    }
    
    // constructor con parámetros //
    public Libreria(String lista_lectura, String historial_lectura, int libros_devueltos, int libros_arrendados, String resenas_escritas) {
        this.lista_lectura = lista_lectura;
        this.historial_lectura = historial_lectura;
        this.libros_devueltos = libros_devueltos;
        this.libros_arrendados = libros_arrendados;
        this.resenas_escritas = resenas_escritas;
    }
    
  
}//final clase 
