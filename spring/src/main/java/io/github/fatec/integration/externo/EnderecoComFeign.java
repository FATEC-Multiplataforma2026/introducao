package io.github.fatec.integration.externo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "ViaCep",
        url = "https://viacep.com.br")
public interface EnderecoComFeign {
    @GetMapping("/ws/{cep}/json")
    String buscaEndereco(@PathVariable("cep") String cep);
}
