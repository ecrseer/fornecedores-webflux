package gj.infnet.gjprodutoswebflux.controller;


import gj.infnet.gjprodutoswebflux.model.clima.AdvCidadeClima;
import gj.infnet.gjprodutoswebflux.service.ClimaWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clima")
@RequiredArgsConstructor
public class ClimaController {

    private final ClimaWebClient climaWebClient;

    @GetMapping
    public Mono<AdvCidadeClima> buscaTemperaturaSaoPaulo(){
        return climaWebClient.procuraCidadeTemperatura("São paulo","SP");
    }
}
