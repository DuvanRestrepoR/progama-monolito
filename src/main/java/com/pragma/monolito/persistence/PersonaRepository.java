package com.pragma.monolito.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.pragma.monolito.persistence.crud.PersonaCrudRepository;
import com.pragma.monolito.persistence.entity.Persona;

@Repository
public class PersonaRepository {

    private PersonaCrudRepository personaCrudRepository;

    public List<Persona> getAll(){
        return (List<Persona>) personaCrudRepository.findAll();
    }

    public List<Persona> getByNombres(String nombres){
        return personaCrudRepository.findByNombresOrderByNombresAsc(nombres);
    }

    public Optional<Persona> getPersonaByDocumento(String documento){
        return personaCrudRepository.findByDocumento(documento);
    }

    public Persona save(Persona persona){
        return personaCrudRepository.save(persona);
    }

    public void delete(int idPersona){
        personaCrudRepository.deleteById(idPersona);
    }
    
}
