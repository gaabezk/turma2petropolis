package com.gabezk.enviaremail.services;

import com.gabezk.enviaremail.configuration.MailConfig;
import com.gabezk.enviaremail.models.MailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    MailConfig mailConfig;

    public String createEmail(MailModel mailModel){
        mailConfig.sendEmail(mailModel.getFrom(), mailModel.getTo(), mailModel.getSubject(), mailModel.getText());
        return "E-mail enviado com sucesso!";
    }

}
