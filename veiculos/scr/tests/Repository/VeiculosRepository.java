package Repository;

import Model.Veiculo;

import java.util.HashMap;

public class VeiculosRepository {
    private HashMap<String, Veiculo> veiculos;

    public VeiculosRepository() {
        this.veiculos = new HashMap<>();
    }

    public void addVeiculo(String placa, Veiculo veiculo) {
        this.veiculos.put(placa, veiculo);
    }

    public void removerVeiculo(String placa) {
        this.veiculos.remove(placa);
    }

    public Veiculo getVeiculo(String placa) {
        return this.veiculos.get(placa);
    }

}
