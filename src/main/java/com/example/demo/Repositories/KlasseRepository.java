package com.example.demo.Repositories;

import com.example.demo.Entities.Klasse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlasseRepository extends CrudRepository<Klasse, Long> {
}
