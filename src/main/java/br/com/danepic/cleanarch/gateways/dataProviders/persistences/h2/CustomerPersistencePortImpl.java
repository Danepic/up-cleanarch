package br.com.danepic.cleanarch.gateways.dataProviders.persistences.h2;

import br.com.danepic.cleanarch.gateways.dataProviders.persistences.h2.model.CustomerDBEntity;
import br.com.danepic.cleanarch.gateways.dataProviders.persistences.h2.repository.CustomerRepository;
import br.com.danepic.cleanarch.usecase.model.CustomerDomain;
import br.com.danepic.cleanarch.usecase.model.PageInfoDomain;
import br.com.danepic.cleanarch.usecase.model.PageResponseDomain;
import br.com.danepic.cleanarch.usecase.ports.gateway.dataProviders.CustomerPersistencePort;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

@Component
public class CustomerPersistencePortImpl implements CustomerPersistencePort {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CustomerDomain create(CustomerDomain domain) {
        final CustomerDBEntity saved = repository.save(modelMapper.map(domain, CustomerDBEntity.class));
        return modelMapper.map(saved, CustomerDomain.class);
    }

    @Override
    public PageResponseDomain<CustomerDomain> read(PageInfoDomain pageable) {
        final PageRequest pageRequest = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());

        final Page<CustomerDBEntity> paginationContent = repository.findAll(pageRequest);

        final PageResponseDomain<CustomerDomain> result = modelMapper.map(paginationContent, new TypeToken<PageResponseDomain<CustomerDomain>>() {
        }.getType());

        result.setPageInfo(pageable);

        return result;
    }
}
