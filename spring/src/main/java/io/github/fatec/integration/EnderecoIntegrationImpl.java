package io.github.fatec.integration;

import io.github.fatec.entity.Endereco;
import org.springframework.stereotype.Component;

@Component
public class EnderecoIntegrationImpl implements EnderecoIntegration {

    @Override
    public Endereco buscaCep(String cep) {
        System.out.println("BUSCANDO ENDERECO");
        return null;
    }
}
