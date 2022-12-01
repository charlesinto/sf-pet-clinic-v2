package com.charlesinto.springframework.sfgclinic.services;

import com.charlesinto.springframework.sfgclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
