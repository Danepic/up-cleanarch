package br.com.danepic.cleanarch.usecase.ports.gateway.entrypoints;

import br.com.danepic.cleanarch.usecase.model.CustomerDomain;
import br.com.danepic.cleanarch.usecase.model.PageInfoDomain;
import br.com.danepic.cleanarch.usecase.model.PageResponseDomain;

public interface CustomerPersistencePort {
    CustomerDomain create(final CustomerDomain domain);

    PageResponseDomain<CustomerDomain> read(PageInfoDomain pageable);
}
