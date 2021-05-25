package org.example.controller;

import org.example.model.Group;
import org.example.model.Type;
import org.example.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class GroupController {


    @Autowired
    private GroupService groupService;

    @PostMapping()
    public void createGroup(@RequestBody Group group){
        groupService.createGroup(group);
    }


    @DeleteMapping("/{id}")
    public void deleteGroup(@RequestParam Long id){
        groupService.deleteGroup(id);
    }

}
