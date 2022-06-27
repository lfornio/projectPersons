package ru.test.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.test.webapp.models.Person;
import ru.test.webapp.services.PersonsService;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/persons")
public class RestPersonController {

    private final PersonsService personsService;

    @Autowired
    public RestPersonController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping
    public Iterable<Person> getPersons(){
        Iterable<Person> persons = personsService.getAllPersons();
        List<Person> tmp = new ArrayList<>();
        for (Person person : persons) {
            tmp.add(new Person(person.getId(), person.getName().substring(0, 1), person.getSurname()));
        }
        if(tmp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "List is empty");
        }
        return tmp;
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id){
        Optional<Person> person = personsService.getPersonById(id);
        if(!person.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User is not found");
        }
        return person.get();
    }

    @PostMapping("/new")
    public Map<String, Long> addPerson(@RequestBody @Valid Person person){
        if(person.getId() != null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Do not send id");
        }
        personsService.addPersonRest(person);
        Map<String, Long> tmp = new HashMap<>();
        tmp.put("id", person.getId());
        return tmp;
    }
}
