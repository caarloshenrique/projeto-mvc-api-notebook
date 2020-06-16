package br.com.dao;

import br.com.connection.Conexao;
import br.com.model.Notebook;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NotebookDaoImpl implements NotebookDao {

    Connection conexao = null;
    PreparedStatement pstm = null;

    @Override
    public void salvarNotebook(Notebook notebook) {
        conexao = new Conexao().getConnection();
        String sqlinsert = "INSERT INTO tb_notebook(modelo, marca, serie, tipo) values(?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sqlinsert);
            pstm.setString(1, notebook.getModelo());
            pstm.setInt(2, notebook.getMarca());
            pstm.setString(3, notebook.getSerie());
            pstm.setString(4, notebook.getTipo());
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
    public void alterarNotebook(Notebook notebook) {

        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_notebook SET modelo=?, marca=?, serie=?, tipo=? WHERE id=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, notebook.getModelo());
            pstm.setInt(2, notebook.getMarca());
            pstm.setString(3, notebook.getSerie());
            pstm.setString(4, notebook.getTipo());
            pstm.setInt(5, notebook.getId());
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
    public void excluirNotebook(int id) {

        conexao = new Conexao().getConnection();
        String query = "DELETE FROM tb_notebook WHERE id=?";
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
    public List<Notebook> getNotebooks() {
        ResultSet rs = null;
        List<Notebook> lista = new ArrayList<Notebook>();
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_notebook";
        try {
            pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            rs.first();
            do {
                Notebook notebook = new Notebook();
                notebook.setId(rs.getInt("id"));
                notebook.setModelo(rs.getString("modelo"));
                notebook.setMarca(rs.getInt("marca"));
                notebook.setSerie(rs.getString("serie"));
                notebook.setTipo(rs.getString("tipo"));

                lista.add(notebook);

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
}
