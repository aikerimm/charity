package com.example.volunteering.dto;

public class Request {
    private Long id;
    private String name;
    private String description;
    private String requestorUid;
    private String volunteerUid;
    private RequestStatus status;

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

    public String getRequestorUid() {
        return requestorUid;
    }

    public void setRequestorUid(String requestorUid) {
        this.requestorUid = requestorUid;
    }

    public String getVolunteerUid() {
        return volunteerUid;
    }

    public void setVolunteerUid(String volunteerUid) {
        this.volunteerUid = volunteerUid;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }
}
