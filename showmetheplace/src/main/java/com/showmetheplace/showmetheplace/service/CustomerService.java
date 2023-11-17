package com.showmetheplace.showmetheplace.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.Crud;
import com.showmetheplace.showmetheplace.design.DtoAbstract;
import com.showmetheplace.showmetheplace.dto.CustomerDto;
import com.showmetheplace.showmetheplace.entity.Customer;
import com.showmetheplace.showmetheplace.mapper.CustomerMapper;
import com.showmetheplace.showmetheplace.repository.CustomerRepository;

@Service
public class CustomerService implements Crud {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public DtoAbstract create(DtoAbstract dto) {
        CustomerDto customerDto = (CustomerDto) dto;

        Customer customer = this.customerRepository.save(new Customer(customerDto.getName(),
                customerDto.getEmail(), customerDto.getPhone(), customerDto.isAllowTip()));

        return customerMapper.entityToDto(customer);
    }

    @Override
    public DtoAbstract update(Long idEntity, DtoAbstract dto) {        

        Optional<Customer> customer = this.customerRepository.findById(idEntity);

        CustomerDto customerDto = (CustomerDto) dto;

        this.customerRepository.save(new Customer(idEntity,
                    customerDto.getName(),
                    customerDto.getEmail(),
                    customerDto.getPhone(),
                    customerDto.isAllowTip(),
                    customer.get().isActive(),
                    customer.get().getDateCreated(),
                    LocalDateTime.now()));

        return customer.isPresent() ? customerMapper.entityToDto(customer.get()) : null;
    }

    @Override
    public boolean remove(Long idEntity) {
        Optional<Customer> customer = this.customerRepository.findById(idEntity);

        if (customer.isPresent()) {
            this.customerRepository.save(new Customer(idEntity,
                    customer.get().getName(),
                    customer.get().getEmail(),
                    customer.get().getPhone(),
                    customer.get().isAllowTip(),
                    false,
                    customer.get().getDateCreated(),
                    LocalDateTime.now()));

            return true;

        } else {
            return false;
        }
    }

    @Override
    public List<DtoAbstract> getAll() {

        List<DtoAbstract> dtos = new ArrayList<DtoAbstract>();

        this.customerRepository.findAll().stream().forEach(c -> {
            CustomerDto dto = new CustomerDto();
            dto.setId(c.getId());
            dto.setName(c.getName());
            dto.setEmail(c.getEmail());
            dto.setPhone(c.getPhone());
            dto.setAllowTip(c.isAllowTip());

            dtos.add(dto);
        });

        return dtos;
    }

}
