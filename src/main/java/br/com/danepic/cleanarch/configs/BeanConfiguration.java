package br.com.danepic.cleanarch.configs;

import br.com.danepic.cleanarch.usecase.impl.CustomerCreateUsecaseImpl;
import br.com.danepic.cleanarch.usecase.impl.CustomerReadUsecaseImpl;
import br.com.danepic.cleanarch.usecase.ports.gateway.dataProviders.CustomerPersistencePort;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CustomerCreateUsecaseImpl customerCreateUsecaseImpl(CustomerPersistencePort persistencePort) {
        return new CustomerCreateUsecaseImpl(persistencePort);
    }

    @Bean
    public CustomerReadUsecaseImpl customerReadUsecaseImpl(CustomerPersistencePort persistencePort) {
        return new CustomerReadUsecaseImpl(persistencePort);
    }

    @Bean
    public ModelMapper modelMapper() {
        final ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

}
