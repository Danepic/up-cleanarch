package br.com.danepic.cleanarch.gateways.entrypoints.controllers.model;

import br.com.danepic.cleanarch.usecase.model.PageInfoDomain;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PageResponseDto<T> {

    private PageInfoDomain pageInfo;

    private List<T> content = new ArrayList<>();

    private long totalElements;

    private long totalPages;
}
