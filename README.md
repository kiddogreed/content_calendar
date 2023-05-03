# content_calendar


# steps in create latest spring boot
    
1. Create model Content(record)
   * define contents column
   * add Status and type column (enum)
<br><br>
2.  Create Controller for Content  
    * Annotate with @restController 
    * Annoate with @requestMapping 
        -(define your endpoint)
<br><br>
3. Create Repository
   * Create contentCollection repository
   * Annotate it with @Repository
   * add private final variable List Content
<br><br>
     private final List<Content>
     public ContentCollectionRepository(){}
     public List<Content> findall(){ return content; }
     public Optional<Content> findById(Integer id){
     return content.stream().filter(c->c.id().equals(id)).findFirst();
     }
   https://github.com/kiddogreed/content_calendar/blob/d6c56729b581fe382afe0741b508ae7bed9848f0/content-calendar/src/main/java/spr3/web/contentcalendar/repository/ContentCollectionRepository.java#L12-L25
<br><br>    
4. Back at Content controller 
   * private ContentCollectionRepository repository;
   * generate constructor
   * annotate with @Getmapping("")
       public List<Content> findAll();
           return reposity.findAll();
   https://github.com/kiddogreed/content_calendar/blob/f9b318af528e92721c41cb463e12bba46fb7b029/content-calendar/src/main/java/spr3/web/contentcalendar/controller/ContentController.java#L20-L23
        
