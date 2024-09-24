
package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.UsuarioDAO;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Usuario;

public class Login extends javax.swing.JInternalFrame {

    
    private UsuarioDAO usuarioDAO;
    public Login(UsuarioDAO usuarioDAO) {
        initComponents();
        this.usuarioDAO = usuarioDAO;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();

        setClosable(true);

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        btLogin.setText("LOGIN");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(tfSenha))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        Usuario u = new Usuario();
        u.setUsuario(tfUsuario.getText());
        u.setSenha(usuarioDAO.criptografarSenha(tfSenha.getText()));
        
        //RECEBE O PARÂMETRO PARA O TIPO DE LOGIN
        int verif = usuarioDAO.testarLogin(u);
        
        /*
        Verif = 0 -> Login não efetuado
        Verif = 1 -> Login com usuario normal
        Verif = 2 -> login como admin
        */
        if(verif>0){
            usuarioDAO.setStatus(true);
            if(verif==2)
                usuarioDAO.setStatusAdmin(true);
            else
                usuarioDAO.setStatusAdmin(false);
            setVisible(false);
            JOptionPane.showMessageDialog(this, "Login efetuado com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreta!");
        
    }//GEN-LAST:event_btLoginActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
