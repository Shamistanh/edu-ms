package sdp.edums.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdp.edums.app.model.MailStatus;

import javax.transaction.Transactional;

@Repository
public interface MailStatusRepository  extends JpaRepository<MailStatus, Integer> {
}
