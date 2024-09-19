package gj.infnet.gjfornecedores.controller;

import gj.infnet.gjfornecedores.model.Fornecedor;
import gj.infnet.gjfornecedores.service.FornecedorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
@RequiredArgsConstructor
public class FornecedorController {

    private final FornecedorServiceImpl fornecedorService;

    @PostMapping
    public Fornecedor salvar(Fornecedor fornecedor) {
        return fornecedorService.save(fornecedor);
    }


    @GetMapping
    public List<Fornecedor> listarTodos(){
        return fornecedorService.findAll();
    }

}
