package br.com.dao;

import br.com.connection.Conexao;
import br.com.model.NotebookReport;
import br.com.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

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

    @Override
    public boolean login(String login, String senha) {
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        ResultSet rs;
        try {
            conexao = new Conexao().getConnection();
            pstm = conexao.prepareStatement(sql);
            this.pstm.setString(1, login);
            this.pstm.setString(2, senha);

            rs = pstm.executeQuery();

            if (rs.first()) {
                this.pstm.close();
                conexao.close();
                return true;
            }
        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "Usuário inválido!");
        }
        return false;
    }

    @Override
    public void getUsuario(String nomeUsuario) {
        ResultSet rs = null;
        List<NotebookReport> lista = new ArrayList<NotebookReport>();
        conexao = new Conexao().getConnection();
        String query = "SELECT id, nome, email FROM tb_usuario WHERE nome=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, nomeUsuario);
            rs = pstm.executeQuery();

            HashMap filtro = new HashMap();
            filtro.put("paramNome", nomeUsuario);
            String CAMINHO_RELATORIO = "C:\\Users\\Carlos\\Documents\\NetBeansProjects\\ProjetoMVCAPI\\src\\br\\com\\reports\\ReportUsuario.jasper";
            gerarRelatorioResultSet(rs, filtro, CAMINHO_RELATORIO);
        } catch (SQLException errolistar) {
            System.out.println("Erro: " + errolistar);
        } catch (JRException ex) {
            Logger.getLogger(NotebookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException errofechar) {
                System.out.println("Erro: " + errofechar);
            }
        }
    }

    @Override
    public void gerarRelatorioResultSet(ResultSet rs, HashMap filtro, String CAMINHO_RELATORIO) throws JRException {
        JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);

        JasperPrint imprimir = JasperFillManager.fillReport(CAMINHO_RELATORIO, filtro, jrrs);
        JasperViewer visualizar = new JasperViewer(imprimir, false);
        visualizar.setVisible(true);
    }

}
