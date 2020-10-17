package br.com.jlsj.sprinhibernate.springAndHibernate.controller;

import br.com.jlsj.sprinhibernate.springAndHibernate.model.Person;
import br.com.jlsj.sprinhibernate.springAndHibernate.model.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public Person postPerson(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam(required = false) String birthDate
    ){
        Person person = new Person(
                name,
                email,
                birthDate
        );

        this.personRepository.save(person);
        return person;
    }

    @GetMapping("/{id}")
    public Person getPerson(
            @PathVariable Long id
    ){
        if(this.personRepository.findById(id).isPresent()){
            Person person = this.personRepository.findById(id).get();
            return person;
        };

        return null;
    }

    @GetMapping
    public List<Person> getPeople(){
        List<Person> personList = new ArrayList<>();
        this.personRepository.findAll().forEach(
            personList::add
        );

        return personList;
    }

    @PutMapping("/{id}")
    public Person putPerson(
            @PathVariable Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String birthDate
    ){
        if(this.personRepository.findById(id).isPresent()){
            Person person = this.personRepository.findById(id).get();

            if(name != null) person.setName(name);
            if(email != null) person.setEmail(email);
            if(birthDate != null) person.setUnformattedBirthDate(birthDate);

            this.personRepository.save(person);
            return person;
        };

        return null;
    }

    @DeleteMapping("/{id}")
    public Person deletePerson(
            @PathVariable Long id
    ){
        if(this.personRepository.findById(id).isPresent()){
            Person person = this.personRepository.findById(id).get();
            this.personRepository.delete(person);
            return person;
        };

        return null;
    }
}
