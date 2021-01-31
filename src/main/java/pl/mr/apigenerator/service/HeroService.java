package pl.mr.apigenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mr.apigenerator.model.Hero;
import pl.mr.apigenerator.repository.HeroRepository;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public Hero getHeroByName(String name) {
        return heroRepository.findByName(name);
    }

}
