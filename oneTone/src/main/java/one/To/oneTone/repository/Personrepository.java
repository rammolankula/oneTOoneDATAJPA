package one.To.oneTone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.To.oneTone.domain.Person;
@Repository
public interface Personrepository extends JpaRepository<Person, Integer> {

}
