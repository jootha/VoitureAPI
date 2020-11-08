package com.example.demo.Repository;

import com.example.demo.Entity.Concessionnaire;
import com.example.demo.Entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer> {
    public Marque findById(int id);
    public Marque findMarqueByName(String name);
    //public Iterable<Marque> findAllByConcessionnaire(Concessionnaire concessionnaire);
    //public Marque findMarquesByConcessionnairesAndId(Iterable<Concessionnaire> concessionnaires);
}