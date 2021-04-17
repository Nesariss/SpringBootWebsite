package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
    @GetMapping("/car")
    public String get(Model model){
        Car car= new Car("mazda", "3");
        model.addAttribute("name", "Przemek");
        model.addAttribute("car", car);
        model.addAttribute("newCar",new Car());
        return"car";
    }

    @PostMapping("/add")
    public String addCar(@ModelAttribute Car car){
        System.out.println(car.getMark());



        return "redirect:/car";
    }
}