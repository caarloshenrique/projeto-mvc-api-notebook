/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.connection.Conexao;
import br.com.controller.UsuarioController;
import br.com.model.Usuario;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class FrmCadUsuario extends javax.swing.JInternalFrame {

    int indice = 0;
    int idincrement = 0;
    List<Usuario> lista = new ArrayList<Usuario>();
    UsuarioController usuarioController = new UsuarioController();

    /**
     * Creates new form FrmCadUsuario
     */
    public FrmCadUsuario() {
        initComponents();
        Connection conexao = new Conexao().getConnection();

        txtId.setEnabled(false);
        lista = usuarioController.getUsuarios();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ainda não foram cadastrados usuários");
        } else {
            mostrarDados();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblIconeUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        lblTituloLista = new javax.swing.JLabel();
        lblIconeLista = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Usuários");

        txtTitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 153, 51));
        txtTitulo.setText("Cadastro de Usuários");

        lblNome.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 153, 51));
        lblNome.setText("Nome:");

        lblEmail.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 153, 51));
        lblEmail.setText("E-mail:");

        lblSenha.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 153, 51));
        lblSenha.setText("Senha:");

        btnPrimeiro.setBackground(new java.awt.Color(255, 153, 51));
        btnPrimeiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(255, 153, 51));
        btnAnterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(255, 153, 51));
        btnProximo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(255, 153, 51));
        btnUltimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(255, 153, 51));
        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/img_adicionar_white.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 153, 51));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/img_salvar_white.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 153, 51));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/img_editar_white.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 153, 51));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/img_excluir_white.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 153, 51));
        lblId.setText("Id:");

        lblIconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/user-icon.png"))); // NOI18N

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "E-mail"
            }
        ));
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        tbUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbUsuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        lblTituloLista.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTituloLista.setForeground(new java.awt.Color(255, 153, 51));
        lblTituloLista.setText("Lista de Usuários");

        lblIconeLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/user-list.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblId)
                    .addComponent(lblSenha)
                    .addComponent(lblEmail)
                    .addComponent(lblNome)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addComponent(txtSenha)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiro)
                                .addGap(48, 48, 48)
                                .addComponent(btnAnterior)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnProximo)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnUltimo))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir))))
                    .addComponent(txtId))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloLista)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(lblIconeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconeLista)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo)
                            .addComponent(lblTituloLista))
                        .addGap(24, 24, 24)
                        .addComponent(lblIconeUsuario))
                    .addComponent(lblIconeLista, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiro)
                            .addComponent(btnAnterior)
                            .addComponent(btnProximo)
                            .addComponent(btnUltimo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnSalvar)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        indice = 0;
        mostrarDados();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        indice--;
        if (indice < 0) {
            indice++;
            JOptionPane.showMessageDialog(this, "Você já está no primeiro registro");
        }
        mostrarDados();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        indice++;
        if (indice > lista.size() - 1) {
            indice--;
            JOptionPane.showMessageDialog(this, "Você já está no último registro");
        } else {
            mostrarDados();
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        idincrement++;
        txtId.setText("" + idincrement);
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Usuario usuario = new Usuario();
        usuario.setId(Integer.parseInt(txtId.getText()));
        usuario.setNome(txtNome.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setSenha(txtSenha.getText());

        usuarioController.salvarUsuario(usuario);
        lista.clear();
        lista = usuarioController.getUsuarios();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Usuario usuario = new Usuario();
        usuario.setId(Integer.parseInt(txtId.getText()));
        usuario.setNome(txtNome.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setSenha(txtSenha.getText());

        usuarioController.alterarUsuario(usuario);
        lista.clear();
        lista = usuarioController.getUsuarios();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = (Integer.parseInt(txtId.getText()));

        usuarioController.excluirUsuario(id);
        lista.clear();
        lista = usuarioController.getUsuarios();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        preencherDadosFormulario();
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void tbUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbUsuariosKeyReleased
        if (evt.getKeyCode() == 38 || evt.getKeyCode() == 40) {
            preencherDadosFormulario();
        }
    }//GEN-LAST:event_tbUsuariosKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIconeLista;
    private javax.swing.JLabel lblIconeUsuario;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloLista;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    public void mostrarDados() {
        txtId.setText("" + lista.get(indice).getId());
        txtNome.setText(lista.get(indice).getNome());
        txtEmail.setText(lista.get(indice).getEmail());
        txtSenha.setText(lista.get(indice).getSenha());
        preencheTabela();
    }

    public void preencheTabela() {
        tbUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);

        DefaultTableModel modelo = (DefaultTableModel) tbUsuarios.getModel();

        modelo.setNumRows(0);
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[]{lista.get(i).getId(), lista.get(i).getNome(), lista.get(i).getEmail()});
        }
    }

    public void preencherDadosFormulario() {
        int indiceDaTabela = tbUsuarios.getSelectedRow();
        txtId.setText("" + tbUsuarios.getValueAt(indiceDaTabela, 0));
        txtNome.setText(tbUsuarios.getValueAt(indiceDaTabela, 1).toString());
        txtEmail.setText(tbUsuarios.getValueAt(indiceDaTabela, 2).toString());
    }
}
