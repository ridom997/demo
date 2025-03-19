package com.ridomz.app.demo.service;

import com.ridomz.app.demo.dto.response.BusinessTypeResponseRecord;
import com.ridomz.app.demo.entity.BusinessTypeEntity;
import com.ridomz.app.demo.repository.BusinessTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BusinessTypeService {

    @Autowired
    private BusinessTypeRepository businessTypeRepository;

    public BusinessTypeEntity add(BusinessTypeEntity businessTypeEntity) {
        return businessTypeRepository.save(businessTypeEntity);
    }

    public Optional<BusinessTypeResponseRecord> getById(Long id) {
        Optional<BusinessTypeEntity> businessType = businessTypeRepository.findById(id);
        if (businessType.isPresent()) {
            return Optional.of(new BusinessTypeResponseRecord(businessType.get().getName(), businessType.get().getDescription(), businessType.get().getStatus()));
        } else {
            return Optional.empty();
        }
    }

    public Page<BusinessTypeEntity> get(int index, int size) {
        Pageable pageable = PageRequest.of(index, size);
        return businessTypeRepository.findAll(pageable);
    }
}
