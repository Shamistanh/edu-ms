package sdp.edums.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdp.edums.app.model.Course;
import sdp.edums.app.service.CourseService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("fetchAllCourses")
    public List<Course> findAllCourses() {
        log.info("getMapping -> /findAllCourses");
        return courseService.fetchAllCourses();
    }
    @PostMapping("createCourse")
    public int createCourse(Course course){
        log.info("postMapping -> /createCourse");
        try {
            courseService.createCourse(course);
        }catch (Exception ex){
            log.error("Error occurred in createCourse with message:"+ ex);
        }
        return 1;

    }

}
