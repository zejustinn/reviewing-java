package br.com.jlsj.springwebservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/home"
    )
    public String anything(){
        return "Result send to the requested resource \"home\"";
    }
}
