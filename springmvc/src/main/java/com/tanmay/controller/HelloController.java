package com.tanmay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("id", 1000); //set these values and they will be available in the UI
        modelAndView.addObject("name", "Tanmay");
        modelAndView.addObject("Salary", 10000);
        return modelAndView;
    }
}