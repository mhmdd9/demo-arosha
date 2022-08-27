package com.arosha.demo.service;

import com.arosha.demo.dto.PersonDto;
import com.arosha.demo.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    void save(PersonDto personDto);
}
