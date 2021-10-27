package br.com.danepic.cleanarch.usecase.impl;

import br.com.danepic.cleanarch.usecase.model.CustomerDomain;
import br.com.danepic.cleanarch.usecase.model.PageInfoDomain;
import br.com.danepic.cleanarch.usecase.model.PageResponseDomain;
import br.com.danepic.cleanarch.usecase.ports.gateway.dataProviders.CustomerPersistencePort;
import br.com.danepic.cleanarch.usecase.ports.usecase.CustomerReadUsecasePort;

public class CustomerReadUsecaseImpl implements CustomerReadUsecasePort {

    private final CustomerPersistencePort persistencePort;

    public CustomerReadUsecaseImpl(CustomerPersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public PageResponseDomain<CustomerDomain> read(PageInfoDomain pageable) {
        //Regras de Negocio
        return persistencePort.read(pageable);
    }
}
