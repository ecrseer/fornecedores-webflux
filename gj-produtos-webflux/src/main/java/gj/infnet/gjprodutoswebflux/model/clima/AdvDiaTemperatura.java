package gj.infnet.gjprodutoswebflux.model.clima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class AdvDiaTemperatura {
    String date;
    AdvMediaTemperatura climate_temperature;
}
