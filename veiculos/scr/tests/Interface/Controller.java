package Interface;

import Repository.AlugueisRepository;
import Repository.UsuariosRepository;
import Repository.VeiculosRepository;

import java.util.Date;

public class Controller {

    private AlugueisRepository alugueis;
    private UsuariosRepository usuarios;
    private VeiculosRepository veiculos;

    public Controller() {
        this.alugueis = new AlugueisRepository();
        this.usuarios = new UsuariosRepository();
        this.veiculos = new VeiculosRepository();
    }

}
