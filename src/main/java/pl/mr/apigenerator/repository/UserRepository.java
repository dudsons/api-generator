package pl.mr.apigenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mr.apigenerator.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
