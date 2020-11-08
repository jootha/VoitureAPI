package com.example.demo.Controller;

import com.example.demo.Entity.Marque;
import com.example.demo.Entity.Voiture;
import com.example.demo.Repository.ClientRepository;
import com.example.demo.Repository.MarqueRepository;
import com.example.demo.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;
    @Autowired
    private MarqueRepository marqueRepository;
    @Autowired
    private ClientRepository clientRepository;

    @ResponseBody
    @RequestMapping("/voitures")//affiche toutes les voitures
    public Iterable <Voiture> getVoitures(){
        return voitureRepository.findAll();
    }

    @ResponseBody
    @RequestMapping("/voitures/{voitureId}")//affiche la voiture selon son Id
    public Voiture getVoitureById(@PathVariable("voitureId") int voitureId){
        return voitureRepository.findById(voitureId);
    }

    @ResponseBody
    @RequestMapping("/voitures/marque/{marque}")//affiche les voitures selon leur marques
    public Iterable<Voiture> getVoitureByIMarque(@PathVariable("marque") String marque){
        return voitureRepository.findAllByMarque(marqueRepository.findMarqueByName(marque));
    }

    @ResponseBody
    @RequestMapping("/voitures/client/{clientId}")//affiche les voitures selon leur client
    public Iterable<Voiture> getVoitureByIClientId(@PathVariable("clientId") int clientId){
        return voitureRepository.findAllByClient(clientRepository.findById(clientId));
    }
}
