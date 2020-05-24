package com.example.volunteering.service;

import com.example.volunteering.dto.CreateVolunteeringRequest;
import com.example.volunteering.dto.Request;
import com.example.volunteering.dto.RequestStatus;
import com.example.volunteering.entity.RequestEntity;
import com.example.volunteering.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
    @Autowired
    private RequestRepository requestRepository;

    public Long create(CreateVolunteeringRequest request) {
        RequestEntity savedEntity = requestRepository.save(convert(request));
        return savedEntity.getId();
    }

    private RequestEntity convert(CreateVolunteeringRequest request) {
        RequestEntity entity = new RequestEntity();
        entity.setDescription(request.getDescription());
        entity.setName(request.getName());
        entity.setRequestorUid(request.getRequestorUid());
        entity.setStatus(RequestStatus.NEW.toString());
        return entity;
    }
}
