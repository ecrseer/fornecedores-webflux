package gj.infnet.gjfornecedores.service;

import gj.infnet.gjfornecedores.model.Fornecedor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FornecedorServiceImpl {

    private final FornecedorRepository fornecedorRepository;

    public Fornecedor findById(Long id) {
        return this.fornecedorRepository.findById(id).orElse(null);
    }

    public Fornecedor save(Fornecedor fornecedor) throws Exception {

        fornecedor.setId(null);

        return this.fornecedorRepository.save(fornecedor);


    }

    public List<Fornecedor> findAll() {
        return (List<Fornecedor>) fornecedorRepository.findAll();
    }

    public Fornecedor update(Fornecedor fornecedor) {
        this.findById(fornecedor.getId());
        return this.fornecedorRepository.save(fornecedor);
    }

    public Fornecedor delete(Long id) {
        Fornecedor fornecedor = this.findById(id);
        this.fornecedorRepository.delete(fornecedor);
        return fornecedor;
    }

}
