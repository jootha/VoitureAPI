package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue
    @Column(name = "v_id", nullable = false)
    private int id;

    @Column(name = "v_name", length = 64, nullable = false)
    private String name;

    @ManyToOne
    private Marque marque;
    @ManyToOne
    private Client client;

    public Voiture(String name, Marque marque) {
        this.name = name;
        this.marque=marque;
    }
    public Voiture(int id, String name, Marque marque, Client client) {
        this.id = id;
        this.name = name;
        this.marque=marque;
        this.client=client;
    }

    public String getName() {
        return name;
    }

   }
