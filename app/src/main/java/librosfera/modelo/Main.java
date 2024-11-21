package librosfera.modelo;

import java.sql.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String user = "root";
        String password = "admin123";
        String url = "jdbc:mariadb://localhost/librosfera-bd";
        String query = "INSERT INTO USUARIO VALUES ('1', 'atenas', 'perez', 'ate@mail.com', 'ate123')";

        // INTEGRACION BASE DE DATOS //
        // Conectar al servidor local
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("CONEXION: " + con);

        // Crear un statement
        Statement st = con.createStatement();
        System.out.println("STATEMENT: " + st.toString());
        // Ejecutar query
        int count = st.executeUpdate(query);
        System.out.println(count);
        con.close();
    }
}
