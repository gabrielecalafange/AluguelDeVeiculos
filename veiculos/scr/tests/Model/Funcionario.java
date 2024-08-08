package Model;

import Interface.Usuario;

public class Funcionario implements Usuario {

    private String nome, cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
