package ru.dmitriikotiashov.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.dmitriikotiashov.model.DoctorModel;

/**
 * Created by Дмитрий on 24.11.2018.
 */
@Controller
public class IndexController {

    DoctorModel doctorModel = new DoctorModel();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    public ModelAndView getDoctors(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doctors", doctorModel.getDoctors());
        modelAndView.setViewName("doctors");
        return modelAndView;
    }

    @RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
    public ModelAndView getDoctorById(@PathVariable String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doctor", doctorModel.getDoctorById(id));
        modelAndView.setViewName("doctor");
        return modelAndView;
    }

}
