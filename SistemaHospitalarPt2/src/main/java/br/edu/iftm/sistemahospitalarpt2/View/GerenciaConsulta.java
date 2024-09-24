package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.ConsultaDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.edu.iftm.sistemahospitalarpt2.Model.Consulta;
import br.edu.iftm.sistemahospitalarpt2.Model.Exame;
import br.edu.iftm.sistemahospitalarpt2.Model.Medicamento;

public class GerenciaConsulta extends javax.swing.JInternalFrame {

    private ArrayList<String> codConsultas;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    ConsultaDAO conDAO;

    public GerenciaConsulta(ConsultaDAO conDAO) {
        initComponents();
        this.conDAO = conDAO;
        atualizaCodigos();
    }

    private void atualizaCodigos() {
        codConsultas = new ArrayList<>();
        codConsultas = conDAO.getCodigos();
        cbConsultas.removeAllItems();
        for (String cod : codConsultas) {
            cbConsultas.addItem(cod);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbConsultas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tbConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicamentos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableExames = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfMedico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gerenciamento de consultas");

        cbConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConsultasActionPerformed(evt);
            }
        });

        jLabel1.setText("Códigos das Consultas:");

        tbConsultar.setText("Consultar");
        tbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Medicamentos receitados:");

        tableMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor", "Laboratório", "Data de Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMedicamentos);

        jLabel3.setText("Exames prescritos:");

        tableExames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableExames);

        jLabel4.setText("Médico responsável:");

        tfMedico.setEditable(false);

        jLabel5.setText("Paciente:");

        tfPaciente.setEditable(false);

        jLabel6.setText("Data:");

        tfData.setEditable(false);

        jLabel7.setText("Código:");

        tfCodigo.setEditable(false);

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btExcluir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(tbConsultar)
                                .addComponent(tfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(tfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCodigo))))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tbConsultar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbConsultarActionPerformed
        limpar();
        int cod = Integer.parseInt(cbConsultas.getSelectedItem().toString());

        Consulta c = conDAO.getConsulta(cod);

        tfCodigo.setText(String.valueOf(c.getCod()));
        tfMedico.setText(c.getNomeMedico());
        tfPaciente.setText(c.getNomePaciente());
        tfData.setText(formato.format(c.getData()));

        ArrayList<Medicamento> medicamentos = c.getMedicamentos();
        for (int i = 0; i < medicamentos.size(); i++) {
            Medicamento m = medicamentos.get(i);
            DefaultTableModel med = (DefaultTableModel) tableMedicamentos.getModel();
            Object[] dados = {m.getNome(), m.getValor(), m.getLaboratorio(), formato.format(m.getDataValidade())};
            med.addRow(dados);
        }

        ArrayList<Exame> exames = c.getExames();
        for (int i = 0; i < exames.size(); i++) {
            Exame e = exames.get(i);
            DefaultTableModel exa = (DefaultTableModel) tableExames.getModel();
            Object[] dados = {e.getNome(), e.getValor(), e.getTipo()};
            exa.addRow(dados);
        }
    }//GEN-LAST:event_tbConsultarActionPerformed

    private void cbConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultasActionPerformed
        limpar();
    }//GEN-LAST:event_cbConsultasActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        

        int op = JOptionPane.showConfirmDialog(this, "Confirma a exlusão?");
        if (op == 0) {
            int cod = Integer.parseInt(cbConsultas.getSelectedItem().toString());
            conDAO.excluir(cod);
            limpar();
            atualizaCodigos();
            JOptionPane.showMessageDialog(this, "Consulta excluída com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Operação cancelada!");
        }

    }//GEN-LAST:event_btExcluirActionPerformed

    private void limpar() {
        ((DefaultTableModel) tableMedicamentos.getModel()).setNumRows(0);
        tableMedicamentos.updateUI();
        ((DefaultTableModel) tableExames.getModel()).setNumRows(0);
        tableExames.updateUI();
        tfCodigo.setText(null);
        tfMedico.setText(null);
        tfPaciente.setText(null);
        tfData.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JComboBox<String> cbConsultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableExames;
    private javax.swing.JTable tableMedicamentos;
    private javax.swing.JButton tbConsultar;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfMedico;
    private javax.swing.JTextField tfPaciente;
    // End of variables declaration//GEN-END:variables
}
