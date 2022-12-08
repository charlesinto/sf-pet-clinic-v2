package com.charlesinto.springframework.sfgclinic.services.map;

import com.charlesinto.springframework.sfgclinic.model.Owner;
import com.charlesinto.springframework.sfgclinic.services.CrudService;
import com.charlesinto.springframework.sfgclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
