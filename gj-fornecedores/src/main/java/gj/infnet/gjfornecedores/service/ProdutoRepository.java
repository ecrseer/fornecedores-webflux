package gj.infnet.gjfornecedores.service;

import gj.infnet.gjfornecedores.model.Produto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ProdutoRepository extends R2dbcRepository<Produto,Long> {
}
