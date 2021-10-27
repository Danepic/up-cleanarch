package br.com.danepic.cleanarch.usecase.model;

import lombok.Data;

import java.util.List;

@Data
public class CommonSearchDomain {

    private String key;

    private List<String> value;

}
