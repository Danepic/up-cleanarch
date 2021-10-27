package br.com.danepic.cleanarch.gateways.dataProviders.persistences.h2.repository;

import br.com.danepic.cleanarch.gateways.dataProviders.persistences.h2.model.CustomerDBEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDBEntity, Long> {
}
