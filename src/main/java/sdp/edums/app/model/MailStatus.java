package sdp.edums.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MailStatus {

    @Id
    @Column(name = "m_id")
    private String id;

    @Email
   // @NotNull
    @Column(name = "mail")
    private String mail;

    //@NotNull
    @Column(name = "statusId")
    private String statusId;
}
