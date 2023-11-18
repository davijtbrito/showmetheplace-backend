package com.showmetheplace.showmetheplace.domain.helper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.showmetheplace.showmetheplace.design.interfaces.Crud;
import com.showmetheplace.showmetheplace.design.interfaces.Dto;

@Service
public class HelperService implements Crud {

    @Override
    public Dto create(Dto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Dto update(Dto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean remove(Long idEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public Page<Dto> getAll(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
