package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Adresse {
    @Id
    @Column(name = "a_addr", length = 64, nullable = false)
    private String addr;
    @ManyToOne
    private Concessionnaire concessionnaire;

    public Adresse(String addr) {
        this.addr = addr;
    }
    public Adresse(String addr, Concessionnaire concessionnaire) {
        this.addr = addr;
        this.concessionnaire=concessionnaire;
    }

    public String getAddr() {
        return addr;
    }

   }
