package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.MedicamentoDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Medicamento;
import br.edu.iftm.sistemahospitalarpt2.report.Reports;

public class ConsultaMedicamento extends javax.swing.JInternalFrame {

    private ArrayList<String> nomesMedicamentos;
    MedicamentoDAO medicamentoDAO;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String nomeAnt;
    Reports rm;

    public ConsultaMedicamento(MedicamentoDAO medicamentoDAO) {
        initComponents();
        this.medicamentoDAO = medicamentoDAO;
        atualiza();
        this.rm = new Reports();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbMedicamentos = new javax.swing.JComboBox<>();
        btConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfLaboratorio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDataValidade = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btRelatorio = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta de Medicamentos");

        jLabel1.setText("Medicamentos cadastrados:");

        cbMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedicamentosActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Laboratório:");

        jLabel4.setText("Data de Validade: dd/mm/aaaa");

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

        jLabel5.setText("Valor:");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)
                    .addComponent(btRelatorio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Medicamento m = medicamentoDAO.retornaMedicamento(cbMedicamentos.getSelectedItem().toString());
        tfNome.setText(m.getNome());
        tfLaboratorio.setText(m.getLaboratorio());
        tfDataValidade.setText(formato.format(m.getDataValidade()));
        tfValor.setText(String.valueOf(m.getValor()));
        nomeAnt = tfNome.getText();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cbMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedicamentosActionPerformed
        limpar();
    }//GEN-LAST:event_cbMedicamentosActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (!medicamentoDAO.testeContem(cbMedicamentos.getSelectedItem().toString())) {

            int op = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?");
            if (op == 0) {
                JOptionPane.showMessageDialog(this, "Medicamento excluído com sucesso!");
                medicamentoDAO.excluir(cbMedicamentos.getSelectedItem().toString());
                limpar();
                atualiza();
            } else {
                JOptionPane.showMessageDialog(this, "Operação cancelada!");
            }
        } else
            JOptionPane.showMessageDialog(this, "Medicamento vinculado a uma consulta!");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (testePreenche()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
            return;
        }

        Medicamento m = new Medicamento();

        Date dataValidade = null;
        try {
            dataValidade = formato.parse(tfDataValidade.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
        }

        Calendar dataHoje = Calendar.getInstance();
        Calendar data = new GregorianCalendar();
        data.setTime(dataValidade);
        if (dataValidade == null || data.before(dataHoje)) {
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
            return;
        }

        m.setDataValidade(dataValidade);
        m.setLaboratorio(tfLaboratorio.getText());
        m.setNome(tfNome.getText());
        m.setValor(Float.parseFloat(tfValor.getText()));

        ArrayList<String> medicamentos = medicamentoDAO.listarMedicamentos();
        if (!nomeAnt.equals(tfNome.getText())) {
            for (String n : medicamentos) {
                if (n.equals(tfNome.getText())) {
                    JOptionPane.showMessageDialog(this, "Medicamento já cadastrado!");
                    return;
                }
            }
        }

        medicamentoDAO.alterar(cbMedicamentos.getSelectedItem().toString(), m);
        limpar();
        atualiza();
        JOptionPane.showMessageDialog(this, "Medicamento alterado com sucesso!");
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        rm.getRelatorioMedicamento();
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void atualiza() {
        nomesMedicamentos = new ArrayList<>();
        nomesMedicamentos = medicamentoDAO.listarMedicamentos();
        cbMedicamentos.removeAllItems();
        for (String nome : nomesMedicamentos) {
            cbMedicamentos.addItem(nome);
        }
    }

    private void limpar() {
        tfDataValidade.setText("");
        tfNome.setText("");
        tfLaboratorio.setText("");
        tfValor.setText("");
    }

    private boolean testePreenche() {
        return tfValor.equals("") || tfDataValidade.equals("") || tfLaboratorio.equals("") || tfNome.equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JComboBox<String> cbMedicamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfDataValidade;
    private javax.swing.JTextField tfLaboratorio;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
