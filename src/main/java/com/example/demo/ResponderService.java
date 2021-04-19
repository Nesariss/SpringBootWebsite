package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ResponderService {

    private final ResponderRepository responderRepository;

    @Autowired
    public ResponderService(ResponderRepository responderRepository){
        this.responderRepository = responderRepository;
    }


    public void addNewResponder(Responder responder) {
        responderRepository.save(responder);
        System.out.println(responder);
    }
}
