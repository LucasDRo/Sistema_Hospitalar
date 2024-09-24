package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.ExameDAO;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Exame;
import java.util.ArrayList;


public class CadastroExame extends javax.swing.JInternalFrame {

    ExameDAO exaDAO;
    public CadastroExame(ExameDAO exaDAO) {
        initComponents();
        this.exaDAO = exaDAO;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadasrto de exames");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exame.png"))); // NOI18N

        jLabel3.setText("Nome:");

        jLabel4.setText("Tipo:");

        jLabel2.setText("Valor:");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tfTipo)
                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(tfValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        if(testePreenche()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }
        
        Exame e = new Exame();
        
        ArrayList<String> exames = exaDAO.listarExames();
        for(String n : exames){
            if(n.equals(tfNome.getText())){
                JOptionPane.showMessageDialog(this, "Exame já cadastrado!");
                return;
            }
        }
        
        e.setNome(tfNome.getText());
        e.setTipo(tfTipo.getText());
        e.setValor(Float.parseFloat(tfValor.getText()));
        
        exaDAO.cadastro(e);
        JOptionPane.showMessageDialog(this, "Exame cadastrado com sucesso!");
        limpar();

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed
    
    private void limpar(){
        tfNome.setText("");
        tfTipo.setText("");
        tfValor.setText("");
    }

    private boolean testePreenche(){
        return tfNome.getText().equals("") || tfTipo.getText().equals("")|| tfValor.getText().equals("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
