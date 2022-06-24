package ru.test.webapp.repositories;

import ru.test.webapp.models.Person;

import java.util.List;

public interface PersonsRepositoryDao {

     List<Person> getAllPersons();

     Person getPersonByIndex(Integer id);

     void addPerson(Person person);

}
