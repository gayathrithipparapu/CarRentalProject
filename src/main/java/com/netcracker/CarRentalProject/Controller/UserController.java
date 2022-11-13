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
            return "redirect:cardetails";
        }
        model.put("errorMsg","please enter correct details");
        return "login";
    }
    /*@RequestMapping(value="/register",method= RequestMethod.GET)
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
    }*/
    @RequestMapping(value="/cardetails",method = RequestMethod.GET)
    public ModelAndView cdetails()
    {
        ModelAndView model0=new ModelAndView();
        List<Cars> user=userService.getDetails();
        model0.addObject("cars", user);
        model0.setViewName("/cardetails");
        return model0;
    }
    @RequestMapping(value="/cardetails/{id}",method = RequestMethod.GET)
    public ModelAndView details(@PathVariable Integer id)
    {
        ModelAndView model2=new ModelAndView();
        Cars car=userService.getCarId(id);
        model2.addObject("book",car);
        model2.setViewName("/book");
        return model2;
    }
    @RequestMapping(value="/registration",method =RequestMethod.GET)
    public String rgdetails()
    {
        return "registration";
    }

    @RequestMapping(value="/cardetails",method = RequestMethod.POST)
    public ModelAndView rdetails(@RequestParam Integer regnum)
    {
        ModelAndView model2=new ModelAndView();
        Cars car=userService.getRegDetails(regnum);
        model2.addObject("cars",car);
        model2.setViewName("/registration");
        System.out.println(car);
        return model2;
    }
    @RequestMapping(value="/ascsort",method=RequestMethod.GET)
    public ModelAndView asortprice()
    {
        ModelAndView modv=new ModelAndView();
        List<Cars> cars=userService.getAscSortList();
        modv.addObject("cars",cars);
        modv.setViewName(("/ascsort"));
        return modv;
    }
    @RequestMapping(value="/ascsort/{id}",method = RequestMethod.GET)
    public ModelAndView asortdetails(@PathVariable Integer id)
    {
        ModelAndView model2=new ModelAndView("/book");
        Cars car=userService.getCarId(id);
        model2.addObject("book",car);
        return model2;
    }
    @RequestMapping(value="/dscsort",method=RequestMethod.GET)
    public ModelAndView dsortprice()
    {
        ModelAndView modv=new ModelAndView();
        List<Cars> cars=userService.getDscSortList();
        modv.addObject("cars",cars);
        modv.setViewName(("/dscsort"));
        return modv;
    }
    @RequestMapping(value="/dscsort/{id}",method = RequestMethod.GET)
    public ModelAndView dsortdetails(@PathVariable Integer id)
    {
        ModelAndView model2=new ModelAndView("/book");
        Cars car=userService.getCarId(id);
        model2.addObject("book",car);
        return model2;
    }

    @RequestMapping(value="/modelsort",method=RequestMethod.GET)
    public ModelAndView msortprice()
    {
        ModelAndView modv=new ModelAndView();
        List<Cars> cars=userService.getModelSortList();
        modv.addObject("cars",cars);
        modv.setViewName(("/modelsort"));
        return modv;
    }
    @RequestMapping(value="/modelsort/{id}",method = RequestMethod.GET)
    public ModelAndView msortdetails(@PathVariable Integer id)
    {
        ModelAndView model2=new ModelAndView("/book");
        Cars car=userService.getCarId(id);
        model2.addObject("book",car);
        return model2;
    }

    @RequestMapping(value="/welcome",method=RequestMethod.GET)
    public String welcome()
    {
        return "welcome";
    }
    @RequestMapping(value="/welcome",method = RequestMethod.POST)
    public ModelAndView cardetailpage(@RequestParam String fromtime,@RequestParam String totime,@RequestParam String model)
    {
        ModelAndView model1=new ModelAndView("redirect:/welcome2.jsp");
        LocalTime t1=LocalTime.parse(fromtime);
        LocalTime t2=LocalTime.parse(totime);
        List<Cars> user=userService.getCarDetails(t1,t2,model);
        model1.addObject("welcome2", user);
        model1.setViewName("welcome2");
        return model1;
    }
    /*@RequestMapping(value="welcome2",method = RequestMethod.GET)
    public String carid()
    {
        return "welcome2";
    }*/
    @RequestMapping(value="/welcome2/{id}",method = RequestMethod.GET)
    public ModelAndView carid(@PathVariable Integer id)
    {
        ModelAndView model2=new ModelAndView("/book");
        Cars car=userService.getCarId(id);
        model2.addObject("book",car);
        return model2;
    }
    @RequestMapping(value="/welcome2",method = RequestMethod.POST)
    public ModelAndView sort()
    {
        ModelAndView model3=new ModelAndView("/sort");
        List <Cars> cars=userService.getAscSortList();
        model3.addObject("sortcar",cars);
        model3.setViewName("sort");
        return model3;
    }

}
