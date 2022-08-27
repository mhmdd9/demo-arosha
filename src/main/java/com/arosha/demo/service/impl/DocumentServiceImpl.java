package com.arosha.demo.service.impl;

import com.arosha.demo.dao.DocumentRepo;
import com.arosha.demo.model.Document;
import com.arosha.demo.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepo documentRepo;

    @Override
    public Document save(Document document) {
        return documentRepo.save(document);
    }

    @Override
    public void save(List<Document> documentList) {
        documentRepo.saveAll(documentList);
    }

    @Override
    public List<Document> findAll() {
        return documentRepo.findAll();
    }

    @Override
    public Document findByCode(String code) {
        return documentRepo.findByCode(code);
    }

    @Override
    public void deleteByCode(String code) {
        Document doc = documentRepo.findByCode(code);
        if(doc != null)
            documentRepo.delete(doc);
    }
}
