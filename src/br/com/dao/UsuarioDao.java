package br.com.dao;

import br.com.model.Usuario;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRException;

public interface UsuarioDao {

    public void salvarUsuario(Usuario usuario);

    public void alterarUsuario(Usuario usuario);

    public void excluirUsuario(int id);

    public List<Usuario> getUsuarios();

    public boolean login(String login, String senha);

    public void getUsuario(String nomeUsuario);

    public void gerarRelatorioResultSet(ResultSet rs, HashMap filtro, String CAMINHO_RELATORIO) throws JRException;
}
