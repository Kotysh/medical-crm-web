package ru.dmitriikotiashov.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import ru.dmitriikotiashov.entities.Person;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Дмитрий on 04.12.2018.
 */
@Controller
public class Authorization {

    RestTemplate restTemplate = new RestTemplate();
    ObjectMapper objectMapper = new ObjectMapper();

    public static final String AUTHORIZATION_PATH = "http://localhost:8088/authorization";

    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    public ModelAndView authorization(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        String login = parameterMap.get("login")[0];
        String password = parameterMap.get("password")[0];
        Person person = authorizationResponse(login, password);
        boolean isLog = person != null;
        request.getSession().setAttribute("isLog", isLog);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("person", person);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/exit", method = RequestMethod.GET)
    public ModelAndView exit(HttpServletRequest request){
        request.getSession().removeAttribute("isLog");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView error(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    public Person authorizationResponse(String login, String password){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("login", login);
        httpHeaders.add("password", password);
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        try {
            return objectMapper.readValue(
                    restTemplate.exchange(AUTHORIZATION_PATH, HttpMethod.POST, entity, String.class).getBody(),
                    Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
