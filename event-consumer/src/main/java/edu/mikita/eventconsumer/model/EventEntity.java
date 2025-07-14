package edu.mikita.eventconsumer.model;

import jakarta.persistence.Entity;

@Entity
public class EventEntity {

    private String uid;
    private String subject;
    private String description;

    public String getUid() {
        return uid;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EventEntity{" +
                "uid='" + uid + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
