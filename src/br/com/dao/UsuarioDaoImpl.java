package br.com.dao;

import br.com.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {
    
    List<Usuario> lista = new ArrayList<Usuario>();

    @Override
    public void salvarUsuario(Usuario usuario) {
        lista.add(usuario);
    }

    @Override
    public void alterarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getUsuarios() {
        return lista;
    }
    
}
