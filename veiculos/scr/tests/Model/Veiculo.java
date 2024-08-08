package Model;

public class Veiculo {
    private String placa;
    private boolean alugado;

    public Veiculo(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return this.placa;
    }

    public boolean estaAlugado() {
        return this.alugado;
    }

    public void alugar() {
        this.alugado = true;
    }

    public void disponibilizar() {
        this.alugado = false;
    }
}
