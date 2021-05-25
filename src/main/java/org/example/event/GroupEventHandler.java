package org.example.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class GroupEventHandler implements ApplicationListener<GroupEvent> {
    @Override
    public void onApplicationEvent(GroupEvent groupEvent) {
        System.out.println("Group with name: " + groupEvent.getGroupName() + " was created");
    }
}
