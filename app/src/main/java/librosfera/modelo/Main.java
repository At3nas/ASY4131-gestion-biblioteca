package librosfera.modelo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // API URL
       String url = "https://openlibrary.org/search.json?author=bronte&sort=new";
       
       // INSTANCIA DE HTTPCLIENT
       // se encarga de enviar una request al servidor
       HttpClient client = HttpClient.newHttpClient();
       
       // CREAR REQUEST
       HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
       
        try {
            // ENVIAR REQUEST
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
