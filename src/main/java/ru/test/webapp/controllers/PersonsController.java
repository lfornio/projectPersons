package ru.test.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.test.webapp.models.Person;
import ru.test.webapp.repositories.PersonsRepositoryDao;

import java.util.List;

@Controller
public class PersonsController {

    private final PersonsRepositoryDao personsRepositoryDao;

    @Autowired
    public PersonsController(PersonsRepositoryDao personsRepositoryDao) {
        this.personsRepositoryDao = personsRepositoryDao;
    }


    @GetMapping("/persons/new")
    public String getPageForAddNewPerson(){
        return "new/new";
    }

    @PostMapping("/persons/add")
    public String addNewPerson(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               Model model) {
        System.out.println(firstName + " " + lastName);

        Person person = new Person(firstName, lastName);
        personsRepositoryDao.addPerson(person);
        System.out.println(personsRepositoryDao.getAllPersons());
        model.addAttribute("person", person);

        return "new/success";
    }

    @GetMapping("/persons")
    public String getAllPersonsPage(Model model){
        List<Person> persons = personsRepositoryDao.getAllPersons();
        model.addAttribute("persons", persons);
        return "";
    }
}

