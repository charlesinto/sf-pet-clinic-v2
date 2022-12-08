package com.charlesinto.springframework.sfgclinic.bootstrap;

import com.charlesinto.springframework.sfgclinic.model.Owner;
import com.charlesinto.springframework.sfgclinic.model.Vet;
import com.charlesinto.springframework.sfgclinic.services.OwnerService;
import com.charlesinto.springframework.sfgclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Charles");
        owner1.setLastName("Onuorah");

        Owner owner2 = new Owner();
        owner2.setFirstName("Maurice");
        owner2.setLastName("Ononye");

        ownerService.save(owner2);
        ownerService.save(owner1);

        System.out.println("Creating Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jimmy");
        vet1.setLastName("Carter");

        Vet vet2 = new Vet();
        vet2.setFirstName("Laurel");
        vet2.setLastName("Edwards");

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Creating Vets....");


    }


}
