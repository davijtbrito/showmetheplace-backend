package com.showmetheplace.showmetheplace.domain.customer;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Crud;
import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@Service
public class CustomerService implements Crud {
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Dto create(Dto dto) {
        CustomerDto customerDto = (CustomerDto) dto;

        CustomerEntity customer = this.customerRepository.save(new CustomerEntity(customerDto.getName(),
                customerDto.getEmail(), customerDto.getPhone(), customerDto.isAllowTip()));

        return customerMapper.entityToDto(customer);
    }

    @Override
    public Dto update(Dto dto) {        

        CustomerDto customerDto = (CustomerDto) dto;

        Optional<CustomerEntity> customer = this.customerRepository.findById(customerDto.getId());

        this.customerRepository.save(new CustomerEntity(customerDto.getId(),
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
        Optional<CustomerEntity> customer = this.customerRepository.findById(idEntity);

        if (customer.isPresent()) {
            this.customerRepository.save(new CustomerEntity(idEntity,
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
    public Page<Dto> getAll(Pageable pageable) {

        Page<CustomerEntity> customerPage = this.customerRepository.findAll(pageable);

        return customerPage.map(c -> {
            CustomerDto dto = new CustomerDto();
            dto.setId(c.getId());
            dto.setName(c.getName());
            dto.setEmail(c.getEmail());
            dto.setPhone(c.getPhone());
            dto.setAllowTip(c.isAllowTip());

            return dto;
        });        
    }

}
