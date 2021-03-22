package sdp.edums.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sdp.edums.app.model.Assignment;
import sdp.edums.app.model.Lecture;
import sdp.edums.app.service.LectureService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api")
public class LectureController {

    private final LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("fetchAllLectures")
    public List<Lecture> findAllAssignments(@RequestParam("courseId")String courseId) {
        log.info("getMapping -> /fetchAllLectures from course with id "+courseId);
        return lectureService.fetchAllLectures(courseId);
    }

    @PostMapping(value = "createLecture", consumes = MediaType.APPLICATION_JSON_VALUE)
    public int createCourse(@RequestBody Lecture lecture) {
        log.info("postMapping -> /createLecture " + lecture);

        return lectureService.createLecture(lecture);

    }
}
