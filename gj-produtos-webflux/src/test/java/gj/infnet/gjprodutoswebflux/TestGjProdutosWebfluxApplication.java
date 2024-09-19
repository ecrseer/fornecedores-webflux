package gj.infnet.gjprodutoswebflux;

import org.springframework.boot.SpringApplication;

public class TestGjProdutosWebfluxApplication {

    public static void main(String[] args) {
        SpringApplication.from(GjProdutosWebfluxApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
