package br.com.controller;

import br.com.dao.MarcaDao;
import br.com.dao.MarcaDaoImpl;
import br.com.model.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MarcaController {

    MarcaDao marcaDao = new MarcaDaoImpl();

    public void salvarMarca(Marca marca) {
        if (marca != null && !marca.getDescricao().equals("")) {
            marcaDao.salvarMarca(marca);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void alterarMarca(Marca marca) {
        if (marca != null && !marca.getDescricao().equals("")) {
            marcaDao.alterarMarca(marca);
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void excluirMarca(int id) {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir o registro?");
        if (resp == 1) {
            JOptionPane.showMessageDialog(null, "Você não excluiu o registro");
        } else {
            if (id != 0) {
                marcaDao.excluirMarca(id);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Informe uma marca para ser excluída!");
            }
        }
    }

    public List<Marca> getMarcas() {
        List<Marca> lista = new ArrayList<Marca>();
        lista = marcaDao.getMarcas();
        return lista;
    }

    public int buscarId(String descricao) {
        int id = marcaDao.buscarId(descricao);
        return id;
    }
    
    public String buscarDescricao(int id) {
        String descricao = marcaDao.buscarDescricao(id);
        return descricao;
    }
}
