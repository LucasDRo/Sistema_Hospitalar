package br.edu.iftm.sistemahospitalarpt2.Model;

import java.util.Date;

public class Medico extends Pessoa{
    private String crm;
    private Double salario;
    private String especializacao;

    public Medico(String crm, Double salario, String especializacao, String cpf, String nome, int idade, String rg, String telefone, Date dataNasc) {
        super(cpf, nome, idade, rg, telefone, dataNasc);
        this.crm = crm;
        this.salario = salario;
        this.especializacao = especializacao;
    }

    public Medico() {
        super();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    
    
}
