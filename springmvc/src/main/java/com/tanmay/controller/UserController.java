package com.tanmay.controller;

import com.tanmay.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tanmay
 * @date 09/11/19
 **/

@Controller
public class UserController {

    @RequestMapping("/registerPage")
    public ModelAndView showRegistrationPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userReg");
        return mav;
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute("user") User user) {
        System.out.println(user);
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Successfully registered");
        mav.setViewName("success");
        return mav;
    }
}
