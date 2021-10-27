package br.com.danepic.cleanarch.usecase.ports.usecase;

import br.com.danepic.cleanarch.usecase.model.CustomerDomain;
import br.com.danepic.cleanarch.usecase.model.PageInfoDomain;
import br.com.danepic.cleanarch.usecase.model.PageResponseDomain;

public interface CustomerReadUsecasePort {
    PageResponseDomain<CustomerDomain> read(PageInfoDomain pageable);
}
