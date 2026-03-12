package io.github.fatec;

import io.github.fatec.integration.EnderecoIntegration;
import io.github.fatec.integration.EnderecoIntegrationImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroducaoApplication implements CommandLineRunner {
    private final EnderecoIntegration enderecoIntegration;

    public IntroducaoApplication(EnderecoIntegration enderecoIntegration) {
        this.enderecoIntegration = enderecoIntegration;
    }

    public static void main(String[] args) {
        SpringApplication.run(IntroducaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        enderecoIntegration.buscaCep("1234");
    }

}
