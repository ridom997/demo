package com.ridomz.app.demo.service;

import com.ridomz.app.demo.entity.BusinessTypeEntity;
import com.ridomz.app.demo.repository.BusinessTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessTypeService {

    @Autowired
    private BusinessTypeRepository businessTypeRepository;

    public BusinessTypeEntity add(BusinessTypeEntity businessTypeEntity) {
        return businessTypeRepository.save(businessTypeEntity);
    }
}
