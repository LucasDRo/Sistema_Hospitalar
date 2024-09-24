package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.ConsultaDAO;
import DAO.ExameDAO;
import DAO.MedicamentoDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.edu.iftm.sistemahospitalarpt2.Model.Consulta;
import br.edu.iftm.sistemahospitalarpt2.Model.Exame;
import br.edu.iftm.sistemahospitalarpt2.Model.Medicamento;

public class CadastroConsulta extends javax.swing.JInternalFrame {

    private ArrayList<String> nomesPacientes;
    private ArrayList<String> nomesMedicos;
    private ArrayList<String> nomesExames;
    private ArrayList<String> nomesMedicamentos;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private Calendar dataHoje = Calendar.getInstance();
    ConsultaDAO conDAO;
    MedicamentoDAO medicamentoDAO;
    ExameDAO exaDAO;
    MedicoDAO medDAO;
    PacienteDAO pacDAO;

    public CadastroConsulta(ConsultaDAO conDAO, MedicamentoDAO medicamentoDAO, ExameDAO exaDAO, MedicoDAO medDAO, PacienteDAO pacDAO) {
        initComponents();
        this.medDAO = medDAO;
        this.medicamentoDAO = medicamentoDAO;
        this.exaDAO = exaDAO;
        this.pacDAO = pacDAO;
        this.conDAO = conDAO;
        atualizaPacientes();
        atualizaMedicos();
        atualizaExames();
        atualizaMedicamentos();
        tfData.setText(formato.format(dataHoje.getTime()));
        tfCodigo.setText(String.valueOf(conDAO.getCod()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMedicos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbPacientes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbMedicamentos = new javax.swing.JComboBox<>();
        btAddExames = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicamento = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cbExames = new javax.swing.JComboBox<>();
        btAddMedicamento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableExame = new javax.swing.JTable();
        btMenosMedicamentos = new javax.swing.JButton();
        btMenosExames = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de consultas");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consulta.png"))); // NOI18N

        jLabel2.setText("Médico responsável:");

        jLabel3.setText("Paciente:");

        jLabel4.setText("Medicamentos receitados:");

