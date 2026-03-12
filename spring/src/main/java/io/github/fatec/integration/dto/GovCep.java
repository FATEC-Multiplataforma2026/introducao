package io.github.fatec.integration.dto;

public record GovCep(
        String cep,
        String tipoCep,
        String subTipoCep,
        String uf,
        String cidade,
        String bairro,
        String endereco,
        String complemento,
        String codigoIBGE
) {
}
