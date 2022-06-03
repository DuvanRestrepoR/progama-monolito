package com.pragma.monolito.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pragma.monolito.persistence.entity.Imagen;

public interface ImagenCrudRepository extends CrudRepository <Imagen,Integer> {

    List<Imagen> findByIdPersona(int idPersona);
    
}
