package com.wtfismypassword.demo.controllers;

import com.wtfismypassword.demo.controllers.models.PasswordRequirementType;
import com.wtfismypassword.demo.controllers.models.User;
import com.wtfismypassword.demo.controllers.models.WebInfo;
import com.wtfismypassword.demo.controllers.models.data.UserDao;
import com.wtfismypassword.demo.controllers.models.data.WebInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "")
public class WebInfoController{
    @Autowired
    private WebInfoDao webInfoDao;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("websites", webInfoDao.findAll());
        model.addAttribute("title", "WTF Is My Password?");

        return "webinfo/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addWebsite(Model model){
        model.addAttribute(new WebInfo());
        model.addAttribute("passwordRequirements", PasswordRequirementType.values());
        model.addAttribute("title", "Add Website");

        return "webinfo/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String confirmWebsite(Model model, @ModelAttribute @Valid WebInfo webInfo, Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("title", "Add Website");
            model.addAttribute("passwordRequirements", PasswordRequirementType.values());
            return "webinfo/add";
        }
        webInfoDao.save(webInfo);
        return "redirect:";
    }

    @RequestMapping(value = "/{websiteId}")
    public String oneWebsite(Model model, @PathVariable int websiteId){
        WebInfo webInfo = webInfoDao.findOne(websiteId);
        model.addAttribute("webInfo", webInfo);
        return "webinfo/view";
    }

    @RequestMapping(value = "join", method = RequestMethod.GET)
    public String addUser(Model model){
        model.addAttribute(new User());
        model.addAttribute("title", "Join WTFIsMyPassword");

        return "webinfo/join";
    }

    @RequestMapping(value = "join", method = RequestMethod.POST)
    public String confirmUser(Model model, Errors errors, @ModelAttribute @Valid User user){
        if(errors.hasErrors()){
            model.addAttribute("title", "Join WTFIsMyPassword");
            return "webinfo/join";
        }
        userDao.save(user);
        return "redirect:";
    }
}
