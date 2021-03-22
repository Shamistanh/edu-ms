package sdp.edums.app.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Assignment {

    @Id
    @Column(name = "asg_id")
    private String id;

    @NotNull
    @Column(name = "course_id")
    String courseId;

    @NotNull
    @Column(name = "deadline")
    String deadline;

    @Column(name = "point")
    String point;

    @Column(name = "file_name")
    String fileName;
}
