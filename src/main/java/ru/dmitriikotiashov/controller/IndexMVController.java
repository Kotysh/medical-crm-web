package ru.dmitriikotiashov.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import ru.dmitriikotiashov.entities.Message;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Дмитрий on 24.11.2018.
 */
@Controller
public class IndexMVController {

    RestTemplate restTemplate = new RestTemplate();

    public static final String MESSAGE_PATH = "http://localhost:8088/messageManager/message";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String getContacts(){
        return "contacts";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public String sendMessage(HttpServletRequest request){
        Message message = new Message();
        message.setMessage(request.getParameter("message"));
        HttpEntity<Message> entity = new HttpEntity<>(message);
        restTemplate.exchange(MESSAGE_PATH, HttpMethod.POST, entity, String.class);
        return "contacts";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String getAbout(){
        return "about";
    }
}
