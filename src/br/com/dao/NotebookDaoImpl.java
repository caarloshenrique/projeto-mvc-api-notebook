package br.com.dao;

import br.com.model.Notebook;
import java.util.ArrayList;
import java.util.List;

public class NotebookDaoImpl implements NotebookDao {
    
    List<Notebook> lista = new ArrayList<Notebook>();

    @Override
    public void salvarNotebook(Notebook notebook) {
        lista.add(notebook);
    }

    @Override
    public void alterarNotebook(Notebook notebook) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirNotebook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Notebook> getNotebooks() {
        return lista;
    }
    
}
