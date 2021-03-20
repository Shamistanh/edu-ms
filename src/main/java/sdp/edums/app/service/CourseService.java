package sdp.edums.app.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import sdp.edums.app.model.Course;
import sdp.edums.app.repository.CourseRepository;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void createCourse(Course course){
        course.setId(UUID.randomUUID().toString());
        log.info("Create Course "+course);
        courseRepository.save(course);
    }

    public List<Course> fetchAllCourses(){
        return courseRepository.findAll();
    }
}
