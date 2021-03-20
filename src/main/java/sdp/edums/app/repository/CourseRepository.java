package sdp.edums.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdp.edums.app.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
