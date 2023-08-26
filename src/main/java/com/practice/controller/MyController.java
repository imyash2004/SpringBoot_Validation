package com.practice.controller;

import com.practice.entities.LoginData;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @GetMapping("/form")
    public String openForm(Model m) {
        m.addAttribute("loginData", new LoginData());
        System.out.println("openeing fomr");
        return "form";
    }
    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData logindata, BindingResult result)
    {
        if(result.hasErrors())
        {
            System.out.println(result);
            System.out.println(logindata);
            return"form";
        }
        System.out.println(logindata);
        return "success";
    }
}
