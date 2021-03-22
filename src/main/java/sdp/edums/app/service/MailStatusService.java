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

    public int createMailStatus(MailStatus mailStatus){
        if (mailStatus.getMail() == null || mailStatus.getStatusId()==null){
            return 0;
        }else {
            try {
                mailStatus.setId(UUID.randomUUID().toString());
                mailStatusRepository.save(mailStatus);
                return 1;
            }catch (Exception ex){
                return 0;
            }

        }

    }

    public List<MailStatus> fetchAllMailStatuses(){
        return mailStatusRepository.findAll();
    }
}
