package com.showmetheplace.showmetheplace.domain.call;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/call")
public class CallController {
    
    @Autowired
    private CallService callService;

    @PostMapping("/makeCall")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> makeCall(@RequestBody CallCreateRequest request) throws Exception{

        if (this.callService.findByCustomer(request.getCustomerId()) != null){
            return ResponseEntity.badRequest().body("An active call already exists");
        }

        return ResponseEntity.ok(this.callService.call(request.getCustomerId(), request.getPlaceId()));
    }
}
