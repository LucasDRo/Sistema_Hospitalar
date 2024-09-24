package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.PacienteDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Paciente;
import br.edu.iftm.sistemahospitalarpt2.report.Reports;

public class ConsultaPaciente extends javax.swing.JInternalFrame {

    PacienteDAO pacDAO;
    private ArrayList<String> nomesPacientes;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String nomeAnt;
    Reports rm;

    public ConsultaPaciente(PacienteDAO pacDAO) {
        initComponents();
        this.pacDAO = pacDAO;
        this.rm = new Reports();
        atualiza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cbPacientes = new javax.swing.JComboBox<>();
        btConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDataNasc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rbPossui = new javax.swing.JRadioButton();
        rbNPossui = new javax.swing.JRadioButton();
        tfidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btEcluir = new javax.swing.JButton();
        tfTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btRelatorio = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Consulta de pacientes");

        jLabel1.setText("Pacientes cadastrados:");

        cbPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPacientesActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF:");

        jLabel9.setText("RG:");

        jLabel4.setText("Data de Nascimento (dd/mm/aaaa):");

        tfDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataNascActionPerformed(evt);
            }
        });

        jLabel8.setText("Endereço:");

        jLabel10.setText("Plano de saúde:");

        buttonGroup1.add(rbPossui);
        rbPossui.setText("Possui");

        buttonGroup1.add(rbNPossui);
        rbNPossui.setText("Não Possui");

        tfidade.setEditable(false);
        tfidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Idade:");

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btEcluir.setText("Excluir");
        btEcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEcluirActionPerformed(evt);
            }
        });

        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone:");

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
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btEcluir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfEndereco))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPossui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNPossui))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rbPossui)
                            .addComponent(rbNPossui))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEcluir)
                            .addComponent(btAlterar)
                            .addComponent(btRelatorio)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataNascActionPerformed

    private void tfidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidadeActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        String nome = nomesPacientes.get(cbPacientes.getSelectedIndex());

        if (testePreenche()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
            return;
        }

        Paciente p = new Paciente();

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

        p.setDataNasc(dataNasc);
        p.setIdade(dataNasc);
        p.setCpf(tfCpf.getText());
        p.setEndereco(tfEndereco.getText());
        p.setTelefone(tfTelefone.getText());
        if (rbPossui.isSelected()) {
            p.setPlano(true);
        } else {
            p.setPlano(false);
        }
        p.setNome(tfNome.getText());
        p.setRg(tfRg.getText());

        ArrayList<String> pessoas = pacDAO.listarPessoas();
        if (!nomeAnt.equals(tfNome.getText())) {
            for (String n : pessoas) {
                if (n.equals(tfNome.getText())) {
                    JOptionPane.showMessageDialog(this, "Pessoa já cadastrado!");
                    return;
                }
            }
        }

        pacDAO.alterar(nome, p);

        JOptionPane.showMessageDialog(this, "Paciente alterado com sucesso!");
        limpar();
        atualiza();

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btEcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEcluirActionPerformed
        String nome = nomesPacientes.get(cbPacientes.getSelectedIndex());

        if (!pacDAO.testeContem(nome)) {
            int op = JOptionPane.showConfirmDialog(this, "Confirma a exclusão?");
            if (op == 0) {

                pacDAO.excluir(nome);
                JOptionPane.showMessageDialog(this, "Paciente excluido com sucesso!");
                limpar();
                atualiza();

            } else {
                JOptionPane.showMessageDialog(this, "Operação cancelada!");
            }
        } else
            JOptionPane.showMessageDialog(this, "Paciente vinculado a um consulta!");
    }//GEN-LAST:event_btEcluirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {

            String nome = nomesPacientes.get(cbPacientes.getSelectedIndex());
            Paciente p = pacDAO.retornaPaciente(nome);

            tfCpf.setText(p.getCpf());
            tfDataNasc.setText(formato.format(p.dataNasc()));
            tfNome.setText(p.getNome());
            tfRg.setText(p.getRg());
            tfTelefone.setText(p.getTelefone());
            tfidade.setText(String.valueOf(p.getIdade()));
            tfEndereco.setText(p.getEndereco());
            if (p.isPlano()) {
                rbPossui.setSelected(true);
            } else {
                rbNPossui.setSelected(true);
            }
            nomeAnt = tfNome.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum paciente cadastrado!");
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void cbPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPacientesActionPerformed
        limpar();
    }//GEN-LAST:event_cbPacientesActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        rm.getRelatorioPaciente();
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void atualiza() {
        nomesPacientes = new ArrayList<>();
        nomesPacientes = pacDAO.listarPacientes();
        cbPacientes.removeAllItems();
        for (String nome : nomesPacientes) {
            cbPacientes.addItem(nome);
        }
    }

    private void limpar() {
        tfCpf.setText("");
        tfDataNasc.setText("");
        tfNome.setText("");
        tfRg.setText("");
        tfEndereco.setText("");
        tfidade.setText("");
        tfTelefone.setText("");
        buttonGroup1.clearSelection();
    }

    private boolean testePreenche() {
        return tfCpf.getText().equals("") || tfEndereco.getText().equals("")
                || tfNome.getText().equals("") || tfRg.getText().equals("")
                || tfTelefone.getText().equals("") || (!rbNPossui.isSelected() && !rbPossui.isSelected());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEcluir;
    private javax.swing.JButton btRelatorio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbNPossui;
    private javax.swing.JRadioButton rbPossui;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfDataNasc;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfidade;
    // End of variables declaration//GEN-END:variables
}
