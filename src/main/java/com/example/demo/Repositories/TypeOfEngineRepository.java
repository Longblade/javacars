package com.example.demo.Repositories;

import com.example.demo.Entities.TypeOfEngine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfEngineRepository extends CrudRepository<TypeOfEngine, Long> {
}
