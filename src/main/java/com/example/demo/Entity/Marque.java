package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Marque {
    @Id
    @GeneratedValue
    @Column(name = "m_id")
    private int id;

    @Column(name = "m_name", length = 64, nullable = false, unique=true)
    private String name;

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
