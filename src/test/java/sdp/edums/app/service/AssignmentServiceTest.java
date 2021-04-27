package sdp.edums.app.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import sdp.edums.app.model.Assignment;
import sdp.edums.app.repository.AssignmentRepository;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
@WebMvcTest(AssignmentService.class)
public class AssignmentServiceTest {

    Assignment assignment;

    @Autowired
    AssignmentService assignmentService;

    @MockBean
    AssignmentRepository assignmentRepository;

    @BeforeEach
    void setUp() {
        assignment = Assignment.builder()
                .courseId("aa")
                .id("bbbb")
                .fileName("filename")
                .build();
    }

    @Test
    void createAssignmentTest() {

        assignmentService.createAssignment(assignment);

        verify(assignmentRepository).save(any(Assignment.class));

    }
}
