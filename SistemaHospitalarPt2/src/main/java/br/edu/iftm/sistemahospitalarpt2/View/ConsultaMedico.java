package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.MedicoDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Medico;
import br.edu.iftm.sistemahospitalarpt2.report.Reports;

public class ConsultaMedico extends javax.swing.JInternalFrame {

    MedicoDAO medDAO;
    private ArrayList<String> nomesMedicos;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String nomeAnt;
    Reports rm;

    public ConsultaMedico(MedicoDAO medDAO) {
        initComponents();
        this.medDAO = medDAO;
        this.rm = new Reports();
        atualiza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbMedicos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        tfDataNasc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCrm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEspecializacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btEcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tfidade = new javax.swing.JTextField();
        btRelatorio = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta de médicos");

        jLabel1.setText("Médicos cadastrados:");

        cbMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedicosActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel9.setText("Salário:");

        jLabel4.setText("Data de Nascimento (dd/mm/aaaa):");

        jLabel7.setText("CRM:");

        jLabel8.setText("Especialização:");

        jLabel6.setText("RG:");

        jLabel5.setText("Telefone:");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btEcluir.setText("Excluir");
        btEcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jLabel10.setText("Idade:");

        tfidade.setEditable(false);

        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btRelatorio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterar)
                            .addGap(18, 18, 18)
                            .addComponent(btEcluir))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(cbMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btConsultar)
                            .addGap(51, 51, 51)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel4))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(tfDataNasc))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(tfRg)
                        .addComponent(tfEspecializacao)
                        .addComponent(tfCrm, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGap(0, 161, Short.MAX_VALUE)))
                    .addGap(82, 82, 82)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEcluir)
                    .addComponent(btAlterar)
                    .addComponent(btRelatorio))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(106, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {
            String nome = nomesMedicos.get(cbMedicos.getSelectedIndex());
            Medico m = medDAO.retornaMedico(nome);

            tfCpf.setText(m.getCpf());
            tfCrm.setText(m.getCrm());
            tfDataNasc.setText(formato.format(m.dataNasc()));
            tfEspecializacao.setText(m.getEspecializacao());
            tfNome.setText(m.getNome());
            tfRg.setText(m.getRg());
            tfSalario.setText(String.valueOf(m.getSalario()));
            tfTelefone.setText(m.getTelefone());
            tfidade.setText(String.valueOf(m.getIdade()));

            nomeAnt = tfNome.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum médico cadastrado!");
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        String nome = nomesMedicos.get(cbMedicos.getSelectedIndex());

        if (testePreenche()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
            return;
        }

        Medico m = new Medico();

        Date dataNasc = null;
        try {
            dataNasc = formato.parse(tfDataNasc.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
        }

        Calendar dataHoje = Calendar.getInstance();
        Calendar data = new GregorianCalendar();
        data.setTime(dataNasc);
        if (dataNasc == null || data.after(dataHoje)) {
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
            return;
        }

        m.setDataNasc(dataNasc);
        m.setIdade(dataNasc);
        m.setCpf(tfCpf.getText());
        m.setCrm(tfCrm.getText());
        m.setEspecializacao(tfEspecializacao.getText());
        m.setNome(tfNome.getText());
        m.setRg(tfRg.getText());
        m.setSalario(Double.valueOf(tfSalario.getText()));
        m.setTelefone(tfTelefone.getText());

        ArrayList<String> pessoas = medDAO.listarPessoas();
        if (!nomeAnt.equals(tfNome.getText())) {
            for (String n : pessoas) {
                if (n.equals(tfNome.getText())) {
                    JOptionPane.showMessageDialog(this, "Pessoa já cadastrado!");
                    return;
                }
            }
        }

        medDAO.alterar(nome, m);

        JOptionPane.showMessageDialog(this, "Médico alterado com sucesso!");
        limpar();
        atualiza();

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btEcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEcluirActionPerformed
        String nome = nomesMedicos.get(cbMedicos.getSelectedIndex());
        if (!medDAO.testeContem(nome)) {

            int op = JOptionPane.showConfirmDialog(this, "Confirma a exclusão?");
            if (op == 0) {

                medDAO.excluir(nome);
                JOptionPane.showMessageDialog(this, "Médico excluido com sucesso!");
                limpar();
                atualiza();
            } else {
                JOptionPane.showMessageDialog(this, "Operação cancelada!");
            }
        }else
            JOptionPane.showMessageDialog(this, "Médico vinculado a um consulta!");
    }//GEN-LAST:event_btEcluirActionPerformed

    private void cbMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedicosActionPerformed
        limpar();
    }//GEN-LAST:event_cbMedicosActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        rm.getRelatorioMedico();
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void atualiza() {
        nomesMedicos = new ArrayList<>();
        nomesMedicos = medDAO.listarMedicos();
        cbMedicos.removeAllItems();
        for (String nome : nomesMedicos) {
            cbMedicos.addItem(nome);
        }
    }

    private void limpar() {
        tfCpf.setText("");
        tfCrm.setText("");
        tfEspecializacao.setText("");
        tfDataNasc.setText("");
        tfNome.setText("");
        tfRg.setText("");
        tfSalario.setText("");
        tfTelefone.setText("");
        tfidade.setText("");
    }

    private boolean testePreenche() {
        return tfCpf.getText().equals("") || tfCrm.getText().equals("") || tfEspecializacao.getText().equals("")
                || tfNome.getText().equals("") || tfRg.getText().equals("") || tfSalario.getText().equals("")
                || tfTelefone.getText().equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEcluir;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JComboBox<String> cbMedicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfCrm;
    private javax.swing.JTextField tfDataNasc;
    private javax.swing.JTextField tfEspecializacao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfidade;
    // End of variables declaration//GEN-END:variables
}
