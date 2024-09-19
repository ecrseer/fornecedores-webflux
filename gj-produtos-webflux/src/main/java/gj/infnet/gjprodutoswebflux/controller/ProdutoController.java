package gj.infnet.gjprodutoswebflux.controller;

import gj.infnet.gjprodutoswebflux.model.Produto;
import gj.infnet.gjprodutoswebflux.service.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;


    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public Flux<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Produto> findById(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping
    public Mono<Produto> save(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return produtoRepository.deleteById(id);
    }
}