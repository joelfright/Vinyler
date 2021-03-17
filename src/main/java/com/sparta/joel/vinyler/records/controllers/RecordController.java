package com.sparta.joel.vinyler.records.controllers;

import com.sparta.joel.vinyler.records.entities.RecordEntity;
import com.sparta.joel.vinyler.records.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    private final RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping("/admin/added")
    public void addRecord(RecordEntity recordEntity){
        recordService.addNewRecord(recordEntity);
    }

}
