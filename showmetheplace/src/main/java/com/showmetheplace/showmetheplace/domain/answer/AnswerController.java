package com.showmetheplace.showmetheplace.domain.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@RestController
@RequestMapping("/answer")
public class AnswerController {
    
    @Autowired
    private AnswerService answerService;

    @PostMapping("/answerCall")
    @ResponseStatus(HttpStatus.CREATED)
    public Dto answerCall(@RequestBody AnswerCallCreateRequest request){
        return this.answerService.answerCall(request.getCallId(), request.getHelperId());
    }
}
