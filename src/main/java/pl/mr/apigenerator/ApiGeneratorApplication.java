package pl.mr.apigenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mr.apigenerator.service.HeroService;

@SpringBootApplication
public class ApiGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGeneratorApplication.class, args);
    }

}
