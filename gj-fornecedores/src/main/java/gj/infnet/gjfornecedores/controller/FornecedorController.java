package gj.infnet.gjfornecedores.controller;

import gj.infnet.gjfornecedores.model.Fornecedor;
import gj.infnet.gjfornecedores.service.FornecedorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
@RequiredArgsConstructor
public class FornecedorController {

    private final FornecedorServiceImpl fornecedorService;

    @PostMapping
    public Fornecedor salvar(@RequestBody Fornecedor fornecedor) throws Exception {
            return fornecedorService.save(fornecedor);
    }


    @GetMapping
    public List<Fornecedor> listarTodos(){
        return fornecedorService.findAll();
    }

    @DeleteMapping("/{id}")
    public Fornecedor excluir(@PathVariable Long id) {
        return fornecedorService.delete(id);
    }

    @PatchMapping
    public Fornecedor atualizar(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.update(fornecedor);
    }

}
