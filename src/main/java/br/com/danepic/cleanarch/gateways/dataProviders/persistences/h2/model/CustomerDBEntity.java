package br.com.danepic.cleanarch.gateways.dataProviders.persistences.h2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_CUSTOMER")
public class CustomerDBEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;
}
