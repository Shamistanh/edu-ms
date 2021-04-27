package sdp.edums.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import sdp.edums.app.model.Lecture;
import sdp.edums.app.model.MailStatus;
import sdp.edums.app.repository.LectureRepository;
import sdp.edums.app.repository.MailStatusRepository;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@WebMvcTest(MailStatusService.class)
public class MailStatusServiceTest {

    @MockBean
    MailStatusRepository mailStatusRepository;

    @MockBean
    LectureRepository lectureRepository;

    @Autowired
    MailStatusService mailStatusService;




    @Test
    public void createMailStatusTest() {
        MailStatus mailStatus = new MailStatus();
        mailStatus.setStatusId("aaa");
        mailStatus.setMail("aaaa");
        mailStatusService.createMailStatus(mailStatus);
        verify(mailStatusRepository).save(any(MailStatus.class));
    }

}