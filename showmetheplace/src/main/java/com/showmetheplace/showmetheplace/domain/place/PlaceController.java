package com.showmetheplace.showmetheplace.domain.place;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@RestController
@RequestMapping("/place")
public class PlaceController {
    
    @Autowired
    private PlaceService placeService;

     @PostMapping("/create")   
     @ResponseStatus(HttpStatus.CREATED)  
    public void create(@RequestBody PlaceCreateRequest request){
        this.placeService.create(request.getDto());
    }

    @PostMapping("/update")    
    @ResponseStatus(HttpStatus.OK) 
    public void update(@RequestBody PlaceUpdateRequest request){
        this.placeService.update(request.getDto());
    }

    @DeleteMapping("/remove")
    @ResponseStatus(HttpStatus.OK) 
    public void create(@RequestParam Long id){
        this.placeService.remove(id);
    }

    @GetMapping("/findAll")
    public Page<Dto> findAll(Pageable pageable){
        return this.placeService.getAll(pageable);
    }
}
