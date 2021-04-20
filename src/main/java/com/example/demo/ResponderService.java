package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Service
public class ResponderService {

    private final ResponderRepository responderRepository;
    private final DiseasesRepository diseasesRepository;

    @Autowired
    public ResponderService(ResponderRepository responderRepository,DiseasesRepository diseasesRepository){
        this.responderRepository = responderRepository;
        this.diseasesRepository =  diseasesRepository;
    }




    public void addNewResponder(Responder responder,Diseases diseases) {

        responder.setDiseases(diseases);
        responderRepository.save(responder);
        diseasesRepository.save(diseases);
        System.out.println(responder);
    }
}
