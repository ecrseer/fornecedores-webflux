package gj.infnet.gjprodutoswebflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvCidade {
    Long id;
    String name;
    String  state;
    String  country;
}
