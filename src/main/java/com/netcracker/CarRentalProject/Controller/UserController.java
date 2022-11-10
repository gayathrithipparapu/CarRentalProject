package com.netcracker.CarRentalProject.Controller;
import com.netcracker.CarRentalProject.Controller.bean.Cars;
import com.netcracker.CarRentalProject.Controller.bean.User;
import com.netcracker.CarRentalProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Ssl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

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
            return "redirect:welcome";
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

    @RequestMapping(value="/welcome",method = RequestMethod.POST)
    public ModelAndView cardetailpage(ModelAndView model1,@RequestParam String fromtime,@RequestParam String totime,@RequestParam String model)
    {
        LocalTime t1=LocalTime.parse(fromtime);
        LocalTime t2=LocalTime.parse(totime);
        List<Cars> user=userService.getCarDetails(t1,t2,model);
        model1.addObject("welcome2", user);
        model1.setViewName("welcome2");
        return model1;

    }
    @RequestMapping(value="/welcome2",method = RequestMethod.POST)
    public ModelAndView carid(ModelAndView model2,@RequestParam Integer id)
    {
        List<Cars> user=userService.getCarId(id);
        model2.addObject("book",user);
        model2.setViewName("book");
        return model2;
    }
    @RequestMapping(value="/book",method=RequestMethod.GET)
    public String welcome2()
    {

        return "book";
    }

}
