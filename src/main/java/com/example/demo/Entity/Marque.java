package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name= "MARQUE")
public class Marque {
    @Id
    @GeneratedValue
    @Column(name = "m_id")
    private int id;

    @Column(name = "m_name", length = 64, nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = "marque_id")
    private Set<Voiture> voitures;

    public Marque(String name) {
        this.name = name;
    }
    public Marque(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
