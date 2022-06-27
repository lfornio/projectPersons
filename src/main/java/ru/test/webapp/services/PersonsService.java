package ru.test.webapp.services;

import ru.test.webapp.models.Person;
import java.util.Optional;

public interface PersonsService {
    void addPersonRest(Person person);
    Iterable<Person> getAllPersons();
    Optional<Person> getPersonById(Long id);
}
