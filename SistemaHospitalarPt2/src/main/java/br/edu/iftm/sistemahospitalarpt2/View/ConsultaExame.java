package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.ExameDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Exame;
import br.edu.iftm.sistemahospitalarpt2.report.Reports;

public class ConsultaExame extends javax.swing.JInternalFrame {

    private ArrayList<String> nomesExames;
    ExameDAO exaDAO;
    String nomeAnt;
    Reports rm;

    public ConsultaExame(ExameDAO exaDAO) {
        initComponents();
        this.exaDAO = exaDAO;
        this.rm = new Reports();
        atualiza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbExames = new javax.swing.JComboBox<>();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRelatorio1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setClosable(true);
        setTitle("Consulta de exames");

        jLabel3.setText("Nome:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo:");

        jLabel2.setText("Valor:");

        jLabel1.setText("Exames cadastrados:");

        cbExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbExamesActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRelatorio1.setText("Relatório");
        btRelatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbExames, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultar)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(tfTipo)
                            .addComponent(tfNome)
                            .addComponent(jLabel2)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btRelatorio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbExames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
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
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)
                    .addComponent(btRelatorio1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbExamesActionPerformed
        limpar();
    }//GEN-LAST:event_cbExamesActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Exame e = exaDAO.retornaExame(cbExames.getSelectedItem().toString());
        tfNome.setText(e.getNome());
        tfTipo.setText(e.getTipo());
        tfValor.setText(String.valueOf(e.getValor()));
        nomeAnt = tfNome.getText();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (!exaDAO.testeContem(cbExames.getSelectedItem().toString())) {

            int op = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?");
            if (op == 0) {
                JOptionPane.showMessageDialog(this, "Exame excluído com sucesso!");
                exaDAO.excluir(cbExames.getSelectedItem().toString());
                limpar();
                atualiza();
            } else {
                JOptionPane.showMessageDialog(this, "Operação cancelada!");
            }
        } else
            JOptionPane.showMessageDialog(this, "Exame vincualdo a uma consulta!");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Confirmar alteração?");
        if (op == 0) {
            if (testePreenche()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
                return;
            }

            ArrayList<String> exames = exaDAO.listarExames();
            if (!nomeAnt.equals(tfNome.getText())) {
                for (String n : exames) {
                    if (n.equals(tfNome.getText())) {
                        JOptionPane.showMessageDialog(this, "Exame já cadastrado!");
                        return;
                    }
                }
            }

            Exame e = new Exame();
            e.setNome(tfNome.getText());
            e.setTipo(tfTipo.getText());
            e.setValor(Float.parseFloat(tfValor.getText()));

            exaDAO.alterar(cbExames.getSelectedItem().toString(), e);
            JOptionPane.showMessageDialog(this, "Exame alterado com sucesso!");
            limpar();
            atualiza();

        } else {
            JOptionPane.showMessageDialog(this, "Operação cancelada!");
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btRelatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorio1ActionPerformed
        rm.getRelatorioExame();
    }//GEN-LAST:event_btRelatorio1ActionPerformed

    private void atualiza() {
        nomesExames = new ArrayList<>();
        nomesExames = exaDAO.listarExames();
        cbExames.removeAllItems();
        for (String nome : nomesExames) {
            cbExames.addItem(nome);
        }
    }

    private boolean testePreenche() {
        return tfNome.getText().equals("") || tfTipo.getText().equals("") || tfValor.getText().equals("");
    }

    private void limpar() {
        tfNome.setText("");
        tfTipo.setText("");
        tfValor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btRelatorio1;
    private javax.swing.JComboBox<String> cbExames;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
