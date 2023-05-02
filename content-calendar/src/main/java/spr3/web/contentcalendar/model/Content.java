package spr3.web.contentcalendar.model;

import java.time.LocalDate;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type  contentType,
        LocalDate dateCreated,
        LocalDate dateUpdated,
        String url

) {

}
