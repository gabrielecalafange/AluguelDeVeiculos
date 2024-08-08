package Repository;

import Interface.Usuario;

import java.util.HashMap;
public class UsuariosRepository {
    private HashMap<String, Usuario> usuarios;

    public UsuariosRepository() {
        this.usuarios = new HashMap<>();
    }

    public void addUsuario(String cpf, Usuario usuario) {
        this.usuarios.put(cpf, usuario);
    }

    public void removerUsuario(String cpf) {
        this.usuarios.remove(cpf);
    }

    public Usuario getUsuario(String cpf) {
        return this.usuarios.get(cpf);
    }

}