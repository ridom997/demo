package com.ridomz.app.demo.repository;

import com.ridomz.app.demo.entity.BusinessTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessTypeRepository extends JpaRepository<BusinessTypeEntity,Long> {
}
