package com.gabezk.enviaremail.controllers;

import com.gabezk.enviaremail.models.MailModel;
import com.gabezk.enviaremail.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    MailService mailService;

    @PostMapping
    public String postEmail(@RequestBody MailModel mailModel){
        return mailService.createEmail(mailModel);
    }
}
