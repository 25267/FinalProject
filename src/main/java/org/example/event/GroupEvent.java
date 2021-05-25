package org.example.event;

import org.springframework.context.ApplicationEvent;

public class GroupEvent extends ApplicationEvent {


    private String groupName;

    public GroupEvent(Object source, String groupName) {
        super(source);
        this.groupName = groupName;
    }




    public String getGroupName() {
        return groupName;
    }
}
