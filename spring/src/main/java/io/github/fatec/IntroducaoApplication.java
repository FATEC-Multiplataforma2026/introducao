package io.github.fatec;

import io.github.fatec.integration.externo.EnderecoComFeign;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntroducaoApplication implements CommandLineRunner {
    public final EnderecoComFeign client;

    public IntroducaoApplication(EnderecoComFeign client) {
        this.client = client;
    }

    public static void main(String[] args) {
        SpringApplication.run(IntroducaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String s = client.buscaEndereco("01001000");
        System.out.println("Retorno: " + s);
    }
}
