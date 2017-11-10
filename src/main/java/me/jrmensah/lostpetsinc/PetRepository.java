package me.jrmensah.lostpetsinc;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<PetRepository, Long> {
    void save(Pet pet);
}