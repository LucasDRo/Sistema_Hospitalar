
package br.edu.iftm.sistemahospitalarpt2.Model;



public class Conta {
    private float valorTotal;
    private float valorPago;
    private String status;

    public Conta(float valorTotal, float valorPago, String status) {
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.status = status;
        
    }

    public Conta() {
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}
