package test.controller;

import javafx.scene.control.Skin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import test.bean.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)

    public ModelAndView user(){
        User user = new User();
        user.setFavoriteFrameworks((new String[]{"Spring MVC","Struts 2"}));
        user.setGender("M");
        user.setFavoriteNumber("1");
        return new ModelAndView("user","command",user);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("SpringWeb")User user, ModelMap model){
        model.addAttribute("username",user.getUsername());
        model.addAttribute("password",user.getPassword());
        model.addAttribute("address", user.getAddress());
        model.addAttribute("receivePaper",user.isReceivePaper());
        model.addAttribute("favoriteFrameworks",user.getFavoriteFrameworks());
        model.addAttribute("gender",user.getGender());
        model.addAttribute("favoriteNumber",user.getFavoriteNumber());
        model.addAttribute("country",user.getCountry());
        model.addAttribute("skills", user.getSkills());
        return "userlist";
    }

    //这里是为了方便前端用于显示相关内容的
    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList(){
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");
        return webFrameworkList;
    }

    @ModelAttribute("numberList")
    public List<String> getNumberList(){
        List<String> numberList = new ArrayList<String>();
        numberList.add("1");
        numberList.add("2");
        numberList.add("3");
        numberList.add("4");
        return numberList;
    }

    @ModelAttribute("countryList")
    public Map<String, String> getCountryList(){
        Map<String, String> countryList = new HashMap<>();
        countryList.put("US","United States");
        countryList.put("CH", "China");
        countryList.put("SG", "Singapore");
        countryList.put("MY", "Malaysia");
        return countryList;
    }

    @ModelAttribute("skillsList")
    public Map<String, String> getSkillsList(){
        Map<String, String> skillList = new HashMap<>();
        skillList.put("Hibernate", "Hibernate");
        skillList.put("Spring", "Spring");
        skillList.put("Apache Hadoop", "Apache Hadoop");
        skillList.put("Struts", "Struts");
        return skillList;
    }
}
