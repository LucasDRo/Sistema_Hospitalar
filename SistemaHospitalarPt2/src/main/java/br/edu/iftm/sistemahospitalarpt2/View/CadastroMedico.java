package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.MedicoDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Medico;
import java.util.ArrayList;



public class CadastroMedico extends javax.swing.JInternalFrame {
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    MedicoDAO medDAO;
    
    public CadastroMedico(MedicoDAO medDAO) {
        initComponents();
        this.medDAO = medDAO;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfEspecializacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCrm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        tfRg = new javax.swing.JFormattedTextField();
        tfDataNasc = new javax.swing.JFormattedTextField();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setTitle("Cadastro de Médicos");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Data de Nascimento (dd/mm/aaaa):");

        jLabel5.setText("Telefone:");

        jLabel6.setText("RG:");

        jLabel8.setText("Especialização:");

        jLabel9.setText("Salário:");

        jLabel7.setText("CRM:");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medico.png"))); // NOI18N

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
            tfRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRgActionPerformed(evt);
            }
        });

        try {
            tfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addComponent(tfDataNasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(tfEspecializacao)
                            .addComponent(tfCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel12)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrar)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        
        
        if(testePreenche()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
            return;
        }
        
        Medico m = new Medico();
        
        ArrayList<String> pessoas = medDAO.listarPessoas();
        for(String n : pessoas){
            if(n.equals(tfNome.getText())){
                JOptionPane.showMessageDialog(this, "Médico já cadastrado!");
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
        
        
        m.setDataNasc(dataNasc);
        m.setIdade(dataNasc); 
        m.setCpf(tfCpf.getText());
        m.setCrm(tfCrm.getText());
        m.setEspecializacao(tfEspecializacao.getText());
        m.setNome(tfNome.getText());
        m.setRg(tfRg.getText());
        m.setSalario(Double.valueOf(tfSalario.getText()));
        m.setTelefone(tfTelefone.getText());
        
        medDAO.cadastro(m);
        JOptionPane.showMessageDialog(this, "Médico cadastrado com sucesso!");
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfActionPerformed

    private void tfRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRgActionPerformed
   
    private void limpar(){
        tfCpf.setText("");
        tfCrm.setText("");
        tfEspecializacao.setText("");
        tfDataNasc.setText("");
        tfNome.setText("");
        tfRg.setText("");
        tfSalario.setText("");
        tfTelefone.setText("");
    }
   
    private boolean testePreenche(){
        return tfCpf.getText().equals("") || tfCrm.getText().equals("") || tfEspecializacao.getText().equals("") || 
                tfNome.getText().equals("") || tfRg.getText().equals("") || tfSalario.getText().equals("")
                || tfTelefone.getText().equals("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfCrm;
    private javax.swing.JFormattedTextField tfDataNasc;
    private javax.swing.JTextField tfEspecializacao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfRg;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
