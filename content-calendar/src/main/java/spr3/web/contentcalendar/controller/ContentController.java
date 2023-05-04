package spr3.web.contentcalendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spr3.web.contentcalendar.model.Content;
import spr3.web.contentcalendar.repository.ContentCollectionRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/content")
public class ContentController {
    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> findAll(){

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Content> findById(@PathVariable Integer id){

        return repository.findById(id);
    }


}
