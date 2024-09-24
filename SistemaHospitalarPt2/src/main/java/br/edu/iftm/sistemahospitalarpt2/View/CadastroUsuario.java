package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.UsuarioDAO;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Usuario;

public class CadastroUsuario extends javax.swing.JInternalFrame {

    private UsuarioDAO userDAO;
    
    public CadastroUsuario(UsuarioDAO userDAO) {
        initComponents();
        this.userDAO = userDAO;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAdmin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        btCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbPermAdminNao = new javax.swing.JRadioButton();
        rbPermAdminSim = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NewUser.png"))); // NOI18N

        jLabel3.setText("Usuário:");

        jLabel4.setText("Senha:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Permissões de admin:");

        bgAdmin.add(rbPermAdminNao);
        rbPermAdminNao.setText("Não conceder");
        rbPermAdminNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPermAdminNaoActionPerformed(evt);
            }
        });

        bgAdmin.add(rbPermAdminSim);
        rbPermAdminSim.setText("Conceder");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(tfUsuario)
                    .addComponent(jLabel4)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPermAdminSim)
                            .addComponent(jLabel5)
                            .addComponent(rbPermAdminNao))
                        .addGap(107, 107, 107))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPermAdminSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPermAdminNao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if (userDAO.isStatusAdmin()) {
            Usuario u = new Usuario();
            u.setUsuario(tfUsuario.getText());
            u.setSenha(userDAO.criptografarSenha(tfSenha.getText()));
            
            
            if (rbPermAdminSim.isSelected()) {
                u.setAdmin(true);
            } else {
                u.setAdmin(false);
            }

            userDAO.cadastro(u);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Faça login como administrador para acessar esta funcionalidade!");
        }
        setVisible(false);

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void rbPermAdminNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPermAdminNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPermAdminNaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAdmin;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbPermAdminNao;
    private javax.swing.JRadioButton rbPermAdminSim;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
