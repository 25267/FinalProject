package org.example.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;


    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference(value = "user-group")
    private List<User> userList;

    @OneToOne(mappedBy = "group", fetch = FetchType.LAZY)
    @JsonManagedReference(value = "group-notes")
    private Note note;
}
