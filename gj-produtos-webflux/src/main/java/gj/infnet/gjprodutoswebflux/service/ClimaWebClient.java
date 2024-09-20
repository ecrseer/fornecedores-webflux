package gj.infnet.gjprodutoswebflux.service;

import gj.infnet.gjprodutoswebflux.model.clima.AdvCidadeClima;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClimaWebClient {

    private final WebClient webClient;

    public ClimaWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://apiadvisor.climatempo.com.br/api/v1").build();
    }

    public Mono<AdvCidadeClima> procuraCidadeId(String nome) {
        Mono<AdvCidadeClima> advCidadeFlux = webClient
                .get()
                .uri("/locale/city?name=" + nome +
                        "&token=0aa576f01bd436ce6c68b12fa2e4d29a")
                .retrieve()
                .bodyToFlux(AdvCidadeClima.class).next();
        return advCidadeFlux;
    }


    public Mono<AdvCidadeClima> procuraCidadeTemperatura(String nomeCidade, String UF) {
        return procuraCidadeId(nomeCidade)
                .flatMap(cidade -> {

                    return webClient
                            .get()
                            .uri("/climate/temperature/locale/" + cidade.getId() +
                                    "?token=0aa576f01bd436ce6c68b12fa2e4d29a")
                            .retrieve()
                            .bodyToMono(AdvCidadeClima.class)
                            .doOnError(e -> System.out.println(e.getMessage()));
                })
                .onErrorResume(e -> {
                    System.out.println(e.getMessage());
                    return Mono.error(new RuntimeException("City temperature request failed"));
                });
    }
}

