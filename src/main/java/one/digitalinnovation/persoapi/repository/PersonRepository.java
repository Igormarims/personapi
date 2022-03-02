package one.digitalinnovation.persoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.persoapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
