package com.gabezk.enviaremail.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {

    @Autowired
    JavaMailSender javaMail;

    public void sendEmail(String from, String to, String subject, String text){
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(from);
        mail.setTo(to);
        mail.setSubject(subject);
        mail.setText(text);
        javaMail.send(mail);

    }

}
