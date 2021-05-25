package org.example.services;

import org.example.model.Type;
import org.example.repositories.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {


    @Autowired
    private TypeRepository typeRepository;


    public void createType(Type genre) {

        Type newType = new Type();

        newType.setTypeName(genre.getTypeName());

        typeRepository.save(newType);
    }

    public void deleteType(Long id) {
        typeRepository.deleteById(id);
    }
}
