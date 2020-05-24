package com.example.volunteering.entity;

import com.example.volunteering.dto.RequestStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "request", schema = "volunteering")
public class RequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long requestorUid;
    private Long volunteerUid;
    private String status;

    public Long getId() {
        return id;
    }

    public void setUid(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRequestorUid() {
        return requestorUid;
    }

    public void setRequestorUid(Long requestorUid) {
        this.requestorUid = requestorUid;
    }

    public Long getVolunteerUid() {
        return volunteerUid;
    }

    public void setVolunteerUid(Long volunteerUid) {
        this.volunteerUid = volunteerUid;
    }
}
