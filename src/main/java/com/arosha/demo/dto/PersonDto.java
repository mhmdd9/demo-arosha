package com.arosha.demo.dto;

import com.arosha.demo.model.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PersonDto {

    private String name;
    private List<Document> documents;

}
