package com.arosha.demo;

import com.arosha.demo.dto.PersonDto;
import com.arosha.demo.model.Document;
import com.arosha.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class InitialDataStore {

    private final PersonService personService;

    @PostConstruct
    public void createAndStoreData() {

        Document document1 = new Document("document1", "d01");
        Document document2 = new Document("document2", "d02");
        Document document3 = new Document("document3", "d03");

        personService.save(new PersonDto("Sina", Arrays.asList(document1, document2)));
        personService.save(new PersonDto("Ehsan", Arrays.asList(document2, document3)));
        personService.save(new PersonDto("Sara", Arrays.asList(document1, document2, document3)));
    }
}
