package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String RecipeHome() {
        return "RecipeHome";
    }

    @RequestMapping("/CrabCake")
    public String CrabCake() {
        return "CrabCake";
    }

    @RequestMapping("/Meatloaf")
    public String Meatloaf() {
        return "Meatloaf";
    }

    @RequestMapping("/ApplePie")
    public String ApplePie() {
        return "ApplePie";
    }

    @RequestMapping("/ChickenNoodleSoup")
    public String ChickenNoodleSoup() {
        return "ChickenNoodleSoup";
    }

    @RequestMapping("/Brownies")
    public String Brownies() {
        return "Brownies";
    }

}

