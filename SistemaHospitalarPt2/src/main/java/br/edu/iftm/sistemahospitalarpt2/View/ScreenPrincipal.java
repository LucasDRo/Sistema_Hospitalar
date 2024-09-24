
package br.edu.iftm.sistemahospitalarpt2.View;

import DAO.ConsultaDAO;
import DAO.ExameDAO;
import DAO.MedicamentoDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import DAO.UsuarioDAO;
import javax.swing.JOptionPane;



public class ScreenPrincipal extends javax.swing.JFrame {
    
    UsuarioDAO userDAO;
    PacienteDAO pacDAO;
    MedicoDAO medDAO;
    MedicamentoDAO medicamentoDAO;
    ExameDAO exaDAO;
    ConsultaDAO conDAO;
    
    
    public ScreenPrincipal() {
        initComponents();
        userDAO = new UsuarioDAO();
        pacDAO = new PacienteDAO();
        medDAO = new MedicoDAO();
        conDAO = new ConsultaDAO();
        medicamentoDAO = new MedicamentoDAO();
        exaDAO = new ExameDAO();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        miLogin = new javax.swing.JMenu();
        btUsuarios = new javax.swing.JMenuItem();
        btCadastrar = new javax.swing.JMenuItem();
        btEntrar = new javax.swing.JMenuItem();
        miPessoas = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btCadastrarMedico = new javax.swing.JMenuItem();
        btConsultarMedico = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btCadastrarPaciente = new javax.swing.JMenuItem();
        btConsultarPaciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btCadastroMedicamento = new javax.swing.JMenuItem();
        btConsultaMedicamento = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btCadastroExames = new javax.swing.JMenuItem();
        btConsultaExames = new javax.swing.JMenuItem();
        miConsulta = new javax.swing.JMenu();
        btCadastrarConsulta = new javax.swing.JMenuItem();
        btConsulta = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hospitalar");

        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(821, 616));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        miLogin.setBackground(new java.awt.Color(255, 255, 255));
        miLogin.setForeground(new java.awt.Color(0, 0, 0));
        miLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconUser.png"))); // NOI18N
        miLogin.setText("LOGIN");
        miLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btUsuarios.setText("Usuários");
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });
        miLogin.add(btUsuarios);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        miLogin.add(btCadastrar);

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        miLogin.add(btEntrar);

        jMenuBar1.add(miLogin);

        miPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconPessoas.png"))); // NOI18N
        miPessoas.setText("Pessoas");
        miPessoas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu4.setText("Médico");

        btCadastrarMedico.setText("Cadastrar");
        btCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarMedicoActionPerformed(evt);
            }
        });
        jMenu4.add(btCadastrarMedico);

        btConsultarMedico.setText("Consultar");
        btConsultarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarMedicoActionPerformed(evt);
            }
        });
        jMenu4.add(btConsultarMedico);

        miPessoas.add(jMenu4);

        jMenu5.setText("Paciente");

        btCadastrarPaciente.setText("Cadastrar");
        btCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarPacienteActionPerformed(evt);
            }
        });
        jMenu5.add(btCadastrarPaciente);

        btConsultarPaciente.setText("Consultar");
        btConsultarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarPacienteActionPerformed(evt);
            }
        });
        jMenu5.add(btConsultarPaciente);

        miPessoas.add(jMenu5);

        jMenuBar1.add(miPessoas);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconMedicamentos.png"))); // NOI18N
        jMenu2.setText("Medicamentos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btCadastroMedicamento.setText("Cadastro");
        btCadastroMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroMedicamentoActionPerformed(evt);
            }
        });
        jMenu2.add(btCadastroMedicamento);

        btConsultaMedicamento.setText("Consulta");
        btConsultaMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaMedicamentoActionPerformed(evt);
            }
        });
        jMenu2.add(btConsultaMedicamento);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconExames.png"))); // NOI18N
        jMenu3.setText("Exames");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btCadastroExames.setText("Cadastro");
        btCadastroExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroExamesActionPerformed(evt);
            }
        });
        jMenu3.add(btCadastroExames);

        btConsultaExames.setText("Consulta");
        btConsultaExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaExamesActionPerformed(evt);
            }
        });
        jMenu3.add(btConsultaExames);

        jMenuBar1.add(jMenu3);

        miConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconConsulta.png"))); // NOI18N
        miConsulta.setText("Consultas");
        miConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btCadastrarConsulta.setText("Cadastro");
        btCadastrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarConsultaActionPerformed(evt);
            }
        });
        miConsulta.add(btCadastrarConsulta);

        btConsulta.setText("Consulta");
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });
        miConsulta.add(btConsulta);

        jMenuBar1.add(miConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarMedicoActionPerformed
        msglogin();
        CadastroMedico cadastroM = new CadastroMedico(medDAO);
        jDesktopPane1.add(cadastroM);
        cadastroM.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btCadastrarMedicoActionPerformed

    private void btCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarPacienteActionPerformed
        msglogin();
        CadastroPaciente cadastroP = new CadastroPaciente(pacDAO);
        jDesktopPane1.add(cadastroP);
        cadastroP.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btCadastrarPacienteActionPerformed

    private void btConsultarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarMedicoActionPerformed
        msglogin();
        ConsultaMedico consultaM = new ConsultaMedico(medDAO);
        jDesktopPane1.add(consultaM);
        consultaM.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btConsultarMedicoActionPerformed
    
    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        Login login = new Login(userDAO);
        jDesktopPane1.add(login);
        login.setVisible(true);
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        msgloginAdmin();
        CadastroUsuario cadastroUsuario= new CadastroUsuario(userDAO);
        jDesktopPane1.add(cadastroUsuario);
        cadastroUsuario.setVisible(userDAO.isStatusAdmin());
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarPacienteActionPerformed
        msglogin();
        ConsultaPaciente consultaP = new ConsultaPaciente(pacDAO);
        jDesktopPane1.add(consultaP);
        consultaP.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btConsultarPacienteActionPerformed

    private void btConsultaMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaMedicamentoActionPerformed
        msglogin();
        ConsultaMedicamento consultaMedicamento = new ConsultaMedicamento(medicamentoDAO);
        jDesktopPane1.add(consultaMedicamento);
        consultaMedicamento.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btConsultaMedicamentoActionPerformed

    private void btCadastroMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroMedicamentoActionPerformed
        msglogin();
        CadastroMedicamento cadastroMedicamento = new CadastroMedicamento(medicamentoDAO);
        jDesktopPane1.add(cadastroMedicamento);
        cadastroMedicamento.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btCadastroMedicamentoActionPerformed

    private void btCadastroExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroExamesActionPerformed
        msglogin();
        CadastroExame cadastroExame = new CadastroExame(exaDAO);
        jDesktopPane1.add(cadastroExame);
        cadastroExame.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btCadastroExamesActionPerformed

    private void btConsultaExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaExamesActionPerformed
        msglogin();
        ConsultaExame consultaExame = new ConsultaExame(exaDAO);
        jDesktopPane1.add(consultaExame);
        consultaExame.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btConsultaExamesActionPerformed

    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariosActionPerformed
        msgloginAdmin();
        GerenciaUsuarios gerenciaUsuarios= new GerenciaUsuarios(userDAO);
        jDesktopPane1.add(gerenciaUsuarios);
        gerenciaUsuarios.setVisible(userDAO.isStatusAdmin());
    }//GEN-LAST:event_btUsuariosActionPerformed

    private void btCadastrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarConsultaActionPerformed
        msglogin();
        CadastroConsulta cadastroConsulta = new CadastroConsulta(conDAO, medicamentoDAO, exaDAO, medDAO, pacDAO);
        jDesktopPane1.add(cadastroConsulta);
        cadastroConsulta.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btCadastrarConsultaActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        msglogin();
        GerenciaConsulta gerenciaConsulta = new GerenciaConsulta(conDAO);
        jDesktopPane1.add(gerenciaConsulta);
        gerenciaConsulta.setVisible(userDAO.isStatus());
    }//GEN-LAST:event_btConsultaActionPerformed
    
    
    public void msglogin(){
        if(!userDAO.isStatus())
            JOptionPane.showMessageDialog(this, "Faça login para ter acesso ao sistema!");
    }
    
    
    public void msgloginAdmin(){
        if(!userDAO.isStatus())
            JOptionPane.showMessageDialog(this, "Faça login para ter acesso ao sistema!");
        else if(!userDAO.isStatusAdmin())
            JOptionPane.showMessageDialog(this, "Faça login como administrador para ter acesso a essa funcionalidade!");
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btCadastrar;
    private javax.swing.JMenuItem btCadastrarConsulta;
    private javax.swing.JMenuItem btCadastrarMedico;
    private javax.swing.JMenuItem btCadastrarPaciente;
    private javax.swing.JMenuItem btCadastroExames;
    private javax.swing.JMenuItem btCadastroMedicamento;
    private javax.swing.JMenuItem btConsulta;
    private javax.swing.JMenuItem btConsultaExames;
    private javax.swing.JMenuItem btConsultaMedicamento;
    private javax.swing.JMenuItem btConsultarMedico;
    private javax.swing.JMenuItem btConsultarPaciente;
    private javax.swing.JMenuItem btEntrar;
    private javax.swing.JMenuItem btUsuarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu miConsulta;
    private javax.swing.JMenu miLogin;
    private javax.swing.JMenu miPessoas;
    // End of variables declaration//GEN-END:variables
}
