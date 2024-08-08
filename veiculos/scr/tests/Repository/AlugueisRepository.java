package Repository;

import Model.Aluguel;

import java.util.HashMap;

public class AlugueisRepository {
    private HashMap<Integer, Aluguel> alugueis;

    public AlugueisRepository() {
        this.alugueis = new HashMap<>();
    }

    public void addAluguel(int id, Aluguel aluguel) {
        this.alugueis.put(id, aluguel);
    }

    public void removeAluguel(int id) {
        this.alugueis.remove(id);
    }

    public void getAluguel(int id) {
        this.alugueis.get(id);
    }
}
