
package br.edu.iftm.sistemahospitalarpt2.Model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
    private Date dataNasc;  
    private String cpf;
    private String nome;
    private int idade;
    private String rg;
    private String telefone;

    public Pessoa(String cpf, String nome, int idade, String rg, String telefone, Date dataNasc) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDataNasc(Date dataNasc){
        this.dataNasc=dataNasc;
    }
    
    public Date dataNasc(){
        return dataNasc;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(Date dataNasc){
        Calendar dataAniv = new GregorianCalendar();
        dataAniv.setTime(dataNasc);
        Calendar dataHoje = Calendar.getInstance();
        int idade = dataHoje.get(Calendar.YEAR) - dataAniv.get(Calendar.YEAR);
        dataAniv.add(Calendar.YEAR, idade);
        if (dataHoje.before(dataAniv)) {
            idade--;
        }
        this.idade=idade;
    }
    
    public void setIdade(int i){
        idade=i;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
