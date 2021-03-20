package sdp.edums.app.service;

import org.springframework.stereotype.Service;
import sdp.edums.app.model.Course;
import sdp.edums.app.model.MailStatus;
import sdp.edums.app.repository.MailStatusRepository;

import java.util.List;
import java.util.UUID;

@Service
public class MailStatusService {

    private final MailStatusRepository mailStatusRepository;

    public MailStatusService(MailStatusRepository mailStatusRepository) {
        this.mailStatusRepository = mailStatusRepository;
    }

    public void createMailStatus(MailStatus mailStatus){
        mailStatus.setId(UUID.randomUUID().toString());
        mailStatusRepository.save(mailStatus);
    }

    public List<MailStatus> fetchAllMailStatuses(){
        return mailStatusRepository.findAll();
    }
}
