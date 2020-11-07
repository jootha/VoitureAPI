package com.example.demo.Repository;

import com.example.demo.Entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer> {
    public Marque findById(int id);

}