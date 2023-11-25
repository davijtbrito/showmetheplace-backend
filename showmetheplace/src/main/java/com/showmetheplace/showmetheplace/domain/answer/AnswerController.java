package com.showmetheplace.showmetheplace.domain.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/answer")
public class AnswerController {
    
    @Autowired
    private AnswerService answerService;

    @PostMapping("/answerCall")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> answerCall(@RequestBody AnswerCallCreateRequest request){

        if (this.answerService.findByHelperId(request.getHelperId()) != null){
            return ResponseEntity.badRequest().body("An active answer already exists.");
        }

        return ResponseEntity.ok( this.answerService.answerCall(request.getCallId(), request.getHelperId()));
    }
}
