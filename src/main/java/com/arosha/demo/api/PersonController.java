package com.arosha.demo.api;

import com.arosha.demo.dto.PersonDto;
import com.arosha.demo.model.Person;
import com.arosha.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/find-all")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody PersonDto personDto) {
        personService.save(personDto);
    }
}