        btAddExames.setText("+");
        btAddExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddExamesActionPerformed(evt);
            }
        });

        tableMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor", "Laboratório", "Data de Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMedicamento);

        jLabel5.setText("Exames prescritos:");

        btAddMedicamento.setText("+");
        btAddMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMedicamentoActionPerformed(evt);
            }
        });

        jLabel6.setText("Data:");

        tfData.setEditable(false);

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        tableExame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableExame);

        btMenosMedicamentos.setText("-");
        btMenosMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosMedicamentosActionPerformed(evt);
            }
        });

        btMenosExames.setText("-");
        btMenosExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosExamesActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor consulta:");

        jLabel8.setText("Código:");

        tfCodigo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(cbPacientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(cbMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(tfCodigo))
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(64, 64, 64))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btAddMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btMenosMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbExames, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btAddExames, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btMenosExames, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btAddMedicamento)
                                .addComponent(btMenosMedicamentos)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbExames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddExames)
                            .addComponent(btMenosExames))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(cbMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(cbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMedicamentoActionPerformed
        int pos = cbMedicamentos.getSelectedIndex();
        ArrayList<Medicamento> m = medicamentoDAO.carregarMedicamentosDoBanco();
        Medicamento medicamento = m.get(pos);

        DefaultTableModel medicamentos = (DefaultTableModel) tableMedicamento.getModel();
        Object[] dados = {medicamento.getNome(), medicamento.getValor(), medicamento.getLaboratorio(), formato.format(medicamento.getDataValidade())};

        medicamentos.addRow(dados);
    }//GEN-LAST:event_btAddMedicamentoActionPerformed

    private void btAddExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddExamesActionPerformed
        int pos = cbExames.getSelectedIndex();
        ArrayList<Exame> e = exaDAO.carregarExamesDoBanco();
        Exame exame = e.get(pos);

        DefaultTableModel exames = (DefaultTableModel) tableExame.getModel();
        Object[] dados = {exame.getNome(), exame.getValor(), exame.getTipo()};

        exames.addRow(dados);
    }//GEN-LAST:event_btAddExamesActionPerformed

    private void btMenosMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosMedicamentosActionPerformed
        ((DefaultTableModel) tableMedicamento.getModel()).setNumRows(0);
        tableMedicamento.updateUI();
    }//GEN-LAST:event_btMenosMedicamentosActionPerformed

    private void btMenosExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosExamesActionPerformed
        ((DefaultTableModel) tableExame.getModel()).setNumRows(0);
        tableExame.updateUI();
    }//GEN-LAST:event_btMenosExamesActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        Consulta c = new Consulta();

        ArrayList<Medicamento> med = new ArrayList<>();
        DefaultTableModel medicamentos = (DefaultTableModel) tableMedicamento.getModel();
        int cont = medicamentos.getRowCount();

        for (int i = 0; i < cont; i++) {
            Medicamento m = new Medicamento();
            try {
                m.setNome(medicamentos.getValueAt(i, 0).toString());
                m.setValor(Float.parseFloat(medicamentos.getValueAt(i, 1).toString()));
                m.setLaboratorio(medicamentos.getValueAt(i, 2).toString());
                m.setDataValidade(formato.parse(medicamentos.getValueAt(i, 3).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(CadastroConsulta.class.getName()).log(Level.SEVERE, null, ex);
            }
            med.add(m);
        }

        ArrayList<Integer> idMedicamentos = new ArrayList<>();
        for (int i = 0; i < med.size(); i++) {
            int id = medicamentoDAO.getID(med.get(i).getNome());
            idMedicamentos.add(id);
        }

        ArrayList<Exame> exa = new ArrayList<>();
        DefaultTableModel exames = (DefaultTableModel) tableExame.getModel();
        cont = exames.getRowCount();

        for (int i = 0; i < cont; i++) {
            Exame e = new Exame();
            e.setNome(exames.getValueAt(i, 0).toString());
            e.setValor(Float.parseFloat(exames.getValueAt(i, 1).toString()));
            e.setTipo(exames.getValueAt(i, 2).toString());
            exa.add(e);
        }

        ArrayList<Integer> idExames = new ArrayList<>();
        for (int i = 0; i < exa.size(); i++) {
            int id = exaDAO.getID(exa.get(i).getNome());
            idExames.add(id);
        }

        try {
            c.setData(formato.parse(tfData.getText()));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter formato de data:"+ ex.getMessage());
        }
        
        c.setMedico(medDAO.retornaMedico(cbMedicos.getSelectedItem().toString()));
        c.setPaciente(pacDAO.retornaPaciente(cbPacientes.getSelectedItem().toString()));
        c.setCod(Integer.parseInt(tfCodigo.getText()));
        c.setValor(Float.parseFloat(tfValor.getText()));

        conDAO.cadastro(c, idExames, idMedicamentos);
        tfCodigo.setText(String.valueOf(conDAO.getCod()));
        JOptionPane.showMessageDialog(this, "Consulta cadastrada com sucesso!");
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void atualizaPacientes() {
        nomesPacientes = new ArrayList<>();
        nomesPacientes = pacDAO.listarPacientes();
        cbPacientes.removeAllItems();
        for (String nome : nomesPacientes) {
            cbPacientes.addItem(nome);
        }
    }

    private void atualizaMedicos() {
        nomesMedicos = new ArrayList<>();
        nomesMedicos = medDAO.listarMedicos();
        cbMedicos.removeAllItems();
        for (String nome : nomesMedicos) {
            cbMedicos.addItem(nome);
        }
    }

    private void atualizaExames() {
        nomesExames = new ArrayList<>();
        nomesExames = exaDAO.listarExames();
        cbExames.removeAllItems();
        for (String nome : nomesExames) {
            cbExames.addItem(nome);
        }
    }

    private void atualizaMedicamentos() {
        nomesMedicamentos = new ArrayList<>();
        nomesMedicamentos = medicamentoDAO.listarMedicamentos();
        cbMedicamentos.removeAllItems();
        for (String nome : nomesMedicamentos) {
            cbMedicamentos.addItem(nome);
        }
    }

    public void limpar() {
        tfValor.setText("");
        ((DefaultTableModel) tableMedicamento.getModel()).setNumRows(0);
        tableMedicamento.updateUI();
        ((DefaultTableModel) tableExame.getModel()).setNumRows(0);
        tableExame.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddExames;
    private javax.swing.JButton btAddMedicamento;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btMenosExames;
    private javax.swing.JButton btMenosMedicamentos;
    private javax.swing.JComboBox<String> cbExames;
    private javax.swing.JComboBox<String> cbMedicamentos;
    private javax.swing.JComboBox<String> cbMedicos;
    private javax.swing.JComboBox<String> cbPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableExame;
    private javax.swing.JTable tableMedicamento;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
