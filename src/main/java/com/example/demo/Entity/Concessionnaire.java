package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Concessionnaire {
    @Id
    @GeneratedValue
    @Column(name = "co_id")
    private int id;

    @Column(name = "co_name", length = 64, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "concessionnaires")
    private Set<Marque> marque= new HashSet<>();


    public Concessionnaire(String name) {
        this.name = name;
    }
    public Concessionnaire(int id, String name, Marque marque) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
