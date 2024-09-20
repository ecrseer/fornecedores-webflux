package gj.infnet.gjprodutoswebflux.model.clima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvCidadeClima {
    Long id;
    String name;
    String  state;
    String  country;

    List<AdvDiaTemperatura> data;
}
