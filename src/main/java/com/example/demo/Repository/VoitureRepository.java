package com.example.demo.Repository;

import com.example.demo.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
    public Voiture findById(int id);

}
