package com.charlesinto.springframework.sfgclinic.services;

import com.charlesinto.springframework.sfgclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
