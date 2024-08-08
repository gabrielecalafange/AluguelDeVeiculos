package Model;

import java.util.Date;

public class Aluguel {
    private Veiculo veiculo;
    private Cliente cliente;
    private Funcionario funcionario;
    private double valor, multa;
    private Date dataAluguel, dataDevolucao;
    private int id;

    public Aluguel (Veiculo veiculo, Cliente cliente, Funcionario funcionario, double valor, Date dataAluguel, Date dataDevolucao, int id) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valor = valor;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.id = id;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public double getValor() {
        return valor;
    }

    public double getMulta() {
        return this.multa;
    }

    public void setMulta() {
        this.multa = this.valor + (this.valor * 0.1);
    }

    public String getDatas() {
        return "data de aluguel: " + dataAluguel + " data devolução: " + dataDevolucao;
    }

    public int getId() {
        return id;
    }
}
