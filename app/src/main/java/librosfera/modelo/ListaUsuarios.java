package librosfera.modelo;

import java.util.ArrayList;
import java.util.Optional;

public class ListaUsuarios {

    // LISTA DE USUARIOS //
    ArrayList<Usuario> listaUsuarios;

    // CONSTRUCTOR //
    public ListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    // GETTER //
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    // MÉTODOS //
    // Agregar usuario a la lista
    public void agregarUsuario(Usuario user) {
        this.listaUsuarios.add(user);
    }

    // Buscar usuario en la lista
    public Optional<Usuario> buscarUsuario(String id) {
        // itera cada usuario en la lista
        for (Usuario user : this.listaUsuarios) {
            // si encuentra el usuario, es retornado
            if (user.idUsuario.equals(id)) {
                return Optional.of(user);
            }
        }
        // en caso contrario, devuelve null
        return Optional.empty();
    }

    public void eliminarUsuario(String id) {

    }

}
