package gj.infnet.gjprodutoswebflux.service;

import gj.infnet.gjprodutoswebflux.model.Produto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ProdutoRepository extends R2dbcRepository<Produto,Long> {
}
