package ru.test.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.test.webapp.models.Person;
import ru.test.webapp.services.PersonsService;

import java.util.Optional;

@Controller
@RequestMapping("/persons")
public class PersonsController {

    private final PersonsService personsService;

    @Autowired
    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/new")
    public String getPageForAddNewPerson(){
        return "new/new";
    }

    @PostMapping("/new")
    public String addNewPerson(@ModelAttribute("person") Person person) {
        personsService.addPersonRest(person);
        return "new/success";
    }

    @GetMapping
    public String getAllPersonsPage(Model model){
        Iterable<Person> persons = personsService.getAllPersons();
        model.addAttribute("persons", persons);
        return "all/all";
    }

    @GetMapping("/search")
    public String findPerson(){
        return "search/search";
    }

    @GetMapping("/search/id")
    public String findPersonId(@RequestParam("id") Long id){
        Optional<Person> person = personsService.getPersonById(id);
        return "redirect:/persons/" + id;
    }
//
    @GetMapping("/{id}")
    public String showPerson(@PathVariable("id") Long id, Model model){
        Optional<Person> person = personsService.getPersonById(id);
        if(person.isPresent()) {
            model.addAttribute("person", person.get());
        }
        return "search/person";
    }
}

