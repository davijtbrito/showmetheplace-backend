package com.showmetheplace.showmetheplace.controller;

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

import com.showmetheplace.showmetheplace.controller.request.CreateCustomerRequest;
import com.showmetheplace.showmetheplace.controller.request.UpdateCustomerRequest;
import com.showmetheplace.showmetheplace.design.DtoAbstract;
import com.showmetheplace.showmetheplace.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {    

    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")    
    public void create(@RequestBody CreateCustomerRequest request){
        this.customerService.create(request.getDto());
    }

    @PostMapping("/update")    
    public void update(@RequestBody UpdateCustomerRequest request){
        this.customerService.update(request.getDto());
    }

    @DeleteMapping("/remove")
    public void create(@RequestParam Long id){
        this.customerService.remove(id);
    }

    @GetMapping("/findAll")
    public Page<DtoAbstract> findAll(Pageable pageable){
        return this.customerService.getAll(pageable);
    }
}
