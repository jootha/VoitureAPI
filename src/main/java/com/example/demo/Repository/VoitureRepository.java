package com.example.demo.Repository;

import com.example.demo.Entity.Client;
import com.example.demo.Entity.Marque;
import com.example.demo.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
    public Voiture findById(int id);
    public Iterable<Voiture> findAllByName(String name);
    public Iterable<Voiture> findAllByMarque(Marque marque);
    public Iterable<Voiture> findAllByClient(Client client);

}
