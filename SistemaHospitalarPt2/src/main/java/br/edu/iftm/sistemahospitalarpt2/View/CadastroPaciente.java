package br.edu.iftm.sistemahospitalarpt2.View;


import DAO.PacienteDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Paciente;
import java.util.ArrayList;


public class CadastroPaciente extends javax.swing.JInternalFrame {


    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    PacienteDAO pacDAO;
    
    public CadastroPaciente(PacienteDAO pacDAO) {
        initComponents();
        this.pacDAO = pacDAO;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPlano = new javax.swing.ButtonGroup();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbPossui = new javax.swing.JRadioButton();
        rbNPossui = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        tfDataNasc = new javax.swing.JFormattedTextField();
        tfRg = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Cadastro de pacientes");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("RG:");

        jLabel7.setText("Data de Nascimento (dd/mm/aaaa):");

        jLabel8.setText("Endereço:");

        jLabel9.setText("Plano de saúde:");

        bgPlano.add(rbPossui);
        rbPossui.setText("Possui");

        bgPlano.add(rbNPossui);
        rbNPossui.setText("Não Possui");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paciente.png"))); // NOI18N

        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfActionPerformed(evt);
            }
        });

        try {
            tfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPossui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNPossui))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefone)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfRg))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(rbPossui)
                            .addComponent(rbNPossui)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        
        if(testePreenche()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
            return;
        }
        
        Paciente p = new Paciente();
        
        ArrayList<String> pessoas = pacDAO.listarPessoas();
        for(String n : pessoas){
            if(n.equals(tfNome.getText())){
                JOptionPane.showMessageDialog(this, "Pessoa já cadastrado!");
                return;
            }
        }
        
        Date dataNasc = null; 
        try {
            dataNasc = formato.parse(tfDataNasc.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
        }
        
        
        Calendar dataHoje = Calendar.getInstance();
        Calendar data = new GregorianCalendar();
        data.setTime(dataNasc);
        if(dataNasc==null || data.after(dataHoje)){
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
            return;
        }
        
        
        p.setDataNasc(dataNasc);
        p.setIdade(dataNasc);
        p.setCpf(tfCpf.getText());
        p.setEndereco(tfEndereco.getText());
        p.setNome(tfNome.getText());
        p.setRg(tfRg.getText());
        p.setTelefone(tfTelefone.getText());
        if(rbPossui.isSelected())
            p.setPlano(true);
        else
            p.setPlano(false);
        
        pacDAO.cadastro(p);
        JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfActionPerformed

    private void tfRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRgActionPerformed
         
    private void limpar(){
        tfCpf.setText("");
        tfDataNasc.setText("");
        tfEndereco.setText("");
        tfNome.setText("");
        tfRg.setText("");
        tfTelefone.setText("");
        bgPlano.clearSelection();
    }
    
    private boolean testePreenche(){
        return tfCpf.getText().equals("")||tfEndereco.getText().equals("")||tfNome.getText().equals("")
                ||tfRg.getText().equals("")||tfTelefone.getText().equals("")||(!rbNPossui.isSelected()&&!rbPossui.isSelected());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPlano;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbNPossui;
    private javax.swing.JRadioButton rbPossui;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JFormattedTextField tfDataNasc;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfRg;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
