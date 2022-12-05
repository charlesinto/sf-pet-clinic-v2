package com.charlesinto.springframework.sfgclinic.services.map;

import com.charlesinto.springframework.sfgclinic.model.Owner;
import com.charlesinto.springframework.sfgclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }
}
