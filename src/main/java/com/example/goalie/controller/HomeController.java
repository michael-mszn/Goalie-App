package com.example.goalie.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    //input fields need to have the tags "name = name", "name = password" and "name = role" respectively in HTML
    //in order to be recognized as a parameter
    //Multiple paths can be specified as values to execute the same controller logic
    @RequestMapping(method = GET, value = {"/", "/home"})
    public String getHome() {
        return "home";
    }

}