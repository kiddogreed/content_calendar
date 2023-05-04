package spr3.web.contentcalendar.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import spr3.web.contentcalendar.model.Content;
import spr3.web.contentcalendar.model.Status;
import spr3.web.contentcalendar.model.Type;
import spr3.web.contentcalendar.repository.ContentCollectionRepository;

import java.time.LocalDate;
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
        System.out.println("get all"+repository);
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id){
        System.out.println("get id:"+id);
        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Content Not Found! "));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void  create(@RequestBody Content content){
        System.out.println("created :"+content.title());
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content,@PathVariable Integer id){
       if(repository.existById(id)){
          throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Content Not Found! ");
       }
        System.out.println("updated:"+id);
       repository.save((content));
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        repository.delete(id);

    }
}
