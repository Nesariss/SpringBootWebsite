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
        model.addAttribute("responder",responder);
        return "index";
    }

    @GetMapping("/")
    public String powitanie(){

        return "powitanie";
    }

    @PostMapping("/add")
    public String registerNewResponder(@ModelAttribute Responder responder){
        responderService.addNewResponder(responder);
        System.out.println(responderService);
    if(responderService!=null) {
        return "podziekowanie";
    }
    else
        return "index";
    }
/*
    @GetMapping("/car")
    public String get(Model model){
        Car car= new Car("mazda", "3");

        model.addAttribute("car", car);
        model.addAttribute("newCar",new Car());
        return"car";
    }

    @PostMapping("/add")
    public String addCar(@ModelAttribute Car car){
        System.out.println(car.getMark());

        int id=2;
        int wiek=22;
        String sql="INSERT INTO uzytkownik (id,wiek,model) VALUES(?,?,?)";
        int rows=jdbcTemplate.update(sql,id,wiek,modell);
        if(rows>0){
            System.out.println("A new row has been added");
        }
        return "redirect:/car";
    }

 */

}