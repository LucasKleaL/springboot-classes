package pucpr.br.demospringboot.service;

import org.springframework.stereotype.Service;
import pucpr.br.demospringboot.entity.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VeiculoService {

    Logger logger = Logger.getLogger(VeiculoService.class.getName());

    public Veiculo salvar(Veiculo veiculo) {
        logger.info(veiculo.getPlaca());
        logger.info(veiculo.getModelo());
        return null;
    }

    public List<Veiculo> listar() {
        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo v = new Veiculo();
        v.setPlaca("ABC-0101");
        v.setModelo("Golf");
        veiculos.add(v);
        return veiculos;
    }

    public void excluir(Veiculo veiculo) {
        //
    }

}
