package br.com.controller;

import br.com.dao.MarcaDao;
import br.com.dao.MarcaDaoImpl;
import br.com.dao.NotebookDao;
import br.com.dao.NotebookDaoImpl;
import br.com.model.Notebook;
import br.com.model.NotebookReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class NotebookController {

    NotebookDao notebookDao = new NotebookDaoImpl();
    MarcaDao marcaDao = new MarcaDaoImpl();

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

    public List<NotebookReport> getListaNotebooks() {
        List<Notebook> listaNotebooks = new ArrayList<Notebook>();
        List<NotebookReport> lista = new ArrayList<NotebookReport>();

        listaNotebooks = notebookDao.getNotebooks();
        lista = construirObjetoNotebookReports(listaNotebooks);

        return lista;
    }

    public void gerarRelatorioGeral() throws JRException {
        HashMap filtro = new HashMap();
        JRBeanCollectionDataSource colecao = new JRBeanCollectionDataSource(getListaNotebooks(), false);

        JasperPrint imprimir = JasperFillManager.fillReport("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\ProjetoMVCAPI\\src\\br\\com\\reports\\ReportNotebooks.jasper", filtro, colecao);
        JasperViewer visualizar = new JasperViewer(imprimir, false);
        visualizar.setVisible(true);
    }

    public List<NotebookReport> construirObjetoNotebookReports(List<Notebook> listaNotebooks) {
        List<NotebookReport> lista = new ArrayList<NotebookReport>();

        for (int i = 0; i < listaNotebooks.size(); i++) {
            NotebookReport notebookReport = new NotebookReport();
            notebookReport.setId(listaNotebooks.get(i).getId());
            notebookReport.setModelo(listaNotebooks.get(i).getModelo());
            notebookReport.setDescricao(marcaDao.buscarDescricao(listaNotebooks.get(i).getMarca()));
            notebookReport.setSerie(listaNotebooks.get(i).getSerie());
            notebookReport.setTipo(listaNotebooks.get(i).getTipo());
            lista.add(notebookReport);
        }

        return lista;
    }
}
