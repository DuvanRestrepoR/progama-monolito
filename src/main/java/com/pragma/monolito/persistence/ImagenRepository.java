package com.pragma.monolito.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pragma.monolito.persistence.crud.ImagenCrudRepository;
import com.pragma.monolito.persistence.entity.Imagen;

@Repository
public class ImagenRepository {

    private ImagenCrudRepository imagenCrudRepository;

    public List<Imagen> getAll(){
        return (List<Imagen>) imagenCrudRepository.findAll();
    }

    public List<Imagen> getByIdPersona(int idPersona){
        return imagenCrudRepository.findByIdPersona(idPersona);
    }

    public Imagen save(Imagen imagen){
        return imagenCrudRepository.save(imagen);
    }

    public void delete(int idImagen){
        imagenCrudRepository.deleteById(idImagen);
    }
    
}
