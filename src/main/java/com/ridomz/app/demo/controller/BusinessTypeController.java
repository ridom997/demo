package com.ridomz.app.demo.controller;

import com.google.gson.Gson;
import com.ridomz.app.demo.dto.response.BusinessTypeResponseRecord;
import com.ridomz.app.demo.entity.BusinessTypeEntity;
import com.ridomz.app.demo.service.BusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/businessType")
public class BusinessTypeController {

    @Autowired
    private BusinessTypeService businessTypeService;

    @PostMapping
    public BusinessTypeEntity addBusinessTypeController(@RequestBody BusinessTypeEntity businessTypeEntity) {
        return businessTypeService.add(businessTypeEntity);
    }

    @GetMapping
    public ResponseEntity<?> getBusinessTypeController(
            @RequestParam(required = false) Long id,
            @RequestParam(required = false, defaultValue = "0") int index,
            @RequestParam(required = false, defaultValue = "10") int size) {
        if (id != null) {
            return new ResponseEntity<>(businessTypeService.getById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(businessTypeService.get(index, size), HttpStatus.OK);
        }

    }
}
