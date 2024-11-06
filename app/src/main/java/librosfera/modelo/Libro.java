package librosfera.modelo;

import java.util.List;

public class Libro {

    // ATRIBUTOS //
    private List<String> author_name;
    private List<String> isbn;
    private String title;
    
    
    
    
    // GETTER //
    public String getTitle() {
        return title;
    }

    public List<String> getIsbn() {
        return isbn;
    }
    
    public List<String> getAuthor_name() {
        return author_name;
    }
    
    // SETTER //
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor_name(List<String> author_name) {
        this.author_name = author_name;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }
    
    
}

