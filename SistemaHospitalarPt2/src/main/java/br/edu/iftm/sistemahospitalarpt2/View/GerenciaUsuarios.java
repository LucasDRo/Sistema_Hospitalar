package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.UsuarioDAO;
import br.edu.iftm.sistemahospitalarpt2.report.Reports;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciaUsuarios extends javax.swing.JInternalFrame {

    ArrayList<String> users;
    UsuarioDAO userDAO;
    Reports rm;

    public GerenciaUsuarios(UsuarioDAO userDAO) {
        initComponents();
        this.userDAO = userDAO;
        this.rm = new Reports();
        atualiza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbUsuarios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gerenciamento de usuários");

        cbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuariosActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuários cadastrados:");

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btExcluir)
                        .addGap(141, 141, 141))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btRelatorio)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btRelatorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuariosActionPerformed

    }//GEN-LAST:event_cbUsuariosActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (userDAO.isStatusAdmin()) {
            String user = cbUsuarios.getSelectedItem().toString();
            if (!userDAO.getUserAtual().equals(user)) {
                if (!user.equals("admin")) {
                    int op = JOptionPane.showConfirmDialog(this, "Confirma a exclusão?");
                    if (op == 0) {
                        userDAO.excluir(user);
                        atualiza();
                        JOptionPane.showMessageDialog(this, "Usuário excluido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Operação cancelada!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Não é possível excluir esse usuário!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Entre com outro usuário para excluir o atual!");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Entre como adiministrador para ter acesso a essa funcionalidade!");
            setVisible(false);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        rm.getRelatorioUsuario();
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void atualiza() {
        users = new ArrayList<>();
        users = userDAO.listarNomesUsers();
        cbUsuarios.removeAllItems();
        for (String user : users) {
            cbUsuarios.addItem(user);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JComboBox<String> cbUsuarios;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
