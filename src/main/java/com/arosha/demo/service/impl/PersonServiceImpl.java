package com.arosha.demo.service.impl;

import com.arosha.demo.dao.PersonRepo;
import com.arosha.demo.dto.PersonDto;
import com.arosha.demo.model.Person;
import com.arosha.demo.service.DocumentService;
import com.arosha.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepo personRepo;
    private final DocumentService documentService;

    @Override
    public List<Person> findAll() {
        return personRepo.findAll();
    }

    @Override
    public void save(PersonDto personDto) {
        personDto.getDocuments().forEach(documentService::save);

        personRepo.save(new Person(personDto.getName(), new HashSet<>(personDto.getDocuments())));
    }
}
