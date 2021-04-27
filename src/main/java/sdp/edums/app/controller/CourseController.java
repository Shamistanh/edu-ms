package sdp.edums.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping(value = "createCourse", consumes = MediaType.APPLICATION_JSON_VALUE)
    public int createCourse(@RequestBody Course course) {
        log.info("postMapping -> /createCourse " + course);

        return courseService.createCourse(course);

    }

}
