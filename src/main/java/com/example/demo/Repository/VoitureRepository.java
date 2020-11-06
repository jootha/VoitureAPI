package com.example.demo.Repository;

import com.example.demo.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
    public Iterable<Voiture>findByName(String name);
    public List<Voiture>findByNameLike(String name);

}
