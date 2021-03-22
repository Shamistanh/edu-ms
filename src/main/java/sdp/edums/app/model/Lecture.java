package sdp.edums.app.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Transactional
public class Lecture {

    @Id
    @Column(name = "asg_id")
    private String id;

    @NotNull
    @Column(name = "course_id")
    private String courseId;

    @Column(name = "subject")
    private String subject;

    @Column(name = "lecture")
    private String lecture;
}
