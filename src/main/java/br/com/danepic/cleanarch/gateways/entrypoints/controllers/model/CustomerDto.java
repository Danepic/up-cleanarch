package br.com.danepic.cleanarch.gateways.entrypoints.controllers.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class CustomerDto {

    private String id;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;
}
