package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ResponderControler {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private ResponderService responderService;

    @Autowired
    public ResponderControler(ResponderService responderService){
        this.responderService = responderService;
    }

    @GetMapping("/form")
    public String showForm(Model model){
        Responder responder = new Responder();
        Diseases diseases = new Diseases();
        model.addAttribute("responder",responder);
        model.addAttribute("diseases",diseases);
        return "index";
    }

    @GetMapping("/")
    public String powitanie(){

        return "powitanie";
    }

    @PostMapping("/add")
    public String registerNewResponder(@ModelAttribute Responder responder,@ModelAttribute Diseases diseases){
        responderService.addNewResponder(responder,diseases);
        System.out.println(responderService);
    if(responderService!=null) {
        return "podziekowanie";
    }
    else
        return "index";
    }


}