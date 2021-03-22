package sdp.edums.app.model;


import lombok.Data;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Transactional
public class Course {

    @Id
    @Column(name = "crs_id")
    private String id;

    @Column(name = "mail")
    @Email
    @NotNull
    private String mail;

    @Column(name = "crs_name")
    @NotNull
    private String courseName;




}
