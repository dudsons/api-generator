package pl.mr.apigenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mr.apigenerator.model.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero,Long> {

     Hero findByName(String name);
}
