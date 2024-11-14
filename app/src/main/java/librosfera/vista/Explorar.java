package librosfera.vista;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import librosfera.modelo.Libro;
import librosfera.modelo.ListaLibros;
import librosfera.modelo.Main;
import librosfera.vista.components.BookCard;

public class Explorar extends javax.swing.JPanel {

    // Crea la URL para la búsqueda
    String url;
    String searchFields = "&fields=title,author_name,isbn";
    String searchLimits = "&limit=20&offset=0";

    /**
     * Creates new form Explorar
     */
    public Explorar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelHeader = new javax.swing.JPanel();
        labelExplorar = new javax.swing.JLabel();
        selectSearchFilter = new javax.swing.JComboBox<>();
        fieldSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        panelScroll = new javax.swing.JScrollPane();
        panelBookCards = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setLayout(new java.awt.GridBagLayout());

        panelHeader.setBackground(new java.awt.Color(250, 250, 250));
        panelHeader.setMaximumSize(new java.awt.Dimension(900, 100));
        panelHeader.setMinimumSize(new java.awt.Dimension(900, 100));
        panelHeader.setPreferredSize(new java.awt.Dimension(900, 100));
        java.awt.GridBagLayout panelHeaderLayout = new java.awt.GridBagLayout();
        panelHeaderLayout.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
        panelHeaderLayout.rowHeights = new int[] {0};
        panelHeader.setLayout(panelHeaderLayout);

        labelExplorar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelExplorar.setForeground(new java.awt.Color(58, 33, 36));
        labelExplorar.setText("Explorar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 64);
        panelHeader.add(labelExplorar, gridBagConstraints);

        selectSearchFilter.setBackground(new java.awt.Color(234, 234, 234));
        selectSearchFilter.setForeground(new java.awt.Color(51, 51, 51));
        selectSearchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Titulo", "Autor" }));
        selectSearchFilter.setFocusable(false);
        selectSearchFilter.setMaximumSize(new java.awt.Dimension(120, 50));
        selectSearchFilter.setMinimumSize(new java.awt.Dimension(120, 50));
        selectSearchFilter.setPreferredSize(new java.awt.Dimension(120, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 8);
        panelHeader.add(selectSearchFilter, gridBagConstraints);

        fieldSearch.setBackground(new java.awt.Color(240, 240, 240));
        fieldSearch.setForeground(new java.awt.Color(153, 153, 153));
        fieldSearch.setMaximumSize(new java.awt.Dimension(500, 50));
        fieldSearch.setMinimumSize(new java.awt.Dimension(500, 50));
        fieldSearch.setPreferredSize(new java.awt.Dimension(500, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        panelHeader.add(fieldSearch, gridBagConstraints);

        btnSearch.setBackground(new java.awt.Color(58, 33, 36));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setMaximumSize(new java.awt.Dimension(50, 50));
        btnSearch.setMinimumSize(new java.awt.Dimension(50, 50));
        btnSearch.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 8);
        panelHeader.add(btnSearch, gridBagConstraints);

        add(panelHeader, new java.awt.GridBagConstraints());

        panelScroll.setMaximumSize(new java.awt.Dimension(900, 500));
        panelScroll.setMinimumSize(new java.awt.Dimension(900, 500));
        panelScroll.setPreferredSize(new java.awt.Dimension(900, 500));

        panelBookCards.setBackground(new java.awt.Color(250, 250, 250));
        panelBookCards.setLayout(new java.awt.GridLayout(5, 4, 24, 24));
        panelScroll.setViewportView(panelBookCards);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(panelScroll, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // CLick | Botón Buscar
    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // Obtener el filtro de búsqueda seleccionado
        String searchFilter = selectSearchFilter.getSelectedItem().toString();
        // Obtener el texto de búsqueda ingresado
        String inputSearch = fieldSearch.getText().replace(" ", "+");

        System.out.println(searchFilter);

        // Modifica la URL de búsqueda en base al filtro seleccionado
        switch (searchFilter) {
            // Búsqueda general
            case "General":
                this.url = "https://openlibrary.org/search.json?q=" + inputSearch + this.searchFields + this.searchLimits;
                break;
            // Búsqueda por título
            case "Titulo":
                this.url = "https://openlibrary.org/search.json?title=" + inputSearch + this.searchFields + this.searchLimits;
                break;
            // Búsqueda por autor
            case "Autor":
                this.url = "https://openlibrary.org/search.json?author=" + inputSearch + this.searchFields + this.searchLimits;
                break;
        }

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

            // Limpiar panel antes de volver a mostrar resultados
            panelBookCards.removeAll();
            panelBookCards.revalidate();
            panelBookCards.repaint();
            for (Libro l : listaLibros.getDocs()) {

                // Validar campos antes de acceder a ellos
                String title = l.getTitle() != null ? l.getTitle() : "invalid";
                String author = (l.getAuthor_name() != null) && !(l.getAuthor_name().isEmpty()) ? l.getAuthor_name().getFirst() : "invalid";
                String isbn = (l.getIsbn() != null) && !(l.getIsbn().isEmpty()) ? l.getIsbn().getFirst() : "invalid";

                // Imprimir los datos para verificación (puedes quitar esto después de la prueba)
                System.out.println("AUTOR: " + author);
                System.out.println("TITULO: " + title);
                System.out.println("ISBN: " + isbn);
                System.out.println("---------------------------------------");

                // Crea y agrega la tarjeta solo si los datos son válidos
                if (!author.equals("invalid") && !title.equals("invalid") && !isbn.equals("invalid")) {
                    BookCard card = new BookCard(title, author, isbn); // Puedes agregar ISBN si lo necesitas
                    panelBookCards.add(card);
                } else {
                    System.out.println("ESTE LIBRO ES INVALIDO");
                }
                panelBookCards.revalidate();
                panelBookCards.repaint();

            }

            //ListaLibros listaLibros1 = gson.fromJson(response.body(), ListaLibros.class);    
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JLabel labelExplorar;
    private javax.swing.JPanel panelBookCards;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JComboBox<String> selectSearchFilter;
    // End of variables declaration//GEN-END:variables
}
