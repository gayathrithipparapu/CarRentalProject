package com.netcracker.CarRentalProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String LoginPage()
    {
        return "login";
    }
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String welcomepage(ModelMap model, @RequestParam String username, @RequestParam String password) {
        if (username.equals("admin") && password.equals("root")) {
            return "welcome";
        }
        model.put("errorMsg", "please provide correct username and password");
        return "login";


    }


}
