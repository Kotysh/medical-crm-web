package ru.dmitriikotiashov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Дмитрий on 22.12.2018.
 */
@Controller
public class ClinicMCController {

    @RequestMapping(value = "/clinics", method = RequestMethod.GET)
    public String getClinics(HttpServletRequest request){
        System.out.println(request.getParameter("nameClinic"));
        System.out.println(request.getParameter("region"));
        System.out.println(request.getParameter("city"));
        return "clinics";
    }

}
