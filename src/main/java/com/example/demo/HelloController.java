package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static String modell;

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
        modell=car.getMark();
        int id=2;
        int wiek=22;
        String sql="INSERT INTO uzytkownik (id,wiek,model) VALUES(?,?,?)";
        int rows=jdbcTemplate.update(sql,id,wiek,modell);
        if(rows>0){
            System.out.println("A new row has been added");
        }
        return "redirect:/car";
    }
}