package br.com.dao;

import br.com.connection.Conexao;
import br.com.model.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MarcaDaoImpl implements MarcaDao {
    
    Connection conexao = null;
    PreparedStatement pstm = null;

    @Override
    public void salvarMarca(Marca marca) {
        conexao = new Conexao().getConnection();
        String sqlinsert = "INSERT INTO tb_marca(descricao) values(?)";
        try {
            pstm = conexao.prepareStatement(sqlinsert);
            pstm.setString(1, marca.getDescricao());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
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
    public void alterarMarca(Marca marca) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_marca SET descricao=? WHERE id=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, marca.getDescricao());
            pstm.setInt(2, marca.getId());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
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
    public void excluirMarca(int id) {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir o registro?");
        if (resp == 1) {
            JOptionPane.showMessageDialog(null, "Você não excluiu o registro");
        } else {
            conexao = new Conexao().getConnection();
            String query = "DELETE FROM tb_marca WHERE id=?";
            try {
                pstm = conexao.prepareStatement(query);
                pstm.setInt(1, id);
                pstm.execute();
                pstm.close();
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
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
    }

    @Override
    public List<Marca> getMarcas() {
        ResultSet rs = null;
        List<Marca> lista = new ArrayList<Marca>();
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_marca";
        try {
            pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            rs.first();
            do {
                Marca marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setDescricao(rs.getString("descricao"));

                lista.add(marca);

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
    public int buscarId(String descricao) {
        ResultSet rs = null;
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_marca WHERE descricao = ?";
        int id = 0;
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, descricao);
            rs = pstm.executeQuery();
            rs.first();
            id = rs.getInt("id");
        } catch (SQLException update) {
            System.out.println("Erro: " + update);
        } finally {
            try {
                conexao.close();
            } catch (SQLException updateclose) {
                System.out.println("Erro: " + updateclose);
            }
        }
        return id;
    }
    
}
