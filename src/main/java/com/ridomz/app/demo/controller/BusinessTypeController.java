package com.ridomz.app.demo.controller;

import com.google.gson.Gson;
import com.ridomz.app.demo.entity.BusinessTypeEntity;
import com.ridomz.app.demo.service.BusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/businessType")
public class BusinessTypeController {

    @Autowired
    private BusinessTypeService businessTypeService;

    @PostMapping
    public BusinessTypeEntity addBusinessTypeController(@RequestBody BusinessTypeEntity businessTypeEntity){
        return businessTypeService.add(businessTypeEntity);
    }
}
