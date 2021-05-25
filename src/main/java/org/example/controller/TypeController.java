package org.example.controller;

import org.example.model.Type;
import org.example.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @PostMapping()
    public void createType(@RequestBody Type type){
        typeService.createType(type);
    }


    @DeleteMapping("/{id}")
    public void deleteType(@RequestParam Long id){
        typeService.deleteType(id);
    }

}
