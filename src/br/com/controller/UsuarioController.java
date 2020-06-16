package br.com.controller;

import br.com.dao.UsuarioDao;
import br.com.dao.UsuarioDaoImpl;
import br.com.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioController {

    UsuarioDao usuarioDao = new UsuarioDaoImpl();

    public void salvarUsuario(Usuario usuario) {
        if (usuario != null && !usuario.getNome().equals("")
                && !usuario.getEmail().equals("")
                && !usuario.getSenha().equals("")) {
            usuarioDao.salvarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void alterarUsuario(Usuario usuario) {
        if (usuario != null && !usuario.getNome().equals("")
                && !usuario.getEmail().equals("")
                && !usuario.getSenha().equals("")) {
            usuarioDao.alterarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void excluirUsuario(int id) {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir o registro?");
        if (resp == 1) {
            JOptionPane.showMessageDialog(null, "Você não excluiu o registro");
        } else {
            if (id != 0) {
                usuarioDao.excluirUsuario(id);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Informe um usuário para ser excluída!");
            }
        }
    }

    public List<Usuario> getUsuarios() {
        List<Usuario> lista = new ArrayList<Usuario>();
        lista = usuarioDao.getUsuarios();
        return lista;
    }

    public boolean login(String login, String senha) {
        boolean acesso = false;
        if (!login.equals("") && !senha.equals("")) {
            acesso = usuarioDao.login(login, senha);
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
        return acesso;
    }

    public void criarUsuarioPadrao() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = getUsuarios();
        if (usuarios.isEmpty()) {
            Usuario novoUsuario = new Usuario();
            novoUsuario.setNome("admin");
            novoUsuario.setEmail("admin@ifms.edu.br");
            novoUsuario.setSenha("admin");

            salvarUsuario(novoUsuario);
        }
    }
}
