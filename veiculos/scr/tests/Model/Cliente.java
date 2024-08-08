package Model;

import Interface.Usuario;

public class Cliente implements Usuario {

    private String nome, cpf;
    private double multas;
    private boolean alugando;

    public Cliente(String nome, String  cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean temPendencias() {
        return this.multas == 0 && this.alugando == false;
    }

    public void setMulta(double multa) {
        this.multas = multa;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }
}
