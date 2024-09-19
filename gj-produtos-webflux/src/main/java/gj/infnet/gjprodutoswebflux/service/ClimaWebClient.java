package gj.infnet.gjprodutoswebflux.service;

import gj.infnet.gjprodutoswebflux.model.AdvCidade;
import gj.infnet.gjprodutoswebflux.model.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class ClimaWebClient {

    private final WebClient webClient;

    public ClimaWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://apiadvisor.climatempo.com.br/api/v1").build();
    }

    public Flux<AdvCidade> listaCidadesClima() {
        Flux<AdvCidade> advCidadeFlux = webClient
                .get()
                .uri("locale/city?name=São Paulo&state=SP&token=68caadc4ccd2aea288509d72b469eb4f")
                .retrieve()
                .bodyToFlux(AdvCidade.class);
        return advCidadeFlux;
    }
}

