package com.example.demo.Controller;

import com.example.demo.Entity.Voiture;
import com.example.demo.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @ResponseBody
    @RequestMapping("/voitures")
    public Iterable <Voiture> getVoitures(){
        return voitureRepository.findAll();
    }
    @ResponseBody
    @RequestMapping("/voitures/{voitureId}")
    public Voiture getVoitureById(@PathVariable("voitureId") int voitureId){
        return voitureRepository.findById(voitureId);
    }
}
