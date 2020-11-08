package com.example.demo.Controller;

import com.example.demo.Entity.Adresse;
import com.example.demo.Entity.Client;
import com.example.demo.Entity.Voiture;
import com.example.demo.Repository.AdresseRepository;
import com.example.demo.Repository.ConcessionnaireRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdresseController {

    @Autowired
    private AdresseRepository adresseRepository;
    @Autowired
    private ConcessionnaireRepository cconcessionnaireRepository;
    @ResponseBody
    @RequestMapping("/adresses")
    public Iterable <Adresse> getAdresses(){
        return adresseRepository.findAll();
    }

    @ResponseBody
    @RequestMapping("/adresses/{addr}")
    public Adresse getAdresseByAddr(@PathVariable("addr") String addr){
        return adresseRepository.findByAddr(addr);
    }
    @ResponseBody
    @RequestMapping("/adresses/concessionnaire/{concessionnaireId}")//affiche les adresses d'un concessionnaire
    public Iterable<Adresse> getAdresseByIConcessionnaireId(@PathVariable("concessionnaireId") int concessionnaireId){
        return adresseRepository.findAllByConcessionnaire(cconcessionnaireRepository.findById(concessionnaireId));
    }
}
