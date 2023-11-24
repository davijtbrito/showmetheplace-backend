package com.showmetheplace.showmetheplace.domain.call;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@RestController
@RequestMapping("/call")
public class CallController {
    
    @Autowired
    private CallService callService;

    @PostMapping("/makeCall")
    @ResponseStatus(HttpStatus.CREATED)
    public Dto makeCall(@RequestBody CallCreateRequest request){
        return this.callService.call(request.getCustomerId(), request.getPlaceId());
    }
}
