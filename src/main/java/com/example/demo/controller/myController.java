package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myController {
    @Autowired
    public TestMapper testMapper;

    @GetMapping("/test")
    public String home(Model model){
        var datas=testMapper.getDatas();
        model.addAttribute("datas",datas);
        return "index";
    }
}
