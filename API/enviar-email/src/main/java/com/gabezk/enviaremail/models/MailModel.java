package com.gabezk.enviaremail.models;

public class MailModel {

    public String from,to,text,subject;

    public MailModel() {
    }

    public MailModel(String from, String to, String text, String subject) {
        this.from = from;
        this.to = to;
        this.text = text;
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
