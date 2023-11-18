package com.showmetheplace.showmetheplace.domain.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@RestController
@RequestMapping("/helper")
public class HelperController {
    
    @Autowired
    private HelperService helperService;

    @PostMapping("/create")    
    public void create(@RequestBody HelperCreateRequest request){
        this.helperService.create(request.getDto());
    }

    @PostMapping("/update")    
    public void update(@RequestBody HelperUpdateRequest request){
        this.helperService.update(request.getDto());
    }

    @DeleteMapping("/remove")
    public void create(@RequestParam Long id){
        this.helperService.remove(id);
    }

    @GetMapping("/findAll")
    public Page<Dto> findAll(Pageable pageable){
        return this.helperService.getAll(pageable);
    }
}
