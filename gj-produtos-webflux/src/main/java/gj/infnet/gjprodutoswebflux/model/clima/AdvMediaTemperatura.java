package gj.infnet.gjprodutoswebflux.model.clima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class AdvMediaTemperatura {
    AdvTemperatura last_year;
    AdvTemperatura normal;
    AdvTemperatura forecast;

}
