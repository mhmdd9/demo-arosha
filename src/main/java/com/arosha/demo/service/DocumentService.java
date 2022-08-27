package com.arosha.demo.service;

import com.arosha.demo.model.Document;

import java.util.List;

public interface DocumentService {

    Document save(Document document);

    void save(List<Document> documentList);

    List<Document> findAll();

    Document findByCode(String code);

    void deleteByCode(String code);
}
