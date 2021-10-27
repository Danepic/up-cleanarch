package br.com.danepic.cleanarch.gateways.entrypoints.controllers;

import br.com.danepic.cleanarch.gateways.entrypoints.controllers.model.CustomerDto;
import br.com.danepic.cleanarch.gateways.entrypoints.controllers.model.PageResponseDto;
import br.com.danepic.cleanarch.usecase.model.CustomerDomain;
import br.com.danepic.cleanarch.usecase.model.PageInfoDomain;
import br.com.danepic.cleanarch.usecase.model.PageResponseDomain;
import br.com.danepic.cleanarch.usecase.ports.usecase.CustomerCreateUsecasePort;
import br.com.danepic.cleanarch.usecase.ports.usecase.CustomerReadUsecasePort;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerCreateUsecasePort createUsecasePort;

    @Autowired
    private CustomerReadUsecasePort readUsecasePort;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto create(@RequestBody @Valid final CustomerDto dto) {
        final CustomerDomain create = this.createUsecasePort.create(modelMapper.map(dto, CustomerDomain.class));
        return modelMapper.map(create, CustomerDto.class);
    }

    @GetMapping
    public PageResponseDto<CustomerDto> read(@PageableDefault(size = 20, sort = "name", direction = Sort.Direction.ASC) Pageable pageable) {
        final PageResponseDomain<CustomerDomain> read = this.readUsecasePort.read(modelMapper.map(pageable, PageInfoDomain.class));
        return modelMapper.map(read, new TypeToken<PageResponseDto<CustomerDto>>() {}.getType());
    }
}
