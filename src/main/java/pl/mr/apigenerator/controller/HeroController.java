package pl.mr.apigenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.mr.apigenerator.model.Enemy;
import pl.mr.apigenerator.model.Hero;
import pl.mr.apigenerator.service.HeroService;

import java.util.Optional;


@RestController
@RequestMapping("/api/test")
@CrossOrigin("http://localhost:3000")
public class HeroController {

    @Autowired
    HeroService heroService;



    @GetMapping("/hero")
    public Hero getHero(@RequestParam String name) {
        Hero hero = heroService.getHeroByName(name);
        if (hero == null) {
            return null;
        } else {
            return hero;
            // return heroTest;
        }
    }
}
