package com.springwithelasticsearch.controller;

import com.springwithelasticsearch.service.MongoDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataReader {

    private final MongoDataService mongoDataService;

    public DataReader( MongoDataService mongoDataService ) {
        this.mongoDataService = mongoDataService;
    }

    @GetMapping("/readAllData")
    public void allInspections()
    {
        mongoDataService.getAllData();
    }
}
