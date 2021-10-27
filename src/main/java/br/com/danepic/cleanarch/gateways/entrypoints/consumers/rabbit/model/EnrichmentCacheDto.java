package br.com.danepic.cleanarch.gateways.entrypoints.consumers.rabbit.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EnrichmentCacheDto<T> {

    @NotBlank
    private String key;

    private T value;
}
