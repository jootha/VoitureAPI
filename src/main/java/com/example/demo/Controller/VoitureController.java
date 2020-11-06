package com.example.demo.Controller;

import com.example.demo.Entity.Voiture;
import com.example.demo.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;


    @ResponseBody
    @RequestMapping("/voitures/json")
    public Iterable <Voiture> getVoitures(){
        return voitureRepository.findAll();
    }
}
