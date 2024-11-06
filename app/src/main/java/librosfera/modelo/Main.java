package librosfera.modelo;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // SCANNER //
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar busqueda:");
        String inputSearch = sc.nextLine().replace(" ", "+");
        
        
        // API URL
        String url = "https://openlibrary.org/search.json?q=" +inputSearch+ "&fields=title,author_name,isbn";
        

        // INSTANCIA DE HTTPCLIENT
        // se encarga de enviar una request al servidor
        HttpClient client = HttpClient.newHttpClient();

        // CREAR REQUEST
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        try {
            // ENVIAR REQUEST
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String strResponse = response.body().toString();
            
  
            // Crear objeto GSON
            Gson gson = new Gson();
            ListaLibros listaLibros = gson.fromJson(strResponse, ListaLibros.class);
            
            for (Libro l : listaLibros.getDocs()) {
                System.out.println("-------------------------------------");
                System.out.println("Title: " + l.getTitle());
                System.out.println("Autor: " + l.getAuthor_name().getFirst());
                System.out.println("ISBN: " + l.getIsbn().getFirst());  
            }

            //ListaLibros listaLibros1 = gson.fromJson(response.body(), ListaLibros.class);    
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
