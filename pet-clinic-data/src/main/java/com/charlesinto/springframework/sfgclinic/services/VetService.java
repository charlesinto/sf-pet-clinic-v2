package com.charlesinto.springframework.sfgclinic.services;

import com.charlesinto.springframework.sfgclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
