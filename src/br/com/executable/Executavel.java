package br.com.executable;

import br.com.controller.UsuarioController;
import br.com.view.FrmLogin;

public class Executavel {

    public static void main(String[] args) {
        UsuarioController usuario = new UsuarioController();
        usuario.criarUsuarioPadrao();

        new FrmLogin().setVisible(true);
    }
}
