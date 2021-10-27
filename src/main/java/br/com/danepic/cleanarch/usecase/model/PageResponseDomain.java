package br.com.danepic.cleanarch.usecase.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PageResponseDomain<T> {

    private PageInfoDomain pageInfo;

    private List<T> content = new ArrayList<>();

    private long totalElements;

    private long totalPages;
}
