# content_calendar
    this an backend application with crud functionality using springboot 3


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
<br><br>
   * https://github.com/kiddogreed/content_calendar/blob/a17dcc15ad7c572c6073ca33e3d7bdbfbb8d93e0/content-calendar/src/main/java/spr3/web/contentcalendar/repository/ContentCollectionRepository.java#L31-L44
   # @Construct Annotation
   <br><br>
   https://github.com/kiddogreed/content_calendar/blob/d6c56729b581fe382afe0741b508ae7bed9848f0/content-calendar/src/main/java/spr3/web/contentcalendar/repository/ContentCollectionRepository.java#L12-L25
<br><br>    
4. Back at Content controller 
   * private ContentCollectionRepository repository;
   * generate constructor
   * annotate with @Getmapping("")
       public List<Content> findAll();
           return reposity.findAll();
   https://github.com/kiddogreed/content_calendar/blob/f9b318af528e92721c41cb463e12bba46fb7b029/content-calendar/src/main/java/spr3/web/contentcalendar/controller/ContentController.java#L20-L23

   <br>
* get byid  method with exception handling
  https://github.com/kiddogreed/content_calendar/blob/a17dcc15ad7c572c6073ca33e3d7bdbfbb8d93e0/content-calendar/src/main/java/spr3/web/contentcalendar/controller/ContentController.java#L34-L37

* create save method in ContentCollection Repository
  https://github.com/kiddogreed/content_calendar/blob/a17dcc15ad7c572c6073ca33e3d7bdbfbb8d93e0/content-calendar/src/main/java/spr3/web/contentcalendar/repository/ContentCollectionRepository.java#L46-L48

* create post method save and add @PostMapping annotation


# Endpoints
http://localhost:8082/   home
http://localhost:8082/v1/api/content  get all
http://localhost:8082/  get by id
http://localhost:8082/  create



#  reference
    1. Moddle doc -Code Indention   
[Code Indention](https://docs.moodle.org/402/en/Markdown#:~:text=Bullet%20point%20lists%20can%20be,and%20should%20not%20be%20forgotten)
      
    2. Reference Code - github
[Github code](https://www.stevemar.net/github-code-in-readme/#:~:text=Here's%20a%20quick%20way%20to,show%20up%20in%20your%20README.&text=Go%20to%20the%20source%20code,in%20all%20of%20its%20glory!)
    
    3. Creating Links - url
[ref](https://anvilproject.org/guides/content/creating-links#:~:text=Markdown%20syntax%20for%20a%20hyperlink,the%20parentheses%20hold%20the%20link.)