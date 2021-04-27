package sdp.edums.app.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
public class Assignment {

    @Id
    @Column(name = "asg_id")
    private String id;

    @NotNull
    @Column(name = "course_id")
    private String courseId;

    @NotNull
    @Column(name = "deadline")
    private String deadline;

    @Column(name = "point")
    private String point;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "file_name")
    private String fileName;
}
