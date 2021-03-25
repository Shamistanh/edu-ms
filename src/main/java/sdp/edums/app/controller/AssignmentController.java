package sdp.edums.app.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sdp.edums.app.model.Assignment;
import sdp.edums.app.service.AssignmentService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api")
public class AssignmentController {
    private final AssignmentService assignmentService;

    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @GetMapping("fetchAllAssignments")
    public List<Assignment> findAllAssignments() {
        //log.info("getMapping -> /fetchAllAssignments from course with id "+courseId);
        //return assignmentService.fetchAllAssignments(courseId);
        log.info("getMapping -> /fetchAllAssignments ");
        return assignmentService.fetchAllAssignments();
    }

    @PostMapping(value = "createAssignment", consumes = MediaType.APPLICATION_JSON_VALUE)
    public int createCourse(@RequestBody Assignment assignment) {
        log.info("postMapping -> /createAssignment " + assignment);

        return assignmentService.createAssignment(assignment);

    }


}
