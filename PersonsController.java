package ru.webapp.test.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.webapp.test.models.Person;
import ru.webapp.test.repositories.PersonsRepositoryDao;

import java.util.List;

@Controller
public class PersonsController {

//    private final PersonsRepositoryDao personsRepositoryDao;
//
//    @Autowired
//    public PersonsController(PersonsRepositoryDao personsRepositoryDao) {
//        this.personsRepositoryDao = personsRepositoryDao;
//    }

    @GetMapping("/users")
    public String getUserPage(){
        return "users";
    }

//    @GetMapping("/new")
//    public String getPageForAddNewPerson(){
//        System.out.println("1");
//        return "users";
//    }

//    @PostMapping("/persons/new")
//    public String addNewPerson(@RequestParam("firstName") String firstName,
//                               @RequestParam("lastName") String lastName) {
//        System.out.println(firstName + " " + lastName);
//
//        return "redirect:/index.html";
//    }

//    @GetMapping("/persons")
//    public String getAllPersonsPage(Model model){
//        List<Person> persons = personsRepositoryDao.getAllPersons();
//        model.addAttribute("persons", persons);
//        return "persons_add";
//    }
}
