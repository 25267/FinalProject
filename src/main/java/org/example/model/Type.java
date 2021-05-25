package org.example.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String typeName;

    @OneToOne(mappedBy = "type", fetch = FetchType.LAZY)
    @JsonManagedReference(value = "note-types")
    private Note note;
}
