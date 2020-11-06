package com.example.demo.Controller;

import com.example.demo.Entity.Marque;
import com.example.demo.Repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MarqueController {

    @Autowired
    private MarqueRepository marqueRepository;

    @ResponseBody
    @RequestMapping("/marques")
    public Iterable <Marque> getMarques(){
        return marqueRepository.findAll();
    }
}
