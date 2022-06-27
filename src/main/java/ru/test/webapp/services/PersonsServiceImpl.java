package ru.test.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.test.webapp.models.Person;
import ru.test.webapp.repositories.PersonDao;

import java.util.Optional;

@Component
public class PersonsServiceImpl implements PersonsService {

    private PersonDao personDao;

    @Autowired
    public PersonsServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void addPersonRest(Person person) {
        personDao.save(person);
    }

    @Override
    public Iterable<Person> getAllPersons() {
        return personDao.findAll();
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return personDao.findById(id);
    }
}
