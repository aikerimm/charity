package com.example.volunteering.controller;

import com.example.volunteering.dto.CreateVolunteeringRequest;
import com.example.volunteering.dto.Request;
import com.example.volunteering.service.RequestService;
import com.sun.istack.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/volunteering/request")
@Api("request")
@RestController
public class RequestController {
    @Autowired
    private RequestService requestService;

    @PostMapping
    @ApiOperation("create request")
    public Long create(
            @RequestBody @NotNull CreateVolunteeringRequest request
    ) {
        return requestService.create(request);
    }
}
