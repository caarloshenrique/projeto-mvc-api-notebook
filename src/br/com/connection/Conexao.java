package br.com.connection;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection conexao;

    private final String url = "jdbc:mysql://localhost:3306/db_notebook";
    private final String usuario = "root";
    private final String senha = "";
    private final String driver = "com.mysql.jdbc.Driver";

    public Connection getConnection() {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException drive) {
            JOptionPane.showMessageDialog(null, "Drive não encontrado " + drive);
        } catch (SQLException fonte) {
            JOptionPane.showMessageDialog(null, "Fonte de dados não encontrada " + fonte);
        }
        return conexao;
    }

}
