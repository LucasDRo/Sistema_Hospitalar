package br.edu.iftm.sistemahospitalarpt2.Model;


import java.util.Date;


public class Paciente extends Pessoa {
    private String endereco;
    private boolean plano;

    public Paciente(String endereco, boolean plano, String cpf, String nome, int idade, String rg, String telefone, Date dataNasc) {
        super(cpf, nome, idade, rg, telefone, dataNasc);
        this.endereco = endereco;
        this.plano = plano;
    }

    public Paciente() {
        super();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPlano() {
        return plano;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }
    
    
    
    
}
