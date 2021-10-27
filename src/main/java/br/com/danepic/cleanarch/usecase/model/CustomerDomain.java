package br.com.danepic.cleanarch.usecase.model;

import lombok.Data;

@Data
public class CustomerDomain {

    private Long id;

    private String name;

    private String email;
}
