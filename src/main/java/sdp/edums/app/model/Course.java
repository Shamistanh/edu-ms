package sdp.edums.app.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data
@Entity
public class Course {

    @Id
    @Column(name = "crs_id")
    private String id;

    @Column(name = "mail")
    @Email
    private String mail;

    @Column(name = "crs_name")
    private String courseName;




}
