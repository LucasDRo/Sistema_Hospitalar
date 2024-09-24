
package br.edu.iftm.sistemahospitalarpt2.Model;

import java.util.Date;


public class Medicamento {
    private String nome;
    private Date dataValidade;
    private String laboratorio;
    private float valor;

    public Medicamento(String nome, Date dataValidade, String laboratorio, float valor) {
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.laboratorio = laboratorio;
        this.valor=valor;
    }

    public Medicamento() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    
}
