package sdp.edums.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdp.edums.app.model.Assignment;
import sdp.edums.app.model.Lecture;

import java.util.List;

public interface LectureRepository extends JpaRepository<Lecture, Integer> {

    List<Lecture> findAllByCourseId(String courseId);
}
