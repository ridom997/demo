package com.ridomz.app.demo.entity;

import com.ridomz.app.demo.dto.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "business_type")
public class BusinessTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
}