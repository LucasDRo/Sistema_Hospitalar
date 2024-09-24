package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.MedicamentoDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import br.edu.iftm.sistemahospitalarpt2.Model.Medicamento;
import java.util.ArrayList;

public class CadastroMedicamento extends javax.swing.JInternalFrame {


    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    MedicamentoDAO medicamentoDAO;
    
    public CadastroMedicamento(MedicamentoDAO medicamentoDAO) {
        initComponents();
        this.medicamentoDAO = medicamentoDAO;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        tfLaboratorio = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDataValidade = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Cadastro de medicamentos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Medicamentos.png"))); // NOI18N

        jLabel3.setText("Nome:");

        jLabel4.setText("Laboratório:");

        jLabel5.setText("Data de Validade: dd/mm/aaaa");

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

        jLabel6.setText("Valor:");

        try {
            tfDataValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(tfLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(tfNome)
                            .addComponent(jLabel6)
                            .addComponent(tfValor, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(tfDataValidade))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addContainerGap())
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        
        if(testePreenche()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente!");
            return;
        }
        
        Medicamento m = new Medicamento();
        
        
        ArrayList<String> medicamentos = medicamentoDAO.listarMedicamentos();
        for(String n : medicamentos){
            if(n.equals(tfNome.getText())){
                JOptionPane.showMessageDialog(this, "Medicamento já cadastrado!");
                return;
            }
        }
        
        Date dataValidade = null; 
        try {
            dataValidade = formato.parse(tfDataValidade.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
        }
        
        
        
        Calendar dataHoje = Calendar.getInstance();
        Calendar data = new GregorianCalendar();
        data.setTime(dataValidade);
        if(dataValidade==null || data.before(dataHoje)){
            JOptionPane.showMessageDialog(this, "Digite uma data válida!");
            return;
        }
        
        
        m.setDataValidade(dataValidade);
        m.setLaboratorio(tfLaboratorio.getText());
        m.setNome(tfNome.getText());
        m.setValor(Float.parseFloat(tfValor.getText()));
        
        medicamentoDAO.cadastro(m);
        JOptionPane.showMessageDialog(this, "Medicamento cadastrado com sucesso!");
        limpar();
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       limpar();
    }//GEN-LAST:event_btLimparActionPerformed
    
    private void limpar(){
        tfNome.setText("");
        tfLaboratorio.setText("");
        tfDataValidade.setText("");
        tfValor.setText("");
    }
    
    private boolean testePreenche(){
        return tfValor.getText().equals("") || tfNome.getText().equals("") || tfLaboratorio.getText().equals("")|| tfDataValidade.getText().equals("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField tfDataValidade;
    private javax.swing.JTextField tfLaboratorio;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
