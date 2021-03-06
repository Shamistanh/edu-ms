package sdp.edums.app.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import sdp.edums.app.model.Course;
import sdp.edums.app.repository.CourseRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Log4j2
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    public int createCourse(Course course){
        if (course.getCourseName() == null || course.getMail()==null){
            return 0;
        }else {
            try {
                //course.setId(UUID.randomUUID().toString());
                log.info("Create Course "+course);
                courseRepository.save(course);
                return 1;
            }catch (Exception ex){
                log.error("Error occurred in createCourse with message:"+ ex);
                return 0;
            }


        }

    }

    public List<Course> fetchAllCourses(){
        return courseRepository.findAll();
    }
}
