package com.example.demo.Controller;

import com.example.demo.Entity.Concessionnaire;
import com.example.demo.Repository.ConcessionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConcessionnaireController {

    @Autowired
    private ConcessionnaireRepository concessionnaireRepository;

    @ResponseBody
    @RequestMapping("/concessionnaires")
    public Iterable <Concessionnaire> getConcessionnaires(){
        return concessionnaireRepository.findAll();
    }

    @ResponseBody
    @RequestMapping("/concessionnaires/id/{concessionnaireId}")
    public Concessionnaire getconcessionnaireById(@PathVariable("concessionnaireId") int concessionnaireId){
        return concessionnaireRepository.findById(concessionnaireId);
    }
    @ResponseBody
    @RequestMapping("/concessionnaires/name/{concessionnaireName}")
    public Iterable<Concessionnaire> getconcessionnairesByName(@PathVariable("concessionnaireName") String concessionnaireName){
        return concessionnaireRepository.findAllByName(concessionnaireName);
    }
}
