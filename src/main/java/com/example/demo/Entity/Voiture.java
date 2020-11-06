package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name= "VOITURE")
public class Voiture {
    @Id
    @GeneratedValue
    @Column(name = "v_id")
    private int id;

    @Column(name = "v_name", length = 64, nullable = false)
    private String name;

    //@ManyToOne
    //private client;

    public Voiture(String name) {
        this.name = name;
    }
    public Voiture(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
