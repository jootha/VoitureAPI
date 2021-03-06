package com.example.demo.Repository;

import com.example.demo.Entity.Concessionnaire;
import com.example.demo.Entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcessionnaireRepository extends JpaRepository<Concessionnaire, Integer> {
    public Concessionnaire findById(int id);
    public Iterable<Concessionnaire> findAllByName(String name);
    //public Iterable<Concessionnaire> findAllByMarque(Marque marque);
}
