package ru.test.webapp.repositories;

import org.springframework.stereotype.Component;
import ru.test.webapp.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonsRepositoryDaoImpl implements PersonsRepositoryDao {

    private List<Person> persons;

    {
        persons = new ArrayList<>();
        persons.add(new Person("Elena", "Andreeva"));
        persons.add(new Person("Dasha", "Andreeva"));
    }

    @Override
    public List<Person> getAllPersons() {
        return persons;
    }

    /*
    * можно использовать ArrayList и возвращать Person по индексу,
    * т.к. нет метода удаления пользователя и все пользователи будут
    * последовательно добавляться в массив
    * */
    @Override
    public Person getPersonByIndex(Integer id) {
        if(id < 0 || id >= persons.size()){
            return null;
        }
        return persons.get(id - 1);
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }
}
