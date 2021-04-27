package sdp.edums.app.mail;


import lombok.Getter;

import java.util.Date;

@Getter
public class MailDetails {
    private String courseName="";
    private Date date = new Date();

    public  MailDetails(String courseName){
        this.courseName = courseName;
    }



    private final String MailSubject = "Yeni Kursun Yaradılması";
    private final String MailContent = "kursunuz ugurla yaradılmısdır "+"<br><br>"+"Yaradilma tarixi: "+ date+"<br><br>"+"Hörmetle,"+"<br><br>"+"EducationApp Komandası";

}
