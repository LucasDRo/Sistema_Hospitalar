package br.edu.iftm.sistemahospitalarpt2.report;

import DAO.Conexao;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Reports {

    public void getRelatorioMedicamento() {
        Connection conn = Conexao.getConexao();
        String src = "C:\\Users\\Lucas\\JaspersoftWorkspace\\SistemaHospitalarPt2\\RelatorioMedicamentos.jasper";
        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            e.printStackTrace(); // Trate a exceção apropriadamente
        }

        // Crie a janela do relatório com a configuração apropriada
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Adicione um listener para tratar o evento de fechamento da janela
        jasperViewer.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Adicione qualquer ação que você queira executar antes de fechar
                System.out.println("Janela do relatório está sendo fechada");
            }
        });

        // Torne a janela visível
        jasperViewer.setVisible(true);
    }
    
    public void getRelatorioExame() {
        Connection conn = Conexao.getConexao();
        String src = "C:\\Users\\Lucas\\JaspersoftWorkspace\\SistemaHospitalarPt2\\RelatorioExames.jasper";
        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            e.printStackTrace(); // Trate a exceção apropriadamente
        }

        // Crie a janela do relatório com a configuração apropriada
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Adicione um listener para tratar o evento de fechamento da janela
        jasperViewer.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Adicione qualquer ação que você queira executar antes de fechar
                System.out.println("Janela do relatório está sendo fechada");
            }
        });

        // Torne a janela visível
        jasperViewer.setVisible(true);
    }
    
    public void getRelatorioUsuario() {
        Connection conn = Conexao.getConexao();
        String src = "C:\\Users\\Lucas\\JaspersoftWorkspace\\SistemaHospitalarPt2\\RelatorioUsuarios.jasper";
        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            e.printStackTrace(); // Trate a exceção apropriadamente
        }

        // Crie a janela do relatório com a configuração apropriada
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Adicione um listener para tratar o evento de fechamento da janela
        jasperViewer.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Adicione qualquer ação que você queira executar antes de fechar
                System.out.println("Janela do relatório está sendo fechada");
            }
        });

        // Torne a janela visível
        jasperViewer.setVisible(true);
    }
    
    public void getRelatorioMedico() {
        Connection conn = Conexao.getConexao();
        String src = "C:\\Users\\Lucas\\JaspersoftWorkspace\\SistemaHospitalarPt2\\RelatorioMedicos.jasper";
        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            e.printStackTrace(); // Trate a exceção apropriadamente
        }

        // Crie a janela do relatório com a configuração apropriada
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Adicione um listener para tratar o evento de fechamento da janela
        jasperViewer.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Adicione qualquer ação que você queira executar antes de fechar
                System.out.println("Janela do relatório está sendo fechada");
            }
        });

        // Torne a janela visível
        jasperViewer.setVisible(true);
    }
    
    public void getRelatorioPaciente() {
        Connection conn = Conexao.getConexao();
        String src = "C:\\Users\\Lucas\\JaspersoftWorkspace\\SistemaHospitalarPt2\\RelatorioPacientes.jasper";
        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            e.printStackTrace(); // Trate a exceção apropriadamente
        }

        // Crie a janela do relatório com a configuração apropriada
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Adicione um listener para tratar o evento de fechamento da janela
        jasperViewer.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Adicione qualquer ação que você queira executar antes de fechar
                System.out.println("Janela do relatório está sendo fechada");
            }
        });

        // Torne a janela visível
        jasperViewer.setVisible(true);
    }
    
}
