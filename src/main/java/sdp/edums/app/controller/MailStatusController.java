package sdp.edums.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping(value = "createMailStatus", consumes = MediaType.APPLICATION_JSON_VALUE)
    public int createCourse(@RequestBody MailStatus mailStatus){
        log.info("postMapping -> /createMailStatus "+mailStatus);
            return mailStatusService.createMailStatus(mailStatus);


    }
}
