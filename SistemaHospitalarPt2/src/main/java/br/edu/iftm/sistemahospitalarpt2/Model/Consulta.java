package br.edu.iftm.sistemahospitalarpt2.Model;

import java.util.ArrayList;
import java.util.Date;

public class Consulta {
   private Paciente paciente;
   private Medico medico;
   private Date data;
   private int cod;
   private float valor;
   private ArrayList<Medicamento> medicamentos;
   private ArrayList<Exame> exames;
   private String nomeMedico;
   private String nomePaciente;

    public Consulta(Paciente paciente, Medico medico, Date data, int cod, float valor, ArrayList<Medicamento> medicamentos, ArrayList<Exame> exames, String nomeMedico, String nomePaciente ) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.cod = cod;
        this.valor = valor;
        this.medicamentos = medicamentos;
        this.exames = exames;
        this.nomeMedico = nomeMedico;
        this.nomePaciente = nomePaciente;
    }

    public Consulta() {
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
 
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }

    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

   
}
