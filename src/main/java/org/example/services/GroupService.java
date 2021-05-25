package org.example.services;

import org.example.event.GroupEvent;
import org.example.model.Group;
import org.example.model.Type;
import org.example.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class GroupService  implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private GroupRepository groupRepository;


    public void createGroup(Group group) {
        this.eventPublisher.publishEvent(new GroupEvent(this, group.getGroupName()));
        Group newGroup = new Group();
        newGroup.setId(group.getId());
        newGroup.setGroupName(group.getGroupName());

        groupRepository.save(newGroup);
    }

    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
