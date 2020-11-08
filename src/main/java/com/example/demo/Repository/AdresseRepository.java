package com.example.demo.Repository;

import com.example.demo.Entity.Adresse;
import com.example.demo.Entity.Concessionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
    public Adresse findByAddr(String addr);
    public Iterable<Adresse> findAllByConcessionnaire(Concessionnaire concessionnaire);
}