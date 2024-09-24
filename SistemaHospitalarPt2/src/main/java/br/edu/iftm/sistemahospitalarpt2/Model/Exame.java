package br.edu.iftm.sistemahospitalarpt2.Model;

public class Exame {
    private String nome;
    private String tipo;
    private float valor;

    public Exame(String nome, String tipo, float valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Exame() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
