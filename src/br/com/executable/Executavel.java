package br.com.executable;

import br.com.dao.UsuarioDaoImpl;
import br.com.view.FrmLogin;

public class Executavel {

    public static void main(String[] args) {
        UsuarioDaoImpl usuario = new UsuarioDaoImpl();
        usuario.criarUsuarioPadrao();
        
        new FrmLogin().setVisible(true);
    }
}
