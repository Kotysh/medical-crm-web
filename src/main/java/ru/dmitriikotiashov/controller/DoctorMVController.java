package ru.dmitriikotiashov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.dmitriikotiashov.entities.Doctor;
import ru.dmitriikotiashov.model.DoctorModel;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DoctorMVController {

    DoctorModel doctorModel = new DoctorModel();

    @RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
    public ModelAndView getDoctorById(@PathVariable String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doctor", doctorModel.getDoctorById(id));
        modelAndView.setViewName("doctor");
        return modelAndView;
    }

    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    public ModelAndView getDoctors(HttpServletRequest request){
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String profession = request.getParameter("profession");
        String region = request.getParameter("region");
        String city = request.getParameter("city");

        List<Doctor> doctorList = doctorModel.getDoctors();
        List<Doctor> newList = new ArrayList<>();
        if (firstName != null){
            newList.addAll(doctorList.stream().filter(
                    doctor -> (doctor.getPerson().getFirstName().equals(firstName))
            ).collect(Collectors.toList()));
        }
        if (middleName != null){
            newList.addAll(doctorList.stream().filter(
                    doctor -> (doctor.getPerson().getMiddleName().equals(middleName))
            ).collect(Collectors.toList()));
        }
        if (lastName != null){
            newList.addAll(doctorList.stream().filter(
                    doctor -> (doctor.getPerson().getLastName().equals(lastName))
            ).collect(Collectors.toList()));
        }
        if (profession != null){
            newList.addAll(doctorList.stream().filter(
                    doctor -> (doctor.getProfession().getName().equals(profession))
            ).collect(Collectors.toList()));
        }

        System.out.println(newList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doctors", newList);
        modelAndView.setViewName("doctors");
        return modelAndView;
    }
}
