package ru.dmitriikotiashov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Дмитрий on 24.11.2018.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String getContacts(){
        return "contacts";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String getAbout(){
        return "about";
    }
}
