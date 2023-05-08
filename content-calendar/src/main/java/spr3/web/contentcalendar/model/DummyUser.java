package spr3.web.contentcalendar.model;

import java.time.LocalDate;

public record DummyUser(
        Integer id,
        String firstName,
        String  middleName,
        String lastName,
        String email,
        Integer age,
        CivilStatus civilStatus,
        UserType  userType,
        LocalDate dateCreated,
        LocalDate dateUpdated,
        String url
) {


}
