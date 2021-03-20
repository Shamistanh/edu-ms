package sdp.edums.app.model;

import lombok.Data;
import javax.validation.constraints.Email;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class MailStatus {

    @Id
    @Column(name = "m_id")
    private String id;

    @Column(name = "mail")
    @Email
    private String mail;

    @Column(name = "status_id")
    private String statusId;
}
