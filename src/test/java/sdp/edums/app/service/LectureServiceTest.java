package sdp.edums.app.service;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import sdp.edums.app.model.Assignment;
import sdp.edums.app.model.Lecture;
import sdp.edums.app.repository.AssignmentRepository;
import sdp.edums.app.repository.LectureRepository;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
@WebMvcTest(LectureService.class)
public class LectureServiceTest {

    @MockBean
    LectureRepository lectureRepository;

    @Autowired
    LectureService lectureService;

    @BeforeEach
    void setUp() {

    }

    @Test
    public void createLectureTest() {
        Lecture lecture =new Lecture();
        lecture.setCourseId("aaa");
        lectureService.createLecture(lecture);
        verify(lectureRepository).save(any(Lecture.class));
    }
}