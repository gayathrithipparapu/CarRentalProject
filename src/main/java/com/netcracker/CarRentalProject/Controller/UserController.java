package com.netcracker.CarRentalProject.Controller;
import com.netcracker.CarRentalProject.Controller.bean.User;
import com.netcracker.CarRentalProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String LoginPage()
    {
        return "login";
    }
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String welcomepage(ModelMap model, @RequestParam String username, @RequestParam String password) {
        User user=userService.getUserByUserId(username);
        if(user.getPassword().equals(password))
        {
            model.put("username",username);
            return "welcome";
        }
        model.put("errorMsg","please provide correct information");
        return "login";
    }
    @RequestMapping(value="/register",method= RequestMethod.GET)
    public String RegisterPage(Model model)
    {
        User user=new User();
        model.addAttribute("user",user);
        return "register";
    }
    @RequestMapping(value="/register",method=RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user,ModelMap model){
        int c= userService.createNewUser(user);
        if(c!=1)
        {
            model.put("errorMsg","some issue occurred");
            return "register";
        }
        model.put("successMsg","User created Successfully");
        return "login";
    }
    @RequestMapping(value="/welcome",method=RequestMethod.GET)
    public String welcome()
    {
        return "welcome";
    }
    @RequestMapping(value="/welcome",method=RequestMethod.POST)
    public String welcomes(@RequestParam LocalTime from,LocalTime to,String model){
        return "welcome";


    }




}
