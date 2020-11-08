package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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


    public Concessionnaire(String name) {
        this.name = name;
    }
    public Concessionnaire(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
