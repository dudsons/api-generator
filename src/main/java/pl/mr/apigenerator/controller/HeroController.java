package pl.mr.apigenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mr.apigenerator.model.Hero;
import pl.mr.apigenerator.service.HeroService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/test")
public class HeroController {

    @Autowired
    HeroService heroService;

    @GetMapping("/hero")
    public ResponseEntity<?> getHero(@RequestParam String name) {
        Hero hero = heroService.getHeroByName(name);
        if (hero == null) {
            return ResponseEntity.badRequest().body("There is no hero with name " + name);
        } else {
            return ResponseEntity.ok(hero);
        }
    }
}
