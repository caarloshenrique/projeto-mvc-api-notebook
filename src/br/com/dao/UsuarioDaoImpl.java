package br.com.dao;

import br.com.connection.Conexao;
import br.com.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {
    
    Connection conexao = null;
    PreparedStatement pstm = null;
    
    @Override
    public void salvarUsuario(Usuario usuario) {
        conexao = new Conexao().getConnection();
        String sqlinsert = "INSERT INTO tb_usuario(nome, email, senha) values(?,?,?)";
        try {
            pstm = conexao.prepareStatement(sqlinsert);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getSenha());
            pstm.execute();
            pstm.close();
        } catch (SQLException insert) {
            System.out.println("Erro: " + insert);
        } finally {
            try {
                conexao.close();
            } catch (SQLException insertclose) {
                System.out.println("Erro: " + insertclose);
            }
        }
    }
    
    @Override
    public void alterarUsuario(Usuario usuario) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_usuario SET nome=?, email=?, senha=? WHERE id=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getSenha());
            pstm.setInt(4, usuario.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException update) {
            System.out.println("Erro: " + update);
        } finally {
            try {
                conexao.close();
            } catch (SQLException updateclose) {
                System.out.println("Erro: " + updateclose);
            }
        }
    }
    
    @Override
    public void excluirUsuario(int id) {
        conexao = new Conexao().getConnection();
        String query = "DELETE FROM tb_usuario WHERE id=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, id);
            pstm.execute();
            pstm.close();
        } catch (SQLException delete) {
            System.out.println("Erro: " + delete);
        } finally {
            try {
                conexao.close();
            } catch (SQLException deleteclose) {
                System.out.println("Erro: " + deleteclose);
            }
        }
    }
    
    @Override
    public List<Usuario> getUsuarios() {
        ResultSet rs = null;
        List<Usuario> lista = new ArrayList<Usuario>();
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_usuario";
        try {
            pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            rs.first();
            do {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                
                lista.add(usuario);
                
            } while (rs.next());
        } catch (SQLException errolistar) {
            System.out.println("Erro: " + errolistar);
        } finally {
            try {
                conexao.close();
            } catch (SQLException errofechar) {
                System.out.println("Erro: " + errofechar);
            }
        }
        return lista;
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
