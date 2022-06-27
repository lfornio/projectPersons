package ru.test.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.test.webapp.models.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Long> {
}
