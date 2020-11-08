package com.example.demo.Controller;

import com.example.demo.Entity.Client;
import com.example.demo.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @ResponseBody
    @RequestMapping("/clients")
    public Iterable <Client> getClients(){
        return clientRepository.findAll();
    }

    @ResponseBody
    @RequestMapping("/clients/id/{clientId}")
    public Client getclientById(@PathVariable("clientId") int clientId){
        return clientRepository.findById(clientId);
    }

    @ResponseBody
    @RequestMapping("/clients/name/{clientName}")
    public Iterable<Client> getclientById(@PathVariable("clientName") String clientName){
        return clientRepository.findByName(clientName);
    }

    }
