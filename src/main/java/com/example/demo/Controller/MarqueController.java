package com.example.demo.Controller;

import com.example.demo.Entity.Marque;
import com.example.demo.Repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MarqueController {

    @Autowired
    private MarqueRepository marqueRepository;

    @ResponseBody
    @RequestMapping("/marques")
    public Iterable <Marque> getMarques(){
        return marqueRepository.findAll();
    }

    @ResponseBody
    @RequestMapping("/marques/id/{marqueId}")
    public Marque getMarqueById(@PathVariable("marqueId") int marqueId){
        return marqueRepository.findById(marqueId);
    }

    @ResponseBody
    @RequestMapping("/marques/name/{marqueName}")//affiche les marque selon le nom
    public Marque getMarqueByName(@PathVariable("marqueName") String marqueName){
        return marqueRepository.findMarqueByName(marqueName);
    }
}
