package br.com.jlsj.springwebservice.controller;

import br.com.jlsj.springwebservice.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping("/{id}")
    public Person getPerson(
            @PathVariable int id
    ) {
        return new Person(
                id,
                "Zezinho",
                new GregorianCalendar(1194, Calendar.FEBRUARY, 1).getTime()
        );
    }

    @GetMapping
    public List<Person> getPeople(
            @RequestParam(name = "idMaria", required = false) Integer idMaria,
            @RequestParam(name = "idAlencar", required = false) Integer idAlencar
    ) {

        return Arrays.asList(
                new Person(
                        idMaria != null ? idMaria : 1,
                        "Maria",
                        new GregorianCalendar(1958, Calendar.MAY, 13).getTime()
                ),
                new Person(
                        idAlencar != null ? idAlencar : 2,
                        "Alencar",
                        new GregorianCalendar(1949, Calendar.JULY, 15).getTime()
                )
        );
    }
}
