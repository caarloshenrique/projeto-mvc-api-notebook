/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author Carlos
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemNotebook = new javax.swing.JMenuItem();
        menuItemMarcaNotebook = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuUtilitarios = new javax.swing.JMenu();
        menuItemCalculadora = new javax.swing.JMenuItem();
        menuItemBlocoNotas = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/images/img_principal.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        Desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 192, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 135, Short.MAX_VALUE))
        );

        menuCadastro.setText("Cadastro");

        menuItemNotebook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        menuItemNotebook.setText("Notebook");
        menuItemNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNotebookActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemNotebook);

        menuItemMarcaNotebook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        menuItemMarcaNotebook.setText("Marca");
        menuItemMarcaNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMarcaNotebookActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemMarcaNotebook);

        menuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        menuPrincipal.add(menuCadastro);

        menuUtilitarios.setText("Utilitários");

        menuItemCalculadora.setText("Calculadora");
        menuUtilitarios.add(menuItemCalculadora);

        menuItemBlocoNotas.setText("Bloco de notas");
        menuUtilitarios.add(menuItemBlocoNotas);

        menuPrincipal.add(menuUtilitarios);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuPrincipal.add(menuSair);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuItemNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNotebookActionPerformed
        FrmCadNotebook notebook = new FrmCadNotebook();
        Desktop.add(notebook);
        notebook.setVisible(true);
    }//GEN-LAST:event_menuItemNotebookActionPerformed

    private void menuItemMarcaNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMarcaNotebookActionPerformed
        FrmCadMarcaNotebook marca = new FrmCadMarcaNotebook();
        Desktop.add(marca);
        marca.setVisible(true);
    }//GEN-LAST:event_menuItemMarcaNotebookActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        FrmCadUsuario usuario  = new FrmCadUsuario();
        Desktop.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemBlocoNotas;
    private javax.swing.JMenuItem menuItemCalculadora;
    private javax.swing.JMenuItem menuItemMarcaNotebook;
    private javax.swing.JMenuItem menuItemNotebook;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuUtilitarios;
    // End of variables declaration//GEN-END:variables

    private FrmCadNotebook FrmCadNotebook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
