# content_calendar


# steps in create latest spring boot
    
    * 1. Create model Content(record)
        -  define contents column
        -  add Status and type column (enum)

    * 2. create Controller for Content  
        - Annotate with @restController 
        - Annoate with @requestMapping 
            -(define your endpoint)

    * 3. create Repository
        - Create contentCollection repository
        - Annotate it with @Repository
        - add private final variable List Content 
            private final List<Content>
            public ContentCollectionRepository(){}
            public List<Content> findall(){ return content; }
            public Optional<Content> findById(Integer id){
            return content.stream().filter(c->c.id().equals(id)).findFirst();
            }
https://github.com/kiddogreed/content_calendar/blob/d6c56729b581fe382afe0741b508ae7bed9848f0/content-calendar/src/main/java/spr3/web/contentcalendar/repository/ContentCollectionRepository.java#L12-L25
    
    * 4. back at Content controller 
        - private ContentCollectionRepository repository;
        - generate constructor
        - annotate with @Getmapping("")
            public List<Content> findAll();
            return reposity.findAll();

        
