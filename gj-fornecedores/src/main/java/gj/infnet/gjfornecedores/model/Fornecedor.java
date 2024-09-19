package gj.infnet.gjfornecedores.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@Data
@Table("FORNECEDORES")
public class Fornecedor {
    @Id
    private Long id;
    private String nome;
}
