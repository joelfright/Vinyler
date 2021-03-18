package com.sparta.joel.vinyler.records.controllers;

import com.sparta.joel.vinyler.records.entities.RecordEntity;
import com.sparta.joel.vinyler.records.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecordController {

    private final RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping("/admin-added")
    public String addRecord(RecordEntity recordEntity){
        recordService.addNewRecord(recordEntity);
        return "index";
    }

    @GetMapping("/index")
    public String getAllRecords(ModelMap modelMap){
        Iterable<RecordEntity> recordEntities = recordService.getAllRecords();
        modelMap.addAttribute("records", recordEntities);
        RecordEntity recommendedRecord = recordService.getRecommendation();
        modelMap.addAttribute("recommendedRecord",recommendedRecord);
        return "index";
    }

    @PostMapping("/index")
    public String getFilteredRecords(@RequestParam(value = "genre") String filter, ModelMap modelMap){
        Iterable<RecordEntity> recordEntities = recordService.getAllRecords();
        modelMap.addAttribute("records", recordEntities);
        RecordEntity recommendedRecord = recordService.getFilteredRecommendation(filter);
        modelMap.addAttribute("recommendedRecord",recommendedRecord);
        return "index";
    }

}
