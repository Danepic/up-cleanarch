package br.com.danepic.cleanarch.usecase.impl;

import br.com.danepic.cleanarch.usecase.model.CustomerDomain;
import br.com.danepic.cleanarch.usecase.ports.gateway.dataProviders.CustomerPersistencePort;
import br.com.danepic.cleanarch.usecase.ports.usecase.CustomerCreateUsecasePort;

public class CustomerCreateUsecaseImpl implements CustomerCreateUsecasePort {

    private final CustomerPersistencePort persistencePort;

    public CustomerCreateUsecaseImpl(CustomerPersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public CustomerDomain create(CustomerDomain domain) {
        //Regras de Negocio
        return persistencePort.create(domain);
    }
}
