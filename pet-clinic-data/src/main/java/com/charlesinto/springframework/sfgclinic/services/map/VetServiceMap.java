package com.charlesinto.springframework.sfgclinic.services.map;

import com.charlesinto.springframework.sfgclinic.model.Vet;
import com.charlesinto.springframework.sfgclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }
}
