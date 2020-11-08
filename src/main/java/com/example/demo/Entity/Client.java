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
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "cl_id")
    private int id;

    @Column(name = "cl_name", length = 64, nullable = false)
    private String name;

    public Client(String name) {
        this.name = name;
    }
    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }
    

}
