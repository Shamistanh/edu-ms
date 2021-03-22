package sdp.edums.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdp.edums.app.model.Assignment;

import java.util.List;

public interface AssignmentRepository  extends JpaRepository<Assignment, Integer> {

    List<Assignment> findAllByCourseId(String courseId);
}
