package br.com.dao;

import br.com.model.Marca;
import java.util.List;

public interface MarcaDao {

    public void salvarMarca(Marca marca);

    public void alterarMarca(Marca marca);

    public void excluirMarca(int id);

    public List<Marca> getMarcas();

    public int buscarId(String descricao);
}
