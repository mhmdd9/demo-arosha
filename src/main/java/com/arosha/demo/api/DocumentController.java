package com.arosha.demo.api;

import com.arosha.demo.model.Document;
import com.arosha.demo.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/document")
@AllArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @GetMapping("/find-all")
    public List<Document> findAll() {
        return documentService.findAll();
    }

    @GetMapping("/find-by-code/{code}")
    public Document findByCode(@PathVariable String code) {
        return documentService.findByCode(code);
    }

    @PostMapping("/save")
    public Document save(@RequestBody Document document) {
        return documentService.save(document);
    }

    @DeleteMapping("/delete/{code}")
    public void deleteByCode(@PathVariable String code) {
        documentService.deleteByCode(code);
    }
}
