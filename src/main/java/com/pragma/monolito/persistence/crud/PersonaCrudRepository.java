package com.pragma.monolito.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pragma.monolito.persistence.entity.Persona;


public interface PersonaCrudRepository extends CrudRepository<Persona,Integer>{

    List<Persona> findByNombresOrderByNombresAsc(String nombres);

    public Optional<Persona> findByDocumento(String documento);
    
}
