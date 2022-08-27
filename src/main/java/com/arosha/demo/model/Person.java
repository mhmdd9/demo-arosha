package com.arosha.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, HashSet<com.arosha.demo.model.Document> documents) {
        this.name = name;
        this.documents = documents;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "PERSON_DOCUMENTS")
    private Set<com.arosha.demo.model.Document> documents;

}
