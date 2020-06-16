package br.com.controller;

import br.com.dao.NotebookDao;
import br.com.dao.NotebookDaoImpl;
import br.com.model.Notebook;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NotebookController {

    NotebookDao notebookDao = new NotebookDaoImpl();

    public void salvarNotebook(Notebook notebook) {
        if (notebook != null && !notebook.getModelo().equals("")
                && !notebook.getSerie().equals("")
                && notebook.getMarca() != 0
                && !notebook.getSerie().equals("")
                && !notebook.getTipo().equals("")) {
            notebookDao.salvarNotebook(notebook);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void alterarNotebook(Notebook notebook) {
        if (notebook != null && !notebook.getModelo().equals("")
                && !notebook.getSerie().equals("")
                && notebook.getMarca() != 0
                && !notebook.getSerie().equals("")
                && !notebook.getTipo().equals("")) {
            notebookDao.alterarNotebook(notebook);
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void excluirNotebook(int id) {
        if (id != 0) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir o registro?");
            if (resp == 1) {
                JOptionPane.showMessageDialog(null, "Você não excluiu o registro");
            } else {
                notebookDao.excluirNotebook(id);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um notebook para ser excluído!");
        }
    }

    public List<Notebook> getNotebooks() {
        List<Notebook> lista = new ArrayList<Notebook>();
        lista = notebookDao.getNotebooks();
        return lista;
    }
}
