package com.wtfismypassword.demo.controllers;

import com.wtfismypassword.demo.controllers.models.data.UserDao;
import com.wtfismypassword.demo.controllers.models.data.WebInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private WebInfoDao webInfoDao;

    @Autowired
    private UserDao userDao;

    //User login requirement here
    //If not logged in, ask for requirements when attempting to access one of these pages

    @RequestMapping(value = "")
    public String index(Model model) {
        //userDao info for this user goes here
        model.addAttribute("title", "WTF Is My Password?");

        return "index";
    }

    /*@RequestMapping(value = "list")
    public String userList(Model model) {
        //A list of a particular user's saved websites goes here so they can see them whenever they want
        //Also, they can type in hints and stuff, particular to each user
    }*/
}
