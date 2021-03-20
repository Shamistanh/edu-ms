package sdp.edums.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdp.edums.app.model.MailStatus;
import sdp.edums.app.service.MailStatusService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api")
public class MailStatusController {

    private final MailStatusService mailStatusService;

    public MailStatusController(MailStatusService mailStatusService) {
        this.mailStatusService = mailStatusService;
    }

    @GetMapping("fetchAllMailStatuses")
    public List<MailStatus> findAllMailStatuses() {
        log.info("getMapping -> /fetchAllMailStatuses");
        return mailStatusService.fetchAllMailStatuses();
    }
    @PostMapping("createMailStatus")
    public int createCourse(MailStatus mailStatus){
        log.info("postMapping -> /createMailStatus");
        try {
            mailStatusService.createMailStatus(mailStatus);
        }catch (Exception ex){
            log.error("Error occurred in createMailStatus with message:"+ ex);
        }
        return 1;

    }
}
