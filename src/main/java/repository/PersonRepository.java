package repository;

import entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Person JPA repository.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

  UserDetails findByUsername(String username);
}
