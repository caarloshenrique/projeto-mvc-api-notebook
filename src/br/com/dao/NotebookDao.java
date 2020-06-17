package br.com.dao;

import br.com.model.Notebook;
import br.com.model.NotebookReport;
import java.util.List;

public interface NotebookDao {

    public void salvarNotebook(Notebook notebook);

    public void alterarNotebook(Notebook notebook);

    public void excluirNotebook(int id);

    public List<Notebook> getNotebooks();

    public List<NotebookReport> getNotebooksGamer();

    public void gerarRelatorioCollection(List list, String CAMINHO_RELATORIO);
}
