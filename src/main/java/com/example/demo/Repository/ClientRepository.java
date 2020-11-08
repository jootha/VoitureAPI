package com.example.demo.Repository;

import com.example.demo.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    public Client findById(int id);
    public List<Client> findByNameLike(String name);


}