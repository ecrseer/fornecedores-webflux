package gj.infnet.gjprodutoswebflux.service;


import gj.infnet.gjprodutoswebflux.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoServiceImpl {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Mono<Produto> save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Flux<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Mono<Void> deleteById(Long id) {
        return produtoRepository.deleteById(id);
    }

    public Mono<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }




}
