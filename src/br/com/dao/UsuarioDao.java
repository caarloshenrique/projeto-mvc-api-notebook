package br.com.dao;

import br.com.model.Usuario;
import java.util.List;

public interface UsuarioDao {

    public void salvarUsuario(Usuario usuario);

    public void alterarUsuario(Usuario usuario);

    public void excluirUsuario(int id);
    
    public List<Usuario> getUsuarios();

}
