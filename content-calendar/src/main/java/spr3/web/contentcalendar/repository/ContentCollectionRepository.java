package spr3.web.contentcalendar.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import spr3.web.contentcalendar.model.Content;
import spr3.web.contentcalendar.model.Status;
import spr3.web.contentcalendar.model.Type;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){
        return  contentList;
    }

    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c->c.id().equals(id)).findFirst();

    }

    public  void save(Content content){
        contentList.removeIf(c ->c.id().equals(content.id()));
        contentList.add(content);
    }

    @PostConstruct
    private void init(){
        Content content = new Content(
                1,
                "first blog post",
                "sample text place holder",
                Status.IDEA,
                Type.ARTICLE,
                LocalDate.now(),
                null,
                "www.example69.com.zxc");

        contentList.add(content);
    }



    public boolean existById(Integer id) {
        return contentList.stream().filter(c->c.id().equals(id)).count() ==1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
