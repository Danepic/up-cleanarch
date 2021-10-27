package br.com.danepic.cleanarch.usecase.ports.usecase;

import br.com.danepic.cleanarch.usecase.model.CustomerDomain;

public interface CustomerCreateUsecasePort {
    CustomerDomain create(final CustomerDomain domain);
}
